package jdbc;
// select ������ �̿��Ͽ� 2�������ϸ� ���� �Ǵ� 1�� �����ϸ� ���ڸ� system�� ���̰� �ϴ¹��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author hi
 * �л� �߰�
 */

public class JDBC_SELECT {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		

		System.out.print("����(1:����, 2:����):"); //("����(1:����, 2:����):" �� ���̵��� �ϰڴ�.
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		String url  = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw   = "wls2gml2!!";
		String query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
				+ "from students s left outer join duty d\r\n"
				+ "on s.d_idx = d.d_idx"
				+ " where s.s_gender=?"   // gender�� ���� �Է��ϵ��� �������� �ʴ´�.  where s_gender='1' or where s_gender='2'�Ǵ� s_gender �������� ���ڳ��� ������� ������ ������.
				+ " order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC ����̹� �ε�~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			//preparedstatement ��ü ����
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, std_gender);
			
			rs = pstmt.executeQuery();
			//5. ���� ������� ����Ÿ ���
			// ����Ÿ�� �ΰ� �̻�
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd��");
			String std_gender_0 = "";
			while(rs.next()) {//������ ����Ÿ�� �ִ��� Ȯ��.
				if(rs.getString("s_gender").equals("1")) { //1�϶� ���� else ���� ����
					std_gender_0 = "����";
				} else {
					std_gender_0 = "����";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"���л� | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {
					System.out.println(rs.getString("s_idx")
						+" | "+rs.getString("d_name")
						+" | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				}
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