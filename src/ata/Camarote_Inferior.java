package ata;

public class Camarote_Inferior extends ingresso {
	
	public void imprimeValor() {

		System.out.println("o total é " + getValor());
	}

	public void imprimeTipo() {
		System.out.println("voce esta usando o camarote INFERIOR");

	}

	public void valorTotal() {
		System.out.println("o total é " + (getValor() + getValorAdicional()));
	}
}
