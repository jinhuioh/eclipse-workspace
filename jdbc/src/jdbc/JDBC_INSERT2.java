package jdbc;
// insert �ϴ°�.(�л��߰��ϴ°�)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author hi
 * �л� �߰�
 */

public class JDBC_INSERT2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�л��̸�:");
		String std_name = scanner.nextLine();
		System.out.print("����(1:����, 2:����):");
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String url  = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw   = "wls2gml2!!";
		String query = "INSERT INTO students(s_name, s_gender) VALUES (?,?)";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC ����̹� �ε�~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, std_name);
			pstmt.setString(2, std_gender);
			
			int cnt = pstmt.executeUpdate();
			System.out.println("�л��Ѹ� ���~");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}