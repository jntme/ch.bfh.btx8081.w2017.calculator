package ch.bfh.btx8081.w2017.calculator.model;

public class CalculatorModel {
	
	private double value = 0.0;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public void clear() {
		this.value = 0.0;
		
	}
	
	public void add (double arg) {
		this.value += arg;
	}
	
	public void subtract(double arg) {
		this.add(-arg);
	}

	public void multiply (double arg) {
		this.value *= arg;
	}
	
	public void divide(double arg) {
		this.value /= arg;
	}

}
