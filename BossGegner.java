package gegner;

import java.awt.Point;
import java.util.concurrent.ThreadLocalRandom;

public class BossGegner {
	
	
	
	Point p;
	
	public static int gegLeben = 32;
	public static String gegName ="";
	public static int gegx = ThreadLocalRandom.current().nextInt(1 ,10);
	public static int gegy = 1;
	
	public int getGegx() {
		return gegx;
	}

	public static void setGegx(int gegx) {
		BossGegner.gegx = gegx;
	}

	public int getGegy() {
		return gegy;
	}

	public static void setGegy(int gegy) {
		BossGegner.gegy = gegy;
	}

	public static void move() {
		
		int x = ThreadLocalRandom.current().nextInt(-1, 1); 
		int y = ThreadLocalRandom.current().nextInt(-1, 1);
		
		if ((gegx + x)<11 && (gegx + x)>=1) {
			gegx += x;
			System.out.println("XXXX");
		}
		if ((gegy + y)<11 && (gegy + y)>=2) {
			gegy += y;
			System.out.println("YYYY");
		}

		
		
	}
	
	
	
	
	
	

}
