package jdbc_mainjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*	
 * 	
 * 	
 * �����ͺ��̽� Ŀ�ؼ� ����
 */

public class Database {
	private Connection con;
	public Database() {	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Mariadb ����̹� �ε�");
			String connurl = "jdbc:mariadb://localhost:3306/sharedb";	
			String user = "sharedb";	
			String pwd = "wls2gml2!!";
			con = DriverManager.getConnection(connurl, user, pwd);
			System.out.println("Mariadb Connection ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {	
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {	
		return con;
	}
	
}
