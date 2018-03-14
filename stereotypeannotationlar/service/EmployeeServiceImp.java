package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDao;
import stereotypemodel.Employee;

@Service(value="employeeServiceImp")
public class EmployeeServiceImp implements EmployeeService{

	//bunu kulland���m�zda getter settera gerek yok bu bizim i�in objeyi olusturacak
//fakat burda dikkat etmemiz gereken husus EmployeeDao s�n�f�nda sterotype �n olmas� yoksa
//null pointer hatas� al�r�z
	@Autowired
	private EmployeeDao personDao;

	
	@Override
	public void insertEmployee(Employee employee) {	
		//gerekli configurasyonlar� yap�yoruz.... 
		System.out.println("service katman�nda gerekli configurasyonlar� yap�yoruz...");
		personDao.insertEmployee(employee);

		
	}
	

}
