package test_01.submit.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Unique_On {

	public Unique_On() {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, id, pass);
			Statement stmt = conn.createStatement();

			String sql = "ALTER TABLE emp ADD UNIQUE (empno);";
			stmt.executeUpdate(sql);
			System.out.println("유니크 제약 설정에 성공했습니다.");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("유니크 제약 설정에 실패했습니다.");
			System.out.println("유니크 키가 존재하지 않습니다.");
		}
	}
}