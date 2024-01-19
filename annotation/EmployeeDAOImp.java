package com.crud.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class EmployeeDAOImp implements EmployeeDAO {
	private List<Employee> empList = new ArrayList<Employee>();
	public void save(Employee emp) {
		if (!(empList.contains(emp))) {
			empList.add(emp);
			System.out.println("employee saved successfully");
		} else {
			System.out.println("employee id already exists");
		}
	}
	public Employee getById(int id) {
		for (Employee emp : empList) {
			if (id == emp.getId()) {
				return emp;
			}
		}
		System.out.println("id not found");
		return null;
	}
	public void update(Employee updatedEmp) {
		for (Employee emp : empList) {
			if (emp.getId() == updatedEmp.getId()) {
				emp.setName(updatedEmp.getName());
				emp.setRole(updatedEmp.getRole());
				System.out.println("employee updated successfully");
			} 
		}

	}
	public void delete(int id) {
		for (Employee emp : empList) {
			if (id == emp.getId()) {
				empList.remove(id);
				System.out.println("employee removed successfully");
			}
			else {
				System.out.println("id not found");
				break;
			}
		}
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public List<Employee> getEmpList() {
		return empList;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImp [empList=" + empList + "]";
	}
	


}
