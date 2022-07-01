package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow2 implements ActionListener {//
	static JButton b3;//전역변수 클래스내에 아무곳에서나 사용가능 
	//main이 static변수를 사용하므로 일반클래스변수도 static변수로 지정해줘야 오류가 안생긴다.
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		f.getContentPane().setLayout(null);//null로 해주면 본인마음대로 위치 조정 가능
		Font font = new Font("맑은 고딕", Font.BOLD, 25);//폰트라는 부품을 램에 만들어줌.
		JButton b1 = new JButton();
		b1.setText("나를눌러요");
		f.add(b1);
		b1.setBounds(100,90,300,100);//x축,y축,가로,세로
		b1.setBackground(Color.pink);
		b1.setFont(font);//위에 만들어준 폰트 부품을 써보자
		
		JButton b2 = new JButton();
		b2.setText("나도눌러요");
		f.add(b2);
		b2.setBounds(100,200,300,100);//x축,y축,가로크기,세로크기
		b2.setBackground(Color.blue);
		b2.setFont(font);//위에 만들어준 폰트 부품을 써보자
		
		b3 = new JButton();//전역변수로 위에서 지정해주었으므로 JButton안써도 됨.
		b3.setText("나도눌러요~");
		f.add(b3);
		b3.setBounds(100,310,300,100);//x축,y축,가로크기,세로크기
		b3.setBackground(Color.red);
		b3.setFont(font);//위에 만들어준 폰트 부품을 써보자

		JButton b4 = new JButton();
		b4.setText("나도눌러요~~");
		f.add(b4);
		b4.setBounds(100,420,300,100);//x축,y축,가로크기,세로크기
		b4.setBackground(Color.yellow);
		b4.setFont(font);//위에 만들어준 폰트 부품을 써보자
		
		ClickEvent1 event1 = new ClickEvent1();
		ClickEvent2 event2 = new ClickEvent2();
		
		b1.addActionListener(event1);//b1에 action처리하는 기능을 쓰려면 addActionListener함수를 사용해야함
		//jdk 4500개의 부품중 하나로 클래스 만들때 add버튼 누르고 addActionListener을 추가하면 해당클래스 ClickEvent1은 
		//addActionListener의 규칙에 따라 생성되는것을 볼 수 있다.
		//그 객체를 event1이라고 하고 b1에 넣어실행시키면 버튼을 눌렀을 때 ClickEvent1이 실행되는것을 볼 수 있다.
		b2.addActionListener(event2);//21에 action처리하는 기능을 쓰려면 addActionListener함수를 사용해야함
		
		MyWindow2 event3 = new MyWindow2();
		b3.addActionListener(event3);//b3에 action처리하는 기능을 쓰려면 addActionListener함수를 사용해야함
		b4.addActionListener(event3);//b4에 action처리하는 기능을 쓰려면 addActionListener함수를 사용해야함
		
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b3) {//b3가 main안에서 만들어진 지역변수라서 main밖에 벗어나니까 인식 못해서 b3에서 오류 생김.
			JOptionPane.showMessageDialog(null,"b3를 클릭하셨군요");
		}else {
			JOptionPane.showMessageDialog(null,"b4를 클릭하셨군요");
		}
	}

}
