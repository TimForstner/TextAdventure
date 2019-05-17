package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import game.Map;
import game.Spieler;

@SuppressWarnings("serial")
public class Draw extends JLabel {
	
	JLabel label;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d =(Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		Color oceanBlue = new Color(13, 160, 232);
		Color grasGreen = new Color(20, 230, 15);
		Color inventoryBrown = new Color(155, 98, 55);
		Color inventoryBrownFrame = new Color(89, 56, 32);
		
		// Draw background
		g.setColor(oceanBlue);
		g.fillRect(0, 0, GUI.WIDTH, GUI.HEIGHT);
		
		// Draw court
		g.setColor(grasGreen);
		g.fillRect(GUI.XOFF, GUI.YOFF, 352, 352);
		
		g.setColor(Color.DARK_GRAY);
		for (int x = 0; x < Map.xmap ; x++) {
			for (int y = 0; y < Map.ymap ; y++) {
				g.drawRect(x*32 + GUI.YOFF, y*32 + GUI.YOFF, 32, 32);
			}
		}
		
		
		
		// Draw Gegner 
		g.setColor(Color.DARK_GRAY);
		g.fillRect(Map.bg.getGegx()*Map.BLOCK, Map.bg.getGegy()*Map.BLOCK, Map.BLOCK, Map.BLOCK);
		
		// Draw Player 
		g.setColor(Color.RED);
		g.fillRect(Map.getSpy()*32+GUI.XOFF, Map.getSpx()*32+GUI.YOFF, 32, 32);
				
		// Draw Inventory Panel
		int inventoryHeight = 115;
		g.setColor(inventoryBrown);
		g.fillRect(GUI.XOFF, GUI.HEIGHT-inventoryHeight-15, GUI.WIDTH-80, 80);
		g.setColor(inventoryBrownFrame);
		g.drawRect(GUI.XOFF, GUI.HEIGHT-inventoryHeight-15, GUI.WIDTH-80, 80);
		
		// Draw Inventory
		g.setColor(Color.BLACK);
		g.drawString("Inventory:", GUI.XOFF+10, GUI.HEIGHT-inventoryHeight);

		for(int i = 0; i < Spieler.invent.inventory.length; i++) {
			if (i==Spieler.invent.equiped) {
				g.setColor(Color.RED);
			} else {
				g.setColor(Color.BLACK);
			}
			g.drawString(Spieler.invent.inventory[i], GUI.XOFF*3+10, GUI.HEIGHT-inventoryHeight);
			inventoryHeight -= 20;
		}
		
		
		
		
		
		repaint();
		
		
	}

}
