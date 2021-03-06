package transformer;

import java.awt.Graphics2D;
import shape.GShape;

public class GDrawer extends GTransfomer {
	
	public GDrawer(GShape selectedShape) {
		super(selectedShape);
	}

	
	public void initTransforming(Graphics2D g2D,int x, int y) {
		this.getShape().draw(g2D);
		this.getShape().setLocation(x, y);
		
	}
	
	public void keepTransforming(Graphics2D g2D,int x, int y) {
		this.getShape().draw(g2D);
		this.getShape().resize(x, y);
		this.getShape().draw(g2D);
	}
	public void continueTransforming(Graphics2D g2d, int x, int y) {
		this.getShape().addPoint(x,y);
	}
	
	public void finishTransforming(Graphics2D g2D,int x, int y) {
	}

}
