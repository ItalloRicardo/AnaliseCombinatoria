package br.com;

public class Arranjo {
	Fatorial fat = new Fatorial();
	
	private long n;
	private long p;

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
	}
	
	public long getP() {
		return p;
	}

	public void setP(long p) {
		this.p = p;
	}

	public long calculaArranjo() {
		long arranjo = 0;
		
		arranjo = fat.calculaFatorial(n) / (fat.calculaFatorial(n - p));
		
		return arranjo;
}
}
