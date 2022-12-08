package component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class SetBtn extends JButton {
	
	public SetBtn() {
		
		setText("세트");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(243, 208, 67));
		setBounds(264, 304, 180, 86);
		
		
	}

}
