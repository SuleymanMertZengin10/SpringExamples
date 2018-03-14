package dao;

import org.springframework.stereotype.Repository;

import stereotypemodel.Employee;

@Repository //bu annotation önemli yoksa diðer sýnýfta autowired yapamaz...
public class EmployeeDaoImp implements EmployeeDao{

	@Override
	public void insertEmployee(Employee employee) {
     System.out.println("------dao katmanýnda  insert iþlemi gerçekleþti----");
	}
	
}
