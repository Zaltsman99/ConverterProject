package controller;

import view.ConverterPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ValueToConvert;
import model.updater;

// This class becomes receiver for command pattern. Retrieve input value from user and set new state of ValueToConvert
public class MenubarListener implements ActionListener {

	ValueToConvert value;
	private final ConverterPanel convrtPanel;

	public MenubarListener(ConverterPanel panel) {
		convrtPanel = panel;
		value = new updater(panel);
	}

	
public void save() {
		
		//  Retrieve input value from user and set new state of ValueToConvert
		
	float userInputInCM = Float.parseFloat(convrtPanel.getCmArea().getText().trim());
	value.updateValue(userInputInCM);
		
		System.out.println("Input saved and state of ValueToConvert updated ");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Alt+F":
				save();
				System.out.println("MenubarListener Class ");
				break;
			case "EXIT":
				System.exit(0);
				break;

			default:
				throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}