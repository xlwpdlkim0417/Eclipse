package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = ("mysql");

		Class.forName("com.mysql.cj.jdbc.Driver"); // 1번

		Connection conn = DriverManager.getConnection(url, id, pass);

		Statement stmt = conn.createStatement();
		String sql = "update emp sal 3000 where empno = 7777";
		int result = stmt.executeUpdate(sql);
		if (result >= 1) {
			System.out.println("입력 성공");

		} else {
			System.out.println("입력 실패");
		}

	}

}
