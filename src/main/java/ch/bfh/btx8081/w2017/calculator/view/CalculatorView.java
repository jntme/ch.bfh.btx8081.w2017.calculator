package ch.bfh.btx8081.w2017.calculator.view;

public interface CalculatorView {
	public void setDisplay(double disp);
	
	interface CalculatorViewListener {
		void buttonClick(char operation);
	}
	
	public void addListener(CalculatorViewListener listener);
}
