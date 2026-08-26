package ata;

public class VIP extends ingresso {

	public void imprimeValor() {

		System.out.println("o total é " + getValor());
	}

	public void imprimeTipo() {
		System.out.println("voce esta usando o VIP");

	}

	public void valorTotal() {
		System.out.println("o total é " + (getValor() + getValorAdicional()));
	}

}
