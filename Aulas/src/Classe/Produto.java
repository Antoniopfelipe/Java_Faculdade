package Classe;

import java.util.Scanner;

public class Produto {

	String nome;
	double pre�o;
	double quantidade_de_produto;
	double imposto;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double pre�o;
		double quantidade_de_produto;
		double imposto;

		System.out.println("Informe o nome do produto, pre�o e quantidade respectivamente");
		nome = ler.next();
		pre�o = ler.nextInt();
		quantidade_de_produto = ler.nextInt();
		imposto = (pre�o * 0.1);
		System.out.println(imposto);
	}

}
