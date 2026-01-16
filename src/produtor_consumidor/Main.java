package produtor_consumidor;

public class Main {

	public static void main(String[] args) {

		final int totalItens = 10;
		Monitor monitor = new Monitor(0);

		Thread thread1 = new Thread(new Produtor(monitor, totalItens), "Produtor");
		Thread thread2 = new Thread(new Consumidor(monitor, totalItens), "Consumidor");

		thread1.start();
		thread2.start();
	}
}
