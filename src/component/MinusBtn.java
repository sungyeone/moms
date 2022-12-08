package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MinusBtn extends JButton {
	
	
	public MinusBtn(NumberLabel label) {
		
		setText("-");
		setFont(new Font("휴먼엑스포", Font.BOLD, 37));
		setBackground(new Color(190, 190, 190));
		setBounds(240, 119, 56, 53);
		
		addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(label.getText()) - 1;
				if(label.getText().equals("" + 1)) {
					return;  
				}
		
				label.setText("" + num);
			    
			}
		});
		
	}

}
