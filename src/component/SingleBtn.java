package component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class SingleBtn extends JButton  {
	
	public SingleBtn() {

		setText("단품");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		Border border = BorderFactory.createLineBorder(new Color(243, 156, 18), 1);
	    setBorder(border); 
		setBackground(new Color(243, 156, 18));
		setForeground(new Color(255, 255, 255));
		setBounds(40, 304, 180, 86);
		
	}

}
