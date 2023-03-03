package main;


import controller.ConvertListener;
import controller.MenubarListener;
import view.ConverterPanel;
import view.ConverterMenuBar;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Converter {

	public static void main(String[] args) {
		
		JFrame convFrame = new JFrame("Converter Project");
		ConverterPanel convPanel = new ConverterPanel();	
		ConvertListener convListener = new ConvertListener(convPanel);
		MenubarListener menubarListener = new MenubarListener(convPanel);
		ConverterMenuBar convMenuBar = new ConverterMenuBar(menubarListener);
		
		convFrame.setJMenuBar(convMenuBar);
		convFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		convFrame.setSize(600, 600);
		
		convPanel.setBackground(Color.BLUE);
		
		convFrame.add(convPanel);
		
		JTextArea MeterConversionArea;
		JTextArea FeetConversionArea;
		JTextArea CentimetersConversionArea;
		
		MeterConversionArea = new JTextArea(1,5);	    // JTextArea()
		MeterConversionArea.setBackground(Color.GREEN);
		MeterConversionArea.setEditable(false);
		MeterConversionArea.setLayout(null);
		MeterConversionArea.setBounds(90,10,200,200);
		MeterConversionArea.append("0 ft");
		MeterConversionArea.setLineWrap(false);
		convPanel.add(MeterConversionArea);
		
		FeetConversionArea = new JTextArea(1, 5);	//JTextArea(int rows, int columns)
		//JTextField tf = new JTextField();
		FeetConversionArea.setBackground(Color.ORANGE);
		FeetConversionArea.setEditable(false);
		FeetConversionArea.setLayout(null);
		FeetConversionArea.setBounds(295,10,200,200);
		FeetConversionArea.append("0 m");
		FeetConversionArea.setLineWrap(false);
		convPanel.add(FeetConversionArea);
		
		CentimetersConversionArea = new JTextArea(1, 5);
		CentimetersConversionArea.setBackground(Color.YELLOW);
		CentimetersConversionArea.setEditable(true);
		CentimetersConversionArea.setLayout(null);
		CentimetersConversionArea.setBounds(200,215,200,200);
		CentimetersConversionArea.append("165");
		CentimetersConversionArea.setLineWrap(false);
		convPanel.add(CentimetersConversionArea);

		convFrame.add(convPanel);

	
		//convFrame.addKeyListener(menubarListener);
		
		convFrame.setLocationRelativeTo(null);
		convFrame.setResizable(true);
		convFrame.setVisible(true);
		

						
	}

	
	
}




