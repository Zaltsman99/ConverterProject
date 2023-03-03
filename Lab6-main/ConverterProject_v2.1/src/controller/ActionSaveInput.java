package controller;

// Concrete Command class for saving inputs
public class ActionSaveInput implements ActionListenerCommand {

private MenubarListener mblistener; 

public ActionSaveInput(MenubarListener mblistener) {
	
	this.mblistener = mblistener;
}


@Override 
public void execute() {
	mblistener.save();
}


}
