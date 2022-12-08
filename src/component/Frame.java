package component;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	SingleBtn singleBtn = new SingleBtn();
	SetBtn setBtn = new SetBtn();
	NumberLabel label = new NumberLabel();
	PlusBtn plusBtn = new PlusBtn(label);
	MinusBtn minusBtn = new MinusBtn(label);
	LineLabel lineLabel = new LineLabel();
	TextLabel textLabel = new TextLabel();
	
	public Frame() {
		
		getContentPane().setForeground(new Color(243, 156, 18));
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 498, 479);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		setVisible(true);
		
		add(singleBtn);
		add(setBtn);	
		add(plusBtn);
		add(label);
		add(minusBtn);
		add(lineLabel);
		add(textLabel);
		
	}
		
	public static void main(String[] args) {
		new Frame();
				
	}
	
}

