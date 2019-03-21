package iX;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import operation.Cosine;
import operation.OneByX;
import operation.Sine;
import operation.Tangent;
import operation.XSquare;

public class Controls extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public Controls(Graph g, int width, int height) {
		JButton btnSinx = new JButton("Sin(x)");
		btnSinx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Sine s = new Sine();
				g.setOperation(s);
			}
		});
		add(btnSinx);
		
		JButton btnCosx = new JButton("Cos(x)");
		btnCosx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Cosine cs = new Cosine();
				g.setOperation(cs);
			}
		});
		add(btnCosx);
		
		JButton btnTanx = new JButton("Tan(x)");
		btnTanx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Tangent tg = new Tangent();
				g.setOperation(tg);
			}
		});
		add(btnTanx);
		
		JButton btnOneByX = new JButton("1/x");
		btnOneByX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OneByX s = new OneByX();
				g.setOperation(s);
			}
		});
		add(btnOneByX);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				XSquare s = new XSquare();
				g.setOperation(s);
			}
		});
		add(btnX);
		
		JButton btnAll = new JButton("ALL AT ONCE");
		btnAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				g.allAtOnce();				
			}
		});
		add(btnAll);
		
		setPreferredSize(new Dimension(width, height));
	}
}
