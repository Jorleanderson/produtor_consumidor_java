package Jorleanderson;

public class Consumidor extends Thread{
	
	Monitor Monitor;
	int buffer;
	
	Consumidor(Monitor Monitor, int buffer){
		this.Monitor = Monitor;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		int valor = 0;
		
		for(int k=0; k<buffer; k++) {
			valor = this.Monitor.consumir(this.getName());	
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}