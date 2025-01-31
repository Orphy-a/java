package dao;
import db.DBHelper;
import db.SQL;
import entity.Customer;

public class CustomerDAO extends DBHelper {
	
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}
	
	private CustomerDAO() {}
	
	
	//기본 CURD
	public void insertCustomer(Customer customer) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.CUSTOMER_INSERT);
			psmt.setString(1, customer.getCustId());
			psmt.setString(2, customer.getName());
			psmt.setString(3, customer.getHp());
			psmt.setString(4, customer.getAddr());
			psmt.setString(5, customer.getRdate());
			psmt.executeUpdate();
			
			closeAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void selectCustomer(String custId) {
		
		Customer customer = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.CUSTOMER_SELECT);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
			}
			closeAll();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}