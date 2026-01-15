package Jorleanderson;

public class Teste {

	public static void main(String[] args) {
		
		int totalItens=10;
		Monitor monitor = new Monitor(0);


		Thread t1 = new Thread(new Produtor(monitor, totalItens), "Produtor");
		Thread t2 = new Thread(new Consumidor(monitor, totalItens), "Consumidor");
			
		t1.start();
		t2.start();
	}
}
