package br.com;

public class Combinacoes {
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

	public long calculaCombinacoes() {
		long combinacoes = 0;
		
		combinacoes = fat.calculaFatorial(n) / (fat.calculaFatorial(p) * (fat.calculaFatorial(n - p)));
		
		return combinacoes;
}
}