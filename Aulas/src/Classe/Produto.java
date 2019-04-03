package Classe;

import java.util.Scanner;

public class Produto {

	String nome;
	double preço;
	double quantidade_de_produto;
	double imposto;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double preço;
		double quantidade_de_produto;
		double imposto;

		System.out.println("Informe o nome do produto, preço e quantidade respectivamente");
		nome = ler.next();
		preço = ler.nextInt();
		quantidade_de_produto = ler.nextInt();
		imposto = (preço * 0.1);
		System.out.println(imposto);
	}

}
