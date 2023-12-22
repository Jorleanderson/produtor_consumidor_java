package Jorleanderson;

public class Produtor extends Thread {
	
	Monitor Monitor;
	int buffer;
	
	Produtor(Monitor Monitor, int buffer) {
		this.Monitor = Monitor;
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
			for(int k= 0; k<this.buffer; k++) {
				Monitor.produzir(this.getName(), k);
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
	}
}
