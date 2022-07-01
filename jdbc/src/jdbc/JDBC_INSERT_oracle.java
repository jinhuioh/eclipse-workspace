
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


public class JDBC_INSERT_oracle {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);      
   
      System.out.print("�л��̸�:");
      String u_name = scanner.nextLine();
      System.out.print("���̵�:");
      String u_id = scanner.nextLine();
      System.out.print("�н�����:");
      String u_pw = scanner.nextLine();
      
      scanner.close();
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
      String url = "jdbc:oracle:thin:@localhost:1521/xe";
      String user = "jspuser";
      String pw = "12345";
      String query ="INSERT INTO users(U_IDX,U_NAME,U_ID,U_PW,U_RGSTDATE) values(USERS_SEQ.NEXTVAL,?,?,?,systimestamp)";
     
   //oracle�� not null�� �����س����� �װ���ü�� �ٲܼ� ���� ���� �Ǿ 
   // value ���� USERS_SEQ.NEXTVAL(������),systimestamp(�ð�)�� �־� �ڵ����� �������� �����϶�� ���Ѿ��Ѵ�.mysql,postgresql�� 
   //�׳� vaulues(?,?,?);�� ���൵ �ȴ�... 
      
      try {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC ����̹� �ε�~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, u_name);
			pstmt.setString(2, u_id);
			pstmt.setString(3, u_pw);
			
			
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