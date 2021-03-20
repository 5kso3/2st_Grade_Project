package menu;
import javax.swing.JMenuBar;

import frame.GDrawingPanel;
import global.GConstants.EMenu;


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
	
	
	
}
