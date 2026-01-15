package Jorleanderson;

public class Teste {

	public static void main(String[] args) {
		int buffer=10;
		Monitor m = new Monitor(0);
		Produtor p = new Produtor(m,buffer);
		Consumidor c = new Consumidor(m,buffer);
			
		p.start();
		c.start();
	}
}
