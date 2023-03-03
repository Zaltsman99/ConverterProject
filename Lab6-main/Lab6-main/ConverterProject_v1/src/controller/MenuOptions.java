package controller;

// This is known as the invoker
// It has a method clicksave() that when executed causes the execute method to be called
// The execute method for the Command interface then calls the method assigned in the class that implements the
// Command interface

public class MenuOptions {

	ActionListenerCommand saveCommand;
	
	public MenuOptions (ActionListenerCommand clickSave) {	
	this.saveCommand = clickSave;
	}
	
	
	public void clickSave() {
	saveCommand.execute();
	}

}
