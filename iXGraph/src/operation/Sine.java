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

package operation;
import iX.Calculate;

public class Sine extends Calculate {
	
	private final double a;
	private final double b;
	private final double c;
	
	public Sine() {
		this(1, 1, 0);
	}
	
	public Sine(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calc(double x) {
		return (a * Math.sin(b * x) + c);
	}
	
}
