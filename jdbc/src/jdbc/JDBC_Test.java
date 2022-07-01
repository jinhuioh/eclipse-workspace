package jdbc;
//null �������ϰ� �ҷ�����.,join�ؼ� �������°�. �����ſ��� timestamp(simpledataformat)�߰�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test {

	public static void main(String[] args) {
		Connection con = null;//database������ ���� ��ü
		
		Statement stm=null; //SQL���� ������ ������ ���� ��ü
		ResultSet rs=null; //SQL���� �����ϰ� ����� �ޱ� ���� ��ü
		
		
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "wls2gml2!!";
		
		
		String query = "select s.s_idx, s.s_name , s.s_gender ,d.d_ranking, d.d_idx , d.d_name,s.s_rgstdate\r\n"
				+ "from students s , duty d \r\n"
				+ "where s.d_idx = d.d_idx  order by d.d_ranking";
		
		// try catch ������ mariadb �� postgresqldb�� ����Ϸ��� 
		//jdbc�������� ����->����Ŭ�� �� properties->libraries->modul path->add external jars-> ���õ�ũc���� lib�������� mysqldb���� �Ǵ� postgresqldb���� ����
		try {
		
			//1.JDBC ����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
		//	Class.forName("org.postgresql.Driver"); �̰� postgresql�� ��밡��!!! 
			System.out.println("JDBC ����̹� �ε� ����~");
		
			
			//2.connection ����
			con =DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
		
			//3. Statement ��ü ����
			stm =con.createStatement();
			
			//4.���� ������ ����� ����
			rs = stm.executeQuery(query);

			
			//5.���� ������� ������ ���
			
			// ���ڵ� ������ �������϶�(while) 
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy��mm��dd��");
			while(rs.next()) {	//������ �����Ͱ� �ִ��� Ȯ��
				if(rs.getString("d_name") ==null) {	
					System.out.println(rs.getString("s_idx")
							+" | "+ 
							rs.getString("s_name")
							+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {	
					System.out.println(rs.getString("s_idx")
							+" | "+ 
							rs.getString("s_name")
							+" | "+ 
							rs.getString("d_name")
							+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
					
				}
			}
		}
				
		
			
			
			
		 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
			//system.out.println("error:"+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally  {
			
			//6.Statement��ü close&��ȯ
			if(stm != null) {	// '!=' �� '�ƴҶ�~'�� ���Ѵ�. '! =' �̷��� ���� �ϸ� ������. �� �ٿ��� ����. 
				// close ������ 2��°�� s��¼�� �װ� Ŭ���ؾ� try catch���� �ڵ�����
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			//7. ResultSet ��ü close&��ȯ 
			if(rs !=null) {	
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//8. Connection����� close&��ȯ
			if(con !=null) {	
				 	
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
 
