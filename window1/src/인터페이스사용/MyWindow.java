package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main (String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			//static메서드로 만들어놓았음
			//자주쓰는 메서드(함수)나 변수는 static으로 만드렁놓음. 메모리에 언제든지 호출할 수 있는 형태로 만들어 놓음.
			//클래스이름으로 언제든 접근해서 쓸 수 있음.
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f,"나를클릭했군요~~");//f는 alert어디에 띄울지.
			}
		});
		b1.setText("나를 눌러요");
		b1.setBackground(Color.yellow);//배경색
		b1.setForeground(Color.blue);//글자색
		
		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		f.add(b1);//Component interface <--JButton
		//클래스의 다형성(업캐스팅,자동형변환 (컴포넌트로 바뀌어서 들어간 것이므로))
		f.setVisible(true);
	}
}
