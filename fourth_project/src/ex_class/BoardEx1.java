package ex_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Date�� �����ߴµ� �̰� Date��ü ��������� ���ؼ� �׷�. DateŬ���ϱ� util�Է��ϸ� �ȴ�.
		// �ƴϸ� import java.util.Date;�� pakage�ּ� �Ʒ��� ������
			
		
		
		Board board= new Board();	
		board.setIdx(1);	
		board.setId("incarus");
		board.setName("jinhui");
		board.setContents("�ڵ� ����ִ�");
		board.setTitle("�ູ");	
		board.setRgstdate(new Date());	
			
		Board board2=new Board();	
		board2.setIdx(2);	
		board2.setId("aaa779979");
		board2.setName("����");
		board2.setContents("���ع�����λ���");
		board2.setTitle("�ֱ���");	
		board2.setRgstdate(new Date());	
			
		ArrayList<Board> list = new ArrayList<Board>();	
		list.add(board);	
		list.add(board2);	
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy.mm.dd");	//�� ������� ��¥�� �̻ڰ� ����.
		
		for(int i=0;i<list.size();i++) {	
			Board boardreturn = (Board)list.get(i);	
			
			System.out.println("������:"+boardreturn.getIdx());	
			System.out.println("���̵�:"+boardreturn.getId());	
			System.out.println("����:"+boardreturn.getTitle());	
			System.out.println("�̸�:"+boardreturn.getName());	
			System.out.println("����:"+boardreturn.getContents());
			System.out.println("��¥:"+simpleDateFormat.format(boardreturn.getRgstdate()));	
			System.out.println("========================");
		}

	}

}
