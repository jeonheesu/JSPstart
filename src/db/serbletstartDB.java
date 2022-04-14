package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class serbletstartDB {

	
	
	public void insert(String userName , String userAddress , int userAge) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String dbURL = "jdbc:mysql://127.0.0.1:3306/servletstartDB?useSSL=false";
		String dbID = "root";
		String dbPW = "rootroot";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);


			String sql = "insert into servletstart(userName, userAddress, userAge) " + " values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, userAddress);
			pstmt.setInt(3, userAge);
			pstmt.executeUpdate();

			System.out.println("servletstart insert() 메서드 실행 완료");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
