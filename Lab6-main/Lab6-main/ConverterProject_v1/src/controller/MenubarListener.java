package controller;

import view.ConverterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ConverterGame;

public class MenubarListener implements ActionListener {

	private final ConverterPanel convrtPanel;

	public MenubarListener(ConverterPanel panel) {
		convrtPanel = panel;
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		ConverterGame convrtGame = convrtPanel.getConverter();
		
		switch (e.getActionCommand()) {
			case "Alt+F":
				//gamePanel.setupSoccerGame();
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
