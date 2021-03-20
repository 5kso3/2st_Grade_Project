package menu;

import java.awt.event.InputEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import frame.GDrawingPanel;
import global.GConstants.EEditMenu;
import global.GConstants.EFileItem;

public class GEditMenu extends GMenu {
	private static final long serialVersionUID = 1L;
	private GDrawingPanel drawingPanel;

	public GEditMenu(String name) {
		super(name);
		
		for(EEditMenu eFileMenu: EEditMenu.values()) {
			JMenuItem menuItem = eFileMenu.getMenuItem();
			menuItem.setActionCommand(eFileMenu.getActionCommend());
			menuItem.addActionListener(actionHandler);
			this.add(menuItem);
		}
		EEditMenu.eCopy.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.ALT_MASK));
		EEditMenu.eCut.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('U', InputEvent.ALT_MASK));
		EEditMenu.eDelete.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.ALT_MASK));
		EEditMenu.eDo.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.ALT_MASK));
		EEditMenu.eGroup.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('G', InputEvent.ALT_MASK));
		EEditMenu.ePaste.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.ALT_MASK));
		EEditMenu.eUnDo.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.ALT_MASK));
		EEditMenu.eUnGroup.getMenuItem().setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.ALT_MASK));
	}
	
	public void group(){
		
	}
	public void unGroup(){
		
	}
	public void cut(){
		this.getDrawingPanel().cut();
	}
	public void copy(){
		this.getDrawingPanel().copy();
	}
	public void paste(){
		this.getDrawingPanel().paste();
	}
	public void delete(){
		this.getDrawingPanel().delete();
	}
	public void ddo(){
		
	}
	public void unDo(){
		
	}
	

	public void initialize(GDrawingPanel drawingPanel) {
		super.initialize(drawingPanel);
	}
	
}
