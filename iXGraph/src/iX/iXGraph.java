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
