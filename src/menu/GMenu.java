package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JMenu;

import frame.GDrawingPanel;

public class GMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	
	private GDrawingPanel drawingPanel;
	ActionHandler actionHandler;
	
	public GMenu(String name){
		super(name);
		this.actionHandler = new ActionHandler();
	}
	
	public void initialize(GDrawingPanel drawingPanel){
		this.drawingPanel = drawingPanel;
	}

	protected GDrawingPanel getDrawingPanel(){
		return this.drawingPanel;
	}
	
	private void invokeMethod(String methodName){
		try {
			this.getClass().getMethod(methodName).invoke(this);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			e.printStackTrace();
		}
	}
	
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			invokeMethod(event.getActionCommand());
		}
	}
}
