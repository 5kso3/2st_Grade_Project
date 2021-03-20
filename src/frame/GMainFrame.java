package frame;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import global.GConstants;

public class GMainFrame extends JFrame {
	// 加己 attributes
	private static final long serialVersionUID = 1L;
	// 何前 components
	private GMenuBar menuBar;
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;
	private WindowHandler windowHandler;

	public GMainFrame() {
		// attributes
		this.setLocation(GConstants.MAINFRAME_X, GConstants.MAINFRAME_Y);
		this.setSize(GConstants.MAINFRAME_W, GConstants.MAINFRAME_H);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.windowHandler = new WindowHandler();
		this.addWindowListener(windowHandler);
		this.setLayout(new BorderLayout());	
		
		// components
		this.menuBar = new GMenuBar();
		this.setJMenuBar(this.menuBar);

		this.toolBar = new GToolBar();
		this.add(this.toolBar, BorderLayout.NORTH);

		this.drawingPanel = new GDrawingPanel();
		this.add(this.drawingPanel, BorderLayout.CENTER);
	}

	public void initialize() {
		// initialize
		this.drawingPanel.initialize();
		this.menuBar.initialize(this.drawingPanel);
		this.toolBar.initialize(this.drawingPanel);
	}

	private class WindowHandler implements WindowListener {

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosing(WindowEvent e) {
			menuBar.windowClosing();
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
