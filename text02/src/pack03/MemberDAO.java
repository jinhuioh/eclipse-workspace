package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//크루드
public class MemberDAO {
	//DAO: Data Access Object (데이타베이스에 엑세스해서 처리하는 기능)
	//1.회원가입 (create)
	//2.회원정보검색, 로그인 (read)
	//3.회원정보수정 (update)
	//4.회원탈퇴 (delete)
	//이 작업을 만드는 것을, CRUD(크루드)라고 읽는다.
	public void create(MemberVo vo) throws Exception {
		System.out.println("dao에서 전달받은 값"+vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는"+ id2);
		System.out.println("전달받은 pw는"+ pw2);
		System.out.println("전달받은 name는"+ name2);
		System.out.println("전달받은 tel는"+ tel2);
		
		System.out.println("회원가입 처리 요청됨.");
		
		/* 1.connector(드라이버) 라이브러리 설정*/
		Class.forName("com.mysql.jdbc.Driver");		
		System.out.println("1.드라이버/커넥터 설정 성공!");

		/*2.db 연결: 1) ip+port, 2) username +pw, 3)db명(big)*/
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		Connection con = DriverManager.getConnection(url,user,pass);		
		System.out.println("2.db연결 성공!");

		// 3.sql문을 생성
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3.sql문객체 생성 성공!");
		ps.setString(1, id2);
		ps.setString(2, pw2);
		ps.setString(3, name2);
		ps.setString(4, tel2);
		
		// 4.생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. sql문 전송!");
		
		
	}
	public void login(MemberVo vo) {
		System.out.println("회원로그인 처리 요청됨.");
	}
	public void read(MemberVo vo) {
		System.out.println("회원검색처리 처리 요청됨.");
	}
	public void update(MemberVo vo) {
		System.out.println("회원수정 처리 요청됨.");
	}
	public void delete(MemberVo vo) {
		System.out.println("회원삭제 처리 요청됨.");
	}
}
