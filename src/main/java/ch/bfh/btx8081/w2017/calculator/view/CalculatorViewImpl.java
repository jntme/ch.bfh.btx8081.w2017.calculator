package ch.bfh.btx8081.w2017.calculator.view;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class CalculatorViewImpl extends CustomComponent implements CalculatorView, ClickListener {
	
	private Label display = new Label("0.0");
	private List<CalculatorViewListener> listeners = new ArrayList<CalculatorViewListener>();
	
	public CalculatorViewImpl() {
		GridLayout layout = new GridLayout(4,5);
		
		layout.addComponent(display, 0, 0, 3, 0);
		
		String[] operations = new String[] {
				"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "=", "C", "+"
		};
		
		for(String caption : operations) {
			layout.addComponent(new Button(caption, this));
		}
		
		setCompositionRoot(layout);
	}

	@Override
	public void setDisplay(double disp) {
		display.setValue(Double.toString(disp));
	}

	@Override
	public void addListener(CalculatorViewListener listener) {
		listeners.add(listener);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		for(CalculatorViewListener listener : listeners) {
			listener.buttonClick(event.getButton().getCaption().charAt(0));
		}
		
	}

}
