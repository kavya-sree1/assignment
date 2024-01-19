package com.crud.config;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String []args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAOImp employeeDAO=context.getBean(EmployeeDAOImp.class);
		//save the employee
 	   Employee employee=new Employee(1,"bunny","se");
 	   employeeDAO.save(employee);
 	   employee=new Employee(2,"kumar","tester");
 	   employeeDAO.save(employee);
 	   //retrieve employee
 	   Employee getEmployee=employeeDAO.getById(2);
 	   System.out.println(getEmployee);
 	   //update employee
 	   Employee updatedEmployee=new Employee(1,"sree","sdet");
 	   employeeDAO.update(updatedEmployee);
 	   //delete employee
 	   employeeDAO.delete(5);
 	   //list of employees
 	   List<Employee> list=employeeDAO.getEmpList();
 	   System.out.println("list of employees:");
 	   for(Employee emp:list) {
 		   System.out.println(emp);
 	   }
	}

}
