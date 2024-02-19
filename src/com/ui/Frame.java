package com.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class Frame{
	JTextArea textarea;
	Frame(){
		JFrame frame= new JFrame();
		Container contentpane= frame.getContentPane();
		textarea= new JTextArea(20, 30);
		JScrollBar sb= new JScrollBar(ScrollPane.SCROLLBARS_ALWAYS);
		
		textarea.setLineWrap(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 700);
		contentpane.add(textarea);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
