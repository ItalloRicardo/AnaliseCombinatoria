package br.com;

public class Fatorial {
	
	private long numero;

	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public long calculaFatorial(long numero) {
		long fatorial = 1;
        for(long i = numero; i > 0; i--){
            fatorial = fatorial * i;       
		}
		return fatorial;
}
}
