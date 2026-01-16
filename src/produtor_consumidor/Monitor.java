package produtor_consumidor;

public class Monitor {

	private int produto;
	private boolean disponivel;

	Monitor(int produto) {
		this.produto = produto;
		this.disponivel = false;
	}

	public synchronized void produzir(String nomeThread, int valorItem) {

		while (disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		produto = valorItem;
		System.out.println(nomeThread + "\t produziu: \t" + produto);
		disponivel = true;
		notifyAll();
	}

	public synchronized int consumir() {
		
		while (!disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return -1;
			}
		}
		disponivel = false;
		notifyAll();
		return produto;
	}
}
