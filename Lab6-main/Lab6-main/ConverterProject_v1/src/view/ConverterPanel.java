package view;


import javax.swing.*;
import model.ConverterGame;
import java.awt.*;


public class ConverterPanel extends JPanel{
	
	private final Font uiFont;

	private ConverterGame convg;
	
	public ConverterPanel() {
		super(null);
		//super.setBackground(new Color(212, 176, 49));
		super.setBackground(new Color(255,255,255));
		uiFont = new Font("UI", Font.BOLD, 15);
		setupConverter();
		//setupRepaint();
		
		repaint();
		
	}
	
	public void setupConverter() {

			System.out.println("In ConverterPanel ==> setupConverter method");
		
		
		
//		calculateFT();
//		calculateMTR();
	}

	
	public ConverterGame getConverter() {
		return convg;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//paintTextArea();
		//paintGreenSquare(g);
		//paintOrangeSquare(g);
		//paintYellowSquare(g);
		
	}
	
	
	public void paintTextArea() {
		
		JTextArea textArea1;
		JTextArea textArea2;
		JTextArea textArea3;
		JTextArea textArea4;
		JTextArea textArea5;
		
		textArea1 = new JTextArea(15,15);	    // JTextArea()
		textArea1.setBackground(Color.GREEN);
		textArea1.setEditable(false);
		textArea1.setLayout(null);
		//textArea1.setBounds(10,10,50,50);
		
		textArea2 = new JTextArea(15, 15);	//JTextArea(int rows, int columns)
		textArea2.setBackground(Color.ORANGE);
		textArea2.setEditable(false);
		textArea2.setLayout(null);
		//textArea2.setBounds(65,10,50,50);

		
		textArea3 = new JTextArea("160", 15, 15);
		textArea3.setBackground(Color.YELLOW);
		textArea3.setEditable(true);
		textArea3.setLayout(null);
		//textArea3.setBounds(120,40,50,50);

	
		//textArea4 = new JTextArea("Fourth textarea");
		
		textArea1.append("0 ft");
		textArea2.append("0 m");
		
		
		add(textArea1);
		add(textArea2);
		add(textArea3);
		
		
		
//		calculateFT();
//		calculateMTR();


		
	}
	
/******	
 
 
	private void paintGreenSquare(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(100, 10, 250, 250);
		
		g.setColor(Color.black);
		g.setFont(uiFont);
		g.drawString("0 ft", 110, 25);

	}
	
	private void paintOrangeSquare(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(360, 10, 250, 250);

		g.setColor(Color.black);
		g.setFont(uiFont);
		g.drawString("0 m", 375, 25);
		
	}
	
	private void paintYellowSquare(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(225, 270, 250, 250);
		
		g.setColor(Color.black);
		g.setFont(uiFont);
		g.drawString("0", 230, 285);
		
		
		JTextArea textArea = new JTextArea(10, 50);
		textArea.setBackground(Color.RED);
		//JScrollPane scrollPane = new JScrollPane(textArea); 
		textArea.setEditable(true);

		//JTextArea textArea = new JTextArea("0 ft"	);
		textArea.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setText("0 ft"	);
		
		add(textArea);
	}

****/
	
}
