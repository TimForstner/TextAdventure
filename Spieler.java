package game;

public class Spieler {
	
	public static Direc dir = Direc.NORTH;
	static String activeField = "Wiese";
	static String futureField = "";
	
	public static Inventory invent = new Inventory();
	
	public Direc getDir() {
		return dir;
	}

	public void setDir(Direc dir) {
		Spieler.dir = dir;
	}
	
	

	public static void spielerMove() {
		

		
		try {
			switch (dir) {
			case EAST:
				futureField = Map.map[Map.spx][Map.spy+1];
				Map.map[Map.spx][Map.spy] = activeField;
				activeField = futureField;
				Map.spy +=1;
				Map.map[Map.spx][Map.spy] = "Spieler";
				break;
			case NORTH:
				futureField = Map.map[Map.spx-1][Map.spy];
				Map.map[Map.spx][Map.spy] = activeField;
				activeField = futureField;
				Map.spx -=1;
				Map.map[Map.spx][Map.spy] = "Spieler";

				
				break;
			case SOUTH:
				futureField = Map.map[Map.spx+1][Map.spy];
				Map.map[Map.spx][Map.spy] = activeField;
				activeField = futureField;
				Map.spx +=1;
				Map.map[Map.spx][Map.spy] = "Spieler";
				break;
			case WEST:
				futureField = Map.map[Map.spx][Map.spy-1];
				Map.map[Map.spx][Map.spy] = activeField;
				activeField = futureField;
				Map.spy -=1;
				Map.map[Map.spx][Map.spy] = "Spieler";
				break;
			case SWITCH:
				futureField = Map.map[Map.spy][Map.spx];
				Map.map[Map.spx][Map.spy] = activeField;
				activeField = futureField;
				int swiy;
				int swix;
				swix = 5 - Map.spx ;
				Map.spx += swix*2;
				
				swiy = 5 - Map.spy ;
				Map.spy += swiy*2;
				break;
			default:
				break;
			}
		} catch (Exception e) {

		}



		
		
	
		
		
	}

}
