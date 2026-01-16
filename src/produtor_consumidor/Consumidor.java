package produtor_consumidor;

public class Consumidor implements Runnable {

	private Monitor monitor;
	private int totalItens;

	Consumidor(Monitor monitor, int totalItens) {
		this.monitor = monitor;
		this.totalItens = totalItens;
	}

	@Override
	public void run() {

		for (int i = 0; i < totalItens; i++) {

			monitor.consumir();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " foi interrompida.");
				Thread.currentThread().interrupt();
				return;
			}
		}
	}
}