package iX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Graph extends JPanel {

	private static final long serialVersionUID = 1L;
	/** Minimum X value */
	private final int X_MIN;
	/** Maximum X value */
	private final int X_MAX;
	/** Size of 1 unit in the X direction */
	private final double X_UNIT;
	/** Minimum Y value */
	private final int Y_MIN;
	/** Maximum Y value */
	private final int Y_MAX;
	/** Size of 1 unit in the Y direction */
	private final double Y_UNIT;
	/** The height of the panel. */
	private final int PANEL_WIDTH;
	/** The width of the panel. */
	private final int PANEL_HEIGHT;
	/** The Operate to be evaluated. */
	private Calculate operation;
	
	public Graph(int xmin, int xmax, int ymin, int ymax, int width, int height, Calculate operation) {
		this.X_MIN = xmin;
		this.X_MAX = xmax;
		int _width = X_MAX - X_MIN;
		
		this.Y_MIN = ymin;
		this.Y_MAX = ymax;
		int _height = Y_MAX - Y_MIN;
		
		PANEL_WIDTH = width;
		PANEL_HEIGHT = height;
		
		this.X_UNIT = (double) PANEL_WIDTH/_width;
		this.Y_UNIT = (double) PANEL_HEIGHT/_height;
		
		this.operation = operation;
		
		setBackground(Color.white);
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}
	public void setEvaluable(Calculate op) {
		this.operation = op;
		repaint();
	}
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		final double INTERVAL_WIDTH = 0.0001;
		double xCoordinate;
		double yCoordinate;
		page.setColor(Color.black);
		for (double xValue = X_MIN; xValue <= X_MAX; xValue += INTERVAL_WIDTH) {
			xCoordinate = xValue;
			yCoordinate = 0;
			drawPoint(page, xCoordinate, yCoordinate);	
		}
		for (double yValue = Y_MIN; yValue <= Y_MAX; yValue += INTERVAL_WIDTH) {
			yCoordinate = yValue;
			xCoordinate = 0;
			drawPoint(page, xCoordinate, yCoordinate);
		}
		page.setColor(Color.red);
		for (double xValue = X_MIN; xValue <= X_MAX; xValue += INTERVAL_WIDTH) {
			xCoordinate = xValue;
			yCoordinate = operation.calc(xCoordinate);
			drawPoint(page, xCoordinate, yCoordinate);	
		}
	}
	/** Draw a point on the panel.
	 * @param page The page object
	 * @param xCoordinate The x coordinate
	 * @param yCoordinate The y coordinate
	 */
	private void drawPoint(Graphics page, double xCoordinate, 
			double yCoordinate) {
		final double X_DISTANCE = xCoordinate - X_MIN;
		/* Columns are counted from the left */
		final double Y_DISTANCE = Y_MAX - yCoordinate;
		/* Rows are counted from the top */
		final int SIZE = 3;
		final int X_POSITION = (int) (X_DISTANCE*X_UNIT);
		final int Y_POSITION = (int) (Y_DISTANCE*Y_UNIT);
		page.fillRect(X_POSITION, Y_POSITION, SIZE, SIZE);
	}
}
