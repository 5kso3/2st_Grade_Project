package frame;
import javax.swing.JMenuBar;

import global.GConstants.EMenu;
import menu.GFileMenu;

public class GMenuBar extends JMenuBar {
	//�Ӽ�
	private static final long serialVersionUID = 1L;

	//associate
	private GDrawingPanel drawingPanel;
	
	public GMenuBar() {
		
		for(EMenu eMenu: EMenu.values()){
			this.add(eMenu.getMenu());
		}
	}
	
	public void initialize(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
		
		for(EMenu eMenu: EMenu.values()){
			eMenu.getMenu().initialize(this.drawingPanel);
		}
	}

	public void windowClosing() {
		((GFileMenu)(EMenu.eFileMenu.getMenu())).exit();
	}
	
	
	
}
