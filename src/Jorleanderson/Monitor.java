package Jorleanderson;

public class Monitor {
	
	private int numero;	
	private boolean disponivel;
	
	Monitor(int numero) {
		this.numero = numero;
		this.disponivel = false;
	}
	
	public synchronized int consumir(String nomeThread) {
		while(!disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
				
		System.out.println(nomeThread + "\t consumiu: \t" + numero);
		disponivel = false;
		notifyAll();
		return numero;	
	}
	
	public synchronized void produzir(String nomeThread, int valor) {
		while(disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		disponivel = true;
		numero = valor;
		System.out.println(nomeThread + "\t produziu: \t" + valor);	
		notifyAll();
		
		
	}

}
