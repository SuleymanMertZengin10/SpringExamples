package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDao;
import stereotypemodel.Employee;

@Service(value="employeeServiceImp")
public class EmployeeServiceImp implements EmployeeService{

	//bunu kullandýðýmýzda getter settera gerek yok bu bizim için objeyi olusturacak
//fakat burda dikkat etmemiz gereken husus EmployeeDao sýnýfýnda sterotype ýn olmasý yoksa
//null pointer hatasý alýrýz
	@Autowired
	private EmployeeDao personDao;

	
	@Override
	public void insertEmployee(Employee employee) {	
		//gerekli configurasyonlarý yapýyoruz.... 
		System.out.println("service katmanýnda gerekli configurasyonlarý yapýyoruz...");
		personDao.insertEmployee(employee);

		
	}
	

}
