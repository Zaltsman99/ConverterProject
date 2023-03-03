package view;

import javax.swing.JFrame;

import controller.MenubarListener;

public class ConverterFrame extends JFrame{
	ConverterPanel panel = new ConverterPanel();
	MenubarListener listener = new MenubarListener(panel);
	ConverterMenuBar menuBar = new ConverterMenuBar(listener);


public ConverterFrame() {
	add(panel);
	setJMenuBar(menuBar);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,600);
	setLocationRelativeTo(null);
	setResizable(false);
	setVisible(true);
	
	}

}