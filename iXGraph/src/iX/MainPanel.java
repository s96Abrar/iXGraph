/*
 * iXGraph is a 2D Graph representation for mathematical equation like sin(x), acos(bx+c), 1/x etc.
 * 
 * Copyright (C) 2019  Abrar
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
