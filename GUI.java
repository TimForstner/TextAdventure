package gui;

import javax.swing.JFrame;

import actions.KeyHandlerTxtAdv;

public class GUI {
	
	JFrame jf;
	Draw drawtxt;
	
	public static int WIDTH = 432;
	public static int HEIGHT = 528;
	public static int XOFF = 32;
	public static int YOFF = 32;
	
	public void create() {
		
		jf = new JFrame("TextAdventure");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGHT);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setVisible(true);
		
		drawtxt = new Draw();
		drawtxt.setBounds(0, 0, WIDTH, HEIGHT);
		drawtxt.setVisible(true);
		jf.add(drawtxt);
		
		jf.addKeyListener(new KeyHandlerTxtAdv());
		jf.requestFocus();
		
		
	}

}
