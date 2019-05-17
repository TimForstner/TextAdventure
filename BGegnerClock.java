package gegner;

public class BGegnerClock extends Thread {
	
	int count = 0;
	public static boolean running = true;
	
	@Override
	public void run() {
		
		while (running) {
			try {
				System.out.println("Muuuuv");
				sleep(500);
				BossGegner.move();
			} catch (InterruptedException e) {
				
			}
			
		}
		
	
	}



}
