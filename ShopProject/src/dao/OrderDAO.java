package dao;

import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Order;

public class OrderDAO extends DBHelper {
	
	private static final OrderDAO INSTANCE = new OrderDAO();
	public static OrderDAO getInstance() {
		return INSTANCE;
	}
	private OrderDAO() {}
	
	public void insertOrder(Order order) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, order.getOrderId());
			psmt.setInt(2, order.getOrderProduct());
			psmt.setInt(3, order.getOrderCount());
			psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Order selectOrder(int orderNo) {
		
		Order order = null;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				order = new Order();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setOrderProduct(rs.getInt(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderDate(rs.getString(5));
			}
			
			closeAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return order;
	}
	
	public List<Order> selectOrders() {
		return null;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
}
