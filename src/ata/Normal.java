package ata;
public class Normal extends ingresso {
	public void imprimeValor() {

		System.out.println("o total é " + getValor());

	}
	public void imprimeTipo() {
		System.out.println("voce esta usando o NORMAL");

	}
	public void valorTotal() {
		System.out.println("o total é " + getValor() + getValorAdicional());
	}
}
