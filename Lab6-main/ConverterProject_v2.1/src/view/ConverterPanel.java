package view;


import javax.swing.*;
import java.awt.*;


public class ConverterPanel extends JPanel{
	JTextArea feetConversionArea = new JTextArea("0",14,21);
    JTextArea meterConversionArea = new JTextArea("0",14,21);
    JTextArea centimetersConversionArea = new JTextArea("0",14,21);

	
	
	public ConverterPanel() {
		feetConversionArea.setBackground(Color.GREEN);
        centimetersConversionArea.setBackground(Color.YELLOW);
        meterConversionArea.setBackground(Color.ORANGE);
		meterConversionArea.setEditable(false);
		feetConversionArea.setEditable(false);
		centimetersConversionArea.getDocument().putProperty("filterNewlines", Boolean.TRUE);
		add(feetConversionArea);
		add(meterConversionArea);
		add(centimetersConversionArea);
		
	}
	

	public void setupConverter() {
			System.out.println("In ConverterPanel ==> setupConverter method");
	}

	
	public JTextArea getMeterArea() { 
		return meterConversionArea; 
		}
	
	public JTextArea getFeetArea() {
		return feetConversionArea;
	}
	
	public JTextArea getCmArea() {
		return centimetersConversionArea;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		}
		
	}
