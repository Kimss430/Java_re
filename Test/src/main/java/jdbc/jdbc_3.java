package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_3 {

	 private static void printData(ResultSet rs) throws SQLException {
	 		while (rs.next()) {
	 			System.out.print(rs.getString("ID"));
	 			System.out.print("\t|\t" + rs.getString("NAME"));
	 			System.out.println("\t|\t" + rs.getString("DEPT"));
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
	 			
	 			while(true) {
	 				System.out.print("추가(1), 삭제(2), 수정(3), 확인(4), 끝내기(5)>> ");
	 				String choice = scan.next();
	 				if(choice.equals("1")) {
	 					System.out.print("아이디 입력 : ");
	 					String id = scan.next();
	 					System.out.print("이름 입력 : ");
	 					String name = scan.next();
	 					System.out.print("학과 입력 :  ");
	 					String dept = scan.next();	 					
	 					String query = 
	 							"INSERT INTO TBL_STUDENT(ID, NAME, DEPT) "
	 							+ "VALUES('" + id + "', '" + name + "', '" + dept + " ')";
	 					stmt.executeUpdate(query);
	 					System.out.println("추가되었습니다.");
	 				}
	 				if(choice.equals("2")) {
	 					System.out.print("삭제할 아이디 입력 : ");
	 					String id = scan.next();
	 					String query = "DELETE FROM TBL_STUDENT "
	 							+ "WHERE ID = '" + id + "'";
	 					stmt.executeUpdate(query);
	 					System.out.println("삭제되었습니다.");
	 				}
	 				if(choice.equals("3")) {
	 					System.out.print("아이디 입력 : ");
	 					String id = scan.next();
	 					System.out.print("수정할 학과 입력 : ");
	 					String dept = scan.next();
	 					String query = "UPDATE TBL_STUDENT "
	 							+ "SET DEPT = '" + dept + "' WHERE ID = '" + id + "'";
	 					stmt.executeLargeUpdate(query);
	 					System.out.println("수정되었습니다.");
	 				}
	 				if(choice.equals("4")) {
	 					System.out.println("===== 학생 목록 ====");
	 					String query = "SELECT * FROM TBL_STUDENT";
	 					ResultSet rs = stmt.executeQuery(query);
	 					printData(rs);
	 				}
	 				if(choice.equals("5")) {
	 					System.out.println("종료되었습니다.");
	 					break;
	 				}
	 			}
	 			
	 		} catch (ClassNotFoundException e) {
	 			System.out.println("JDBC 드라이버 로드 오류");
	 		} catch (SQLException e) {
	 			System.out.println("DB 연결 오류");
			}
		}

}
