package game;

public class Klok extends Thread {

	@Override
	public void run() {
			
			try {
				sleep(200);
				System.out.println("funkt");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
