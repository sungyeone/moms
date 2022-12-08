package component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SingleBtn extends JButton  {
	
	public SingleBtn() {

		//JButton singlebtn = new JButton("단품");
		setText("단품");
		setFont(new Font("HY헤드라인M", Font.PLAIN, 18));
		setBackground(new Color(243, 156, 18));
		setForeground(new Color(255, 255, 255));
		setBounds(40, 304, 180, 86);
		
	}

}
