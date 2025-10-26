package service;

import java.util.List;

import beans.Employee;

public interface EmployeeService {
	boolean AddNewEmployee();

	List<Employee> DisplayAll();

	boolean RemoveById(int id);

}