package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import global.GConstants.EToolMenu;

public class GToolBar extends JToolBar {
	// attributes
	private static final long serialVersionUID = 1L;
	// associations
	private GDrawingPanel drawingPanel;

	public GToolBar() {
		// Group the radio buttons.
		ActionHandler actionHandler = new ActionHandler();
		ButtonGroup group = new ButtonGroup();
		for (EToolMenu eToolMenu : EToolMenu.values()) {
			JRadioButton button = new JRadioButton();
			button.setActionCommand(eToolMenu.name());
			button.addActionListener(actionHandler);
			button.setIcon(new ImageIcon(eToolMenu.getIconFileName()));
			button.setSelectedIcon(new ImageIcon(eToolMenu.getIconSLTFileName()));
			group.add(button);
			this.add(button);
		}
	}

	public void initialize(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
		((JRadioButton) (this.getComponent(EToolMenu.rectangle.ordinal()))).doClick();
	}

	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			drawingPanel.setActionCommand(EToolMenu.valueOf(event.getActionCommand()).getSelectedTool());
		}
	}

}
