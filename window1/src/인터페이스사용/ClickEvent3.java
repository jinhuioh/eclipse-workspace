package 인터페이스사용;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class ClickEvent3 implements ActionListener {
	//ActionLister의 규칙에 따라서 actionPerformed를 구성하겠어.
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//인터페이스에 정의되어 있었던 추상메서드를 구현해주면 됨.
		JOptionPane.showMessageDialog(null,"n번째 이벤트 처리군요~");
	}

}
