package ata;

public class Camarote_Superior extends ingresso {
	
	public void imprimeValor() {
		System.out.println("o VALOR é " + getValor());
	}

	public void imprimeTipo() {
		System.out.println("voce esta usando o camarote superior");
	}

	public void valorTotal() {
		System.out.println("o total é " + (getValor() + getValorAdicional()));
	}
}
