package db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET "
												+ "`orderId`=?,"
												+ "`orderProduct`=?,"
												+ "`orderCount`=?,"
												+ "`orderDate`=NOW()";
	
	public static final String SELECT_ORDERS = "SELECT * FROM `order`";
	
	
	// product
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` SET "
												+ "`prodName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	
	
	
	
}
