package produtor_consumidor;

public class Monitor {

	private int produto;
	private boolean disponivel;

	Monitor(int produto) {
		this.produto = produto;
		this.disponivel = false;
	}

	public synchronized void produzir(int valorItem) {

		while (disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		produto = valorItem;
		System.out.println(Thread.currentThread().getName() + "\t produziu: \t" + produto);
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

		System.out.println(Thread.currentThread().getName() + "\t consumiu: \t" + produto);
		disponivel = false;
		notifyAll();
		return produto;
	}
}
