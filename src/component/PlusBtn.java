package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class PlusBtn extends JButton {
	
	public PlusBtn(NumberLabel label) {

		setText("+");
		setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		setBackground(new Color(190, 190, 190));
		setBounds(375, 119, 56, 50);
		Border border = BorderFactory.createLineBorder(new Color(190, 190, 190), 1);
		setBorder(border);

		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(label.getText()) + 1;

				if (label.getText().equals("" + 10)) {
					return;
				}

				label.setText("" + num);
			}
		});
	}
}
