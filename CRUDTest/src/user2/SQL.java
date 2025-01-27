package user2;

public class SQL {
	
	//SQL
		public static final String INSERT_USER2 = "insert into `user2` values (?,?,?,?)";
		public static final String UPDATE_USER2 = "update `user2` set `name`=?, `hp`=?, `age`=? where `uid` = ?";
		public static final String DELETE_USER2 = "delete from `user2` where `uid`=?";
		public static final String SELECT_USER2_LIST = "select * from `user2`";
		public static final String SELECT_USER2 = "select * from `user2` where `uid`=?";

	
}
