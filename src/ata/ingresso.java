package ata;

import java.util.Scanner;

public class ingresso {

	private double valor = 20;
	private double valorAdicional;
	private String localização;

	public void começo() {

		Scanner Scan = new Scanner(System.in);
		VIP v = new VIP();
		Normal n = new Normal();
		Camarote_Inferior ci = new Camarote_Inferior();
		Camarote_Superior cs = new Camarote_Superior();
		int escolha;
		boolean ver = false;

		System.out.println("          bem vindo ao nosso teatro          ");
		System.out.println("qual tipo voce gostaria?");
		while (!ver) {
			System.out.println("[1] normal");
			System.out.println("[2] VIP");
			System.out.println("[3] camarote superior");
			System.out.println("[4] camarote inferior");

			try {
				escolha = Scan.nextInt();

				if (escolha == 1) {
					n.setValorAdicional(0);
					n.imprimeValor();
					n.imprimeTipo();
					n.valorTotal();
					ver = true;
				}
				if (escolha == 2) {
					v.setValorAdicional(40);
					v.imprimeValor();
					v.imprimeTipo();
					v.valorTotal();
					ver = true;
				}
				if (escolha == 3) {
					cs.setValorAdicional(10);
					;
					cs.imprimeValor();
					cs.imprimeTipo();
					cs.valorTotal();
					ver = true;
				}
				if (escolha == 4) {
					ci.setValorAdicional(30);
					ci.imprimeValor();
					ci.imprimeTipo();
					ci.valorTotal();
					ver = true;
				}
				if ((escolha >= 5) || (escolha <= 0)) {
					System.err.println("valor fake news");
				}

			} catch (Exception e) {

				try {
					System.err.println("Precisa ser um número inteiro");
					System.out.println("se ocorrer novamente ira sair do programa automaticamente");
					Scan.nextLine();
					escolha = Scan.nextInt();
				} catch (Exception e2) {
					break;				}
			}
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public String getLocalização() {
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
	}
}
