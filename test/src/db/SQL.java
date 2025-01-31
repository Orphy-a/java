package db;

public class SQL {
	
	public static final String CUSTOMER_INSERT = "insert into `customer` values (?, ?, ?, ?, now())";
	
	
	public static final String CUSTOMER_SELECT = "select * from `customer` where `custid`=?";
	
	
}
