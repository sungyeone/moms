package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PlusBtn extends JButton {
	
	public PlusBtn(NumberLabel label) {

	setText("+");
	setFont(new Font("굴림", Font.BOLD, 33));
	setBackground(new Color(190, 190, 190));
	setBounds(388, 119, 56, 51);

	
	addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {	
			int num = Integer.parseInt(label.getText()) + 1;
			
			if(label.getText().equals("" + 10)) {
				return;
			}
			
			label.setText("" + num);	
		}
	 });		
   }
}
