package game;

import gegner.BGegnerClock;
import gui.GUI;

public class StartTextAdventure {

	public static void main(String[] args) {

		Map m = new Map();
		m.createMap();
		GUI g = new GUI();
		g.create();
		BGegnerClock gc = new BGegnerClock();
		gc.start();
		
		Klok k = new Klok();
		k.start();
	}

}
