package dao;

import org.springframework.stereotype.Repository;

import stereotypemodel.Employee;

@Repository //bu annotation �nemli yoksa di�er s�n�fta autowired yapamaz...
public class EmployeeDaoImp implements EmployeeDao{

	@Override
	public void insertEmployee(Employee employee) {
     System.out.println("------dao katman�nda  insert i�lemi ger�ekle�ti----");
	}
	
}
