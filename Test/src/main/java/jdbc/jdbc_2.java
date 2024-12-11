package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_2 {

	private static void printData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.print(rs.getString("STU_NAME"));
			System.out.print("\t|\t" + rs.getString("STU_NO"));
			System.out.println("\t|\t" + rs.getString("STU_DEPT"));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
			
			System.out.print("이름을 입력하세요 >> ");
			String name = scan.next();
			System.out.print("학번을 입력하세요 >> ");
			int stuNo = scan.nextInt();
			System.out.print("학과를 입력하세요 >> ");
			String dept = scan.next();
			
			String query = 
					"INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) "
					+ "VALUES(" + stuNo + ", '" + name + "', '" + dept + "')";
			stmt.executeUpdate(query);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			printData(rs);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
