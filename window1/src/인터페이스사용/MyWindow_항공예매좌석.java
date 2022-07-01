//익명클래스 사용법
//항공좌석선택처럼 만들어보자.
package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MyWindow_항공예매좌석 {

	static JButton b3; // 전역변수 , 클래스 내 아무곳에서나 사용가능 전역 변수

	public static void main(String[] args) {
		JLabel label = new JLabel("안녕하세요 지니항공입니다. 원하시는 좌석을 선택해주세요");
		// 라벨글씨 가운데 정렬
		label.setHorizontalAlignment(JLabel.CENTER);
		JFrame f = new JFrame();
		f.add(label);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// pack을 사용하여 글씨를 GUI에 보이도록 하자.
		f.pack();
		f.setVisible(true);
		f.setSize(700, 800);

		// 위치를 내 마음대로 지정할 수 있음.
		f.getContentPane().setLayout(null);
		Font font = new Font("궁서", Font.BOLD, 25);

		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b1, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b1.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b1, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b1.setText("A01");
		b1.setFont(font);
		b1.setBackground(Color.white);
//      b1버튼 생성한 객체를 javaSwing에 추가해주자.
		f.add(b1);
//      b1버튼의 위치를 지정해주자
		b1.setBounds(50, 30, 90, 50);// (가로,세로,버튼크기가로,버튼크기세로)

		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton();
		JButton b8 = new JButton();
		JButton b9 = new JButton();
		JButton b10 = new JButton();
		JButton b11 = new JButton();
		JButton b12 = new JButton();
		JButton b13 = new JButton();
		JButton b14 = new JButton();
		JButton b15 = new JButton();
		JButton b16 = new JButton();
		JButton b17 = new JButton();
		JButton b18 = new JButton();
		JButton b19 = new JButton();
		JButton b20 = new JButton();

		b2.setText("A02");
		b2.setFont(font);
		b2.setBackground(Color.white);

		f.add(b2);
		b2.setBounds(150, 30, 90, 50);

		b2.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b2, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b2.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b2, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		f.add(b3);
		b3.setBounds(250, 30, 90, 50);
		b3.setText("A03");
		b3.setFont(font);
		b3.setBackground(Color.white);

		b3.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b3, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b3.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b3, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b4.setText("A04");
		b4.setFont(font);
		b4.setBackground(Color.white);

		f.add(b4);
		b4.setBounds(350, 30, 90, 50);

		b4.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b4, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b4.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b4, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b5.setText("A05");
		b5.setFont(font);
		b5.setBackground(Color.white);

		f.add(b5);
		b5.setBounds(50, 90, 90, 50);

		b5.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b5, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b5.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b5, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b6.setText("A06");
		b6.setFont(font);
		b6.setBackground(Color.white);

		f.add(b6);
		b6.setBounds(150, 90, 90, 50);

		b6.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b1, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b6.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b6, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b7.setText("A07");
		b7.setFont(font);
		b7.setBackground(Color.white);

		f.add(b7);
		b7.setBounds(250, 90, 90, 50);

		b7.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b7, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b7.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b7, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b8.setText("A08");
		b8.setFont(font);
		b8.setBackground(Color.white);

		f.add(b8);
		b8.setBounds(350, 90, 90, 50);

		b8.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b8, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b8.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b8, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b9.setText("A09");
		b9.setFont(font);
		b9.setBackground(Color.white);

		f.add(b9);
		b9.setBounds(50, 150, 90, 50);

		b9.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b9, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b9.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b9, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b10.setText("A10");
		b10.setFont(font);
		b10.setBackground(Color.white);

		f.add(b10);
		b10.setBounds(150, 150, 90, 50);

		b10.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b10, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b10.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b10, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b11.setText("A11");
		b11.setFont(font);
		b11.setBackground(Color.white);

		f.add(b11);
		b11.setBounds(250, 150, 90, 50);

		b11.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b11, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b11.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b11, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		b12.setText("A12");
		b12.setFont(font);
		b12.setBackground(Color.white);

		f.add(b12);
		b12.setBounds(350, 150, 90, 50);

		b12.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b12, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b12.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b12, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b13.setText("A13");
		b13.setFont(font);
		b13.setBackground(Color.white);

		f.add(b13);
		b13.setBounds(50, 210, 90, 50);

		b13.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b13, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b13.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b13, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b14.setText("A14");
		b14.setFont(font);
		b14.setBackground(Color.white);

		f.add(b14);
		b14.setBounds(150, 210, 90, 50);

		b14.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b12, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b14.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b14, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b15.setText("A15");
		b15.setFont(font);
		b15.setBackground(Color.white);

		f.add(b15);
		b15.setBounds(250, 210, 90, 50);

		b15.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b15, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b15.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b15, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b16.setText("A16");
		b16.setFont(font);
		b16.setBackground(Color.white);

		f.add(b16);
		b16.setBounds(350, 210, 90, 50);

		b16.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b16, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b16.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b16, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b17.setText("A17");
		b17.setFont(font);
		b17.setBackground(Color.white);

		f.add(b17);
		b17.setBounds(50, 270, 90, 50);

		b17.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b17, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b17.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b17, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b18.setText("A18");
		b18.setFont(font);
		b18.setBackground(Color.white);

		f.add(b18);
		b18.setBounds(150, 270, 90, 50);

		b18.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b18, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b18.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b18, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b19.setText("A19");
		b19.setFont(font);
		b19.setBackground(Color.white);

		f.add(b19);
		b19.setBounds(250, 270, 90, 50);

		b19.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b19, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b19.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b19, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});
		b20.setText("A20");
		b20.setFont(font);
		b20.setBackground(Color.white);

		f.add(b20);
		b20.setBounds(350, 270, 90, 50);

		b20.addActionListener(new ActionListener() {

			// ActionListner인터페이스를 구현한 익명클래스의 객체를 생성하자

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(b20, e.getActionCommand() + "좌석 예약하시겠습니까?");

				if (result == JOptionPane.CLOSED_OPTION) {

				} else if (result == JOptionPane.YES_OPTION) {
					b20.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(b20, e.getActionCommand() + "항공권예약이 완료되었습니다");
				} else {

				}
			}
		});

		f.setVisible(true);

	}

}