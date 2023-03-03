package main;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import controller.ActionListenerCommand;
import controller.ActionSaveInput;
import controller.MenuOptions;
import controller.MenubarListener;
import view.ConverterFrame;
import view.ConverterMenuBar;
import view.ConverterPanel;

public class Converter extends ConverterPanel{

	public static void main(String[] args) {
		new ConverterFrame();	
		ConverterPanel panel = new ConverterPanel();
		MenubarListener mblistener = new MenubarListener(panel);
		ActionListenerCommand clickSave = new ActionSaveInput(mblistener);
		MenuOptions menu = new MenuOptions(clickSave);
		menu.clickSave();
	}
}
