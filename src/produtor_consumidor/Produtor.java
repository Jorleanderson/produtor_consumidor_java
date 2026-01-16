package produtor_consumidor;

public class Produtor implements Runnable {

	private Monitor monitor;
	private int totalItens;

	Produtor(Monitor monitor, int totalItens) {
		this.monitor = monitor;
		this.totalItens = totalItens;
	}

	@Override
	public void run() {
		for (int valorIten = 0; valorIten < totalItens; valorIten++) {
			monitor.produzir( valorIten);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " foi interrompida.");
				Thread.currentThread().interrupt();
				return;

			}
		}
	}
}
