package com.crud.beans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
       public static void main(String []args) {
    	   ApplicationContext context=new FileSystemXmlApplicationContext("config.xml");
    	   EmployeeDAOImp employeeImp=context.getBean("empDAO",EmployeeDAOImp.class);
    	   //save the employee
    	   Employee employee=new Employee(3,"bunny","se");
    	   employeeImp.save(employee);
    	   employee=new Employee(4,"kumar","tester");
    	   employeeImp.save(employee);
    	   //retrieve employee
    	   Employee getEmployee=employeeImp.getById(2);
    	   System.out.println(getEmployee);
    	   //update employee
    	   Employee updatedEmployee=new Employee(1,"sree","sdet");
    	   employeeImp.update(updatedEmployee);
    	   //delete employee
    	   employeeImp.delete(5);
    	   //list of employees
    	   List<Employee> list=employeeImp.getEmpList();
    	   System.out.println("list of employees:");
    	   for(Employee emp:list) {
    		   System.out.println(emp);
    	   }
    	   
       }
}
