package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow3 {
	public static void main (String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {//익명함수
			//ActionListener인터페이스를 구현한 익명클래스의 객체를 생성하자!
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1, "b1을 클릭했음");
			}
		});
		b1.setText("나를 눌러요");
		b1.setBackground(Color.yellow);//배경색
		b1.setForeground(Color.blue);//글자색
		b1.setBounds(100,90,300,100);//x축,y축,가로,세로
		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		f.add(b1);//Component interface <--JButton
		//클래스의 다형성(업캐스팅,자동형변환 (컴포넌트로 바뀌어서 들어간 것이므로))
		
		JButton b2 = new JButton("나도 눌러요");
		b2.setText("나를 눌러요");
		b2.setBackground(Color.yellow);//배경색
		b2.setForeground(Color.blue);//글자색
		b2.setBounds(100,200,300,100);//x축,y축,가로,세로
		Font font1 = new Font("궁서", Font.BOLD, 30);
		b2.setFont(font1);
		f.add(b1);//Component interface <--JButton
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "b2을 클릭했음");
				
			}
		});
		
		f.setVisible(true);
	}
}
