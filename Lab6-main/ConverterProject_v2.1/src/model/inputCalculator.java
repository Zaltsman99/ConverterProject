package model;

public class inputCalculator implements inputObserver {
	
	double cm;
	public inputCalculator(double cm) {
		this.cm = cm;
	}

	@Override
	public String getFeetArea(double cm) {
		return Double.toString(cm* 0.0328084);
	}

	@Override
	public String getMeterArea(double cm) {
		return Double.toString(cm/100);
	}
	
	
	

}
