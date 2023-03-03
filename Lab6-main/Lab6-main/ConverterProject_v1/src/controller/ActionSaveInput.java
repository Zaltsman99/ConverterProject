package controller;

// Concrete Command class for saving inputs
public class ActionSaveInput implements ActionListenerCommand {

private InputSaver insav; 

public ActionSaveInput(InputSaver insav) {
	
	this.insav = insav;
}


@Override 
public void execute() {
	insav.save();
}


}
