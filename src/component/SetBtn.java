package component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class SetBtn extends JButton {
	
	public SetBtn() {
		
		setText("세트");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		Border border = BorderFactory.createLineBorder(new Color(243, 208, 67), 1);
	    setBorder(border); 
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(243, 208, 67));
		setBounds(264, 304, 180, 86);
		
		
	}

}
