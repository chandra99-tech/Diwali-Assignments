package dao;



import java.util.List;

import beans.Employee;



public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> FindAll();

	boolean DeleteById(int id);

}
