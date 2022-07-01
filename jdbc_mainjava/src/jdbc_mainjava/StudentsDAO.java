package jdbc_mainjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsDAO {	
		private Connection con;
		private PreparedStatement ps;
		private ResultSet rs;
	public StudentsDAO(Connection con) {	
		this.con = con;
	}
	//�л���� ���ϴ� �Լ�.
	public ArrayList<StudentsVO> list(){	
		ArrayList<StudentsVO> list = new ArrayList<StudentsVO>();
		String query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_phone, s.s_birth, s.s_rgstdate\r\n"
				+ "from students s left join duty d\r\n"
				+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {	
				StudentsVO studentsVO = new StudentsVO();
				
				studentsVO.setS_idx(rs.getInt("s_idx"));
				studentsVO.setS_gender(rs.getString("s_gender"));
				studentsVO.setD_name(rs.getString("d_name"));
				studentsVO.setS_name(rs.getString("s_name"));
				studentsVO.setS_phone(rs.getString("s_phone"));
				studentsVO.setS_birth(rs.getString("s_birth"));
				studentsVO.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				list.add(studentsVO);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	//�л��Ѹ�������ϴ��Լ�.
	public void insert(StudentsVO studentsVO) {	 //StudentsVO studentsVO ��ſ� String s_name,s_gender....�� �ᵵ �ȴ�.
		String query = "INSERT INTO students(s_name, s_gender,s_phone,s_birth)"
		+ " VALUES (?,?,?,?)";

		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1,studentsVO.getS_name());
			ps.setString(2,studentsVO.getS_gender());
			ps.setString(3,studentsVO.getS_phone());
			ps.setString(4,studentsVO.getS_birth());
			if(ps.executeUpdate() > 0) {	
				System.out.println(studentsVO.getS_name()+"�л� �� �� ��ϵ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	
			if(ps !=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
			
	}	
		
	public StudentsVO view(int s_idx) {	
		StudentsVO studentsVO = new StudentsVO();
		String query = "SELECT s.s_idx, s.s_gender, s.s_gender, s.s_name, s.s_phone, s.s_birth, s.d_idx, d.d_name,"
				+" s.s_rgstdate, s.s_mdfydate"
				+" FROM students s LEFT JOIN duty d ON s.d_idx = d.d_idx" 
				+" WHERE s.s_idx = ?";
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
			rs = ps.executeQuery();
			
			if(rs.next()) {	
				studentsVO.setS_idx(rs.getInt("s_idx"));	
				studentsVO.setS_name(rs.getString("s_name"));
				studentsVO.setS_phone(rs.getString("s_phone"));
				studentsVO.setS_birth(rs.getString("s_birth"));
				studentsVO.setS_gender(rs.getString("s_gender"));	
				studentsVO.setD_idx(rs.getInt("d_idx"));	
				studentsVO.setD_name(rs.getString("d_name"));	
				studentsVO.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				studentsVO.setS_mdfydate(rs.getTimestamp("s_mdfydate"));
				
			} else {	
				System.out.println("���ϴ� ����ڰ� �����ϴ�.");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {	
			if(ps !=null) {	
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} if (rs !=null) {	
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return studentsVO;
		
	}
	
	// �л����� �����ϴ� �Լ�!!!
	public void update(StudentsVO studentsVO) {	
		String query ="UPDATE students SET s_name=?,s_gender=?,"
				+" s_phone=?, s_birth=?, s_mdfydate = now() WHERE s_idx=?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, studentsVO.getS_name());
			ps.setString(2, studentsVO.getS_gender());
			ps.setString(3, studentsVO.getS_phone());
			ps.setString(4, studentsVO.getS_birth());
			ps.setInt(5, studentsVO.getS_idx());
			
			if (ps.executeUpdate()>0) {	
				System.out.println(studentsVO.getS_name()+"�л������� �����߽��ϴ�.");
			} else {	
				System.out.println("���ϴ� �л��� �����ϴ�.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		
			if(ps !=null) {	
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
		
	}

//�л� �Ѹ��� �����մϴ�.
	public void delete(int s_idx) {	
		String query = "DELETE FROM students WHERE s_idx=?";	
				
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
			if(ps.executeUpdate()>0) {	
				System.out.println("�л��Ѹ��� �����Ǿ����ϴ�.");
			} else {	
				System.out.println("���ϴ� �л��� �����ϴ�.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	
			if(ps !=null) {	
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}















