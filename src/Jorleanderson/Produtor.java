package Jorleanderson;

public class Produtor implements Runnable {
	
	private Monitor monitor;
	private int totalItens;
	
	Produtor(Monitor monitor, int totalItens) {
		this.monitor = monitor;
		this.totalItens=totalItens;
	}
	
	@Override
	public void run() {
			for(int i=0; i<totalItens; i++) {
				monitor.produzir(Thread.currentThread().getName(), i);
				try {
					Thread.sleep(500);
				}
				catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " foi interrompida.");
					Thread.currentThread().interrupt();
					return;

				}			
			}
	}
}
