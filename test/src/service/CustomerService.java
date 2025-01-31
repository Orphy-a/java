package service;

import dao.CustomerDAO;
import entity.Customer;

public class CustomerService {
	
	private static final CustomerService INSTANCE = new CustomerService();
	
	public static CustomerService getInstance() {
		return INSTANCE;
	}
	
	public CustomerService () {}
	
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	//회원가입
	public void registerCustomer(Customer customer) {
		dao.insertCustomer(customer);
	}
	
	//로그인
	public void loginCustomer(String custid) {
		return dao.selectCustomer(custid);
	}
	
	
}
