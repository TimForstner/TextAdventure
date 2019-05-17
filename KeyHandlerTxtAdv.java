package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Direc;
import game.Map;
import game.Spieler;



public class KeyHandlerTxtAdv implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			Map.sp.setDir(Direc.NORTH);
			Spieler.spielerMove();
			print();
			break;
		case KeyEvent.VK_A:
			Map.sp.setDir(Direc.WEST);
			Spieler.spielerMove();
			print();
			break;
		case KeyEvent.VK_S:
			Map.sp.setDir(Direc.SOUTH);
			Spieler.spielerMove();
			print();
			break;
		case KeyEvent.VK_D:
			Map.sp.setDir(Direc.EAST);
			Spieler.spielerMove();
			print();
			break;
		case KeyEvent.VK_SPACE:
			Map.sp.setDir(Direc.SWITCH);
			Spieler.spielerMove();
			print();
			break;
		case KeyEvent.VK_1:
			if (Spieler.invent.inventory[0] != "emptySlot") {
			Spieler.invent.equiped = 0;
			}
			break;
		case KeyEvent.VK_2:
			if (Spieler.invent.inventory[1] != "emptySlot") {
				Spieler.invent.equiped = 1;
			}
			break;
		case KeyEvent.VK_3:
			if (Spieler.invent.inventory[2] != "emptySlot") {
			Spieler.invent.equiped = 2;
			}
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	public void print() {
	        
		for (int x = 0; x <10 ; x++) {
			for (int y = 0; y <10 ; y++) {
				System.out.print(Map.map[x][y] + " ");
			}
			System.out.println(" \n ");
		}
		System.out.println("\n");
	}
}
