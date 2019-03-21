package iX;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

import operation.*;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MainPanel() {		
		
		setLayout(new BorderLayout(0, 0));
		setPreferredSize(new Dimension(Variables.WINDOW_WIDTH, Variables.WINDOW_HEIGHT));
		
		Graph graph = new Graph(Variables.X_MIN, Variables.X_MAX, Variables.Y_MIN, Variables.Y_MAX, Variables.GRAPH_WIDTH, Variables.GRAPH_HEIGHT, new Sine());
		Controls graphControl = new Controls(graph, Variables.CONTROL_WIDTH, Variables.CONTROL_HEIGHT);
		
		add(graphControl, BorderLayout.SOUTH);
		add(graph, BorderLayout.CENTER);
	}
}
