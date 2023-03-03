package model;

import view.ConverterPanel;

public class updater implements ValueToConvert {
	

	double centimeters;
	private final ConverterPanel panel;
	private inputObserver input = new inputCalculator(centimeters);
	
	public updater(ConverterPanel convertorPanel) {
		this.panel = convertorPanel;
	}
	
	public void updateValue(double cm) {
      this.centimeters = cm;
      panel.getFeetArea().setText( input.getFeetArea(cm)  + " ft");      
      panel.getMeterArea().setText(input.getMeterArea(cm) + " m");
      }

}
;