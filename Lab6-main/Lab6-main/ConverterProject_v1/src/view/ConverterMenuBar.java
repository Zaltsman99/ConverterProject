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
		
		convMenu.add(createMenuItem("Save input Centimeters", "Alt+F",  KeyEvent.VK_N, menubarListener));
		convMenu.addSeparator();
		super.add(convMenu);
			
	}
	

	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
		return menuItem;

	}
	
	

}
