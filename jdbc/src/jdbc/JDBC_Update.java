package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_Update {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Connection con = null;//database������ ���� ��ü
		
		Statement stm=null; //SQL���� ������ ������ ���� ��ü	
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
		String query = "UPDATE students SET s_name='ȫ���', s_gender='2' where s_idx=8";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con= DriverManager.getConnection(url, user,pw);
			stm = con.createStatement();
			//stm.execute(query);
			if(stm.executeUpdate(query)>0) {	
				System.out.println("������ ������");
			} else {	
				System.out.println("������ ������");
			}
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		} finally {	
			if(con !=null) {
				System.out.println("Ŀ�ؼ��� ���� ��� ����.");
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ŀ�ؼ��� ����.");
			}
		}
		

	}

}
