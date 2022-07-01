//�����Ѱ�
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class JDBC_SELECT_oracle { 

	public static void main(String[] args) {
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "jspuser";
		String pw = "12345";
		String query = "SELECT * FROM users";
				
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC ����̹� �ε�~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			//preparedstatement ��ü ����
			pstmt = con.prepareStatement(query);

			
			
			rs = pstmt.executeQuery();
			//5. ���� ������� ����Ÿ ���
			// ����Ÿ�� �ΰ� �̻�
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd��");
			
			while(rs.next()) {//������ ����Ÿ�� �ִ��� Ȯ��.
				String u_idx = rs.getString("u_idx");
				String u_name = rs.getString("u_name");
				String u_id = rs.getString("u_id");
				String u_pw = rs.getString("u_pw");
				System.out.println("-----------------------------");
				System.out.println(u_idx+""+"|"+u_name+""+"|"+u_id+""+"|"+u_pw+"");
			}
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