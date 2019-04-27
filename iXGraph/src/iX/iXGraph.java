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

import javax.swing.JFrame;


public class iXGraph {

	public static void main(String[] args) {
		JFrame iXGraphMain = new JFrame("iXGraph");
		iXGraphMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iXGraphMain.getContentPane().add(new MainPanel());
		iXGraphMain.pack();
		iXGraphMain.setVisible(true);
	}

}
