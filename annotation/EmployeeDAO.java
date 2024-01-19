package com.crud.annotation;

public interface EmployeeDAO {
	//create
	void save(Employee emp);
	//read
	Employee getById(int id);
	//update
	void update(Employee emp);
	//delete
	void delete(int id);
}
