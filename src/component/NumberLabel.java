package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class NumberLabel extends JLabel {

	
	public NumberLabel() {

		setText("1");
		setFont(new Font("굴림", Font.BOLD, 18));
		setHorizontalAlignment(JLabel.CENTER);
	    Border border = BorderFactory.createLineBorder(new Color(190, 190, 190), 2);
	    setBorder(border); 
	    setBounds(275, 119, 60, 40); 
			
	}

}
