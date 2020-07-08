package xm.takeway.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/takeaway_assistant?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	private static final String dbUser = "root";
	private static final String dbPwd = "root";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return java.sql.DriverManager.getConnection(jdbcUrl, dbUser, dbPwd);
	}
}
