package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ConverterMenuBar extends JMenuBar {

	public ConverterMenuBar() {
		
	}
	
	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		
		JMenu convMenu = new JMenu("Update model");
		
		KeyStroke keyStrokeALT_F
	    = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK);
	
		
		convMenu.add(createMenuItem("Save input Centimeters", "Alt+F",  keyStrokeALT_F , menubarListener));
		convMenu.addSeparator();
		super.add(convMenu);
			
	}
	

	private JMenuItem createMenuItem(String text, String actionCommand, KeyStroke keyStrokeALT_F, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(keyStrokeALT_F);
		return menuItem;

	}
	
	

}