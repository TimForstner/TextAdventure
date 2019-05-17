package game;

import gegner.BossGegner;

public class Map {
	
	public static int xmap = 11;
	public static int ymap = 11;
	
	public static int spx = 9;
	public static int spy = 5;
	
	public static final int BLOCK = 32;
	
	public static String[][] map = new String[xmap][ymap];	
	public String neu = "Test";
	
	public static Spieler sp = new Spieler();
	public static BossGegner bg = new BossGegner();
	
	
	

	public String[][] createMap() {
		
		for(int x = 0; x < xmap; x++) {
			for(int y = 0; y < ymap; y++) {
				map[x][y] = "Wiese";
			}
		}
		
		map[spx][spy] = "Spieler";
		map[3][4] = "Gaststätte";
		
		return map;
	}
	
//	------------------------------
	
	public static int getSpx() {
		return spx;
	}


	public static void setSpx(int spx) {
		Map.spx = spx;
	}


	public static int getSpy() {
		return spy;
	}


	public static void setSpy(int spy) {
		Map.spy = spy;
	}
	
//	------------------------------
	
	
	
	
}


