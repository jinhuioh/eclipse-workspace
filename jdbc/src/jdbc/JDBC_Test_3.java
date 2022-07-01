package jdbc;
// insert �ϴ°�.(�л��߰��ϴ°�)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author hi
 * �л� �߰�
 */

public class JDBC_Test_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("�л��̸�:");
		String std_name = scanner.nextLine();
		System.out.print("����(1:����, 2:����):");
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		Statement  stm = null;
		String url  = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw   = "wls2gml2!!";
		String query = "INSERT INTO students(s_name, s_gender) VALUES ('"
				+std_name+"','"+std_gender+"')";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC ����̹� �ε�~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			stm = con.createStatement();
			stm.execute(query);
			System.out.println("�л��Ѹ� ���~");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(stm != null) {
				try {
					stm.close();
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