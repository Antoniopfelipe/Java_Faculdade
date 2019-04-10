package Classe;

import java.util.Scanner;

public class Produto {

	/**
	 * Todas as variáveis dentro de uma classe java geralmente precisam ter o
	 * modificador de acesso declarado, na grande maioria dos casos colocamos o
	 * modificardor private para que esses campos não sejam visíveis por outras
	 * classes publicamente, isso além de ser uma boa prática de segurança também é
	 * uma boa prática de encapsulamento.
	 * 
	 */

	private String nome;

	/**
	 * O java não aceita caracteres especiais como nome de variáveis, por isso mude
	 * o nome de preço para preco ;)
	 */
	private double preco;

	/**
	 * O padrão de nomenclatura de variáveis em Java é chamado de camelCase. Dá uma
	 * procurada no google para entender os padrões de nomenclatura utilizados. No
	 * caso camelCase significa que a primeira palavra é em letra minuscula e as
	 * palavras seguites não são separadas por underscore "_" mas sim conectadas
	 * usando a letra maiuscula nas palavras seguintes, veja minha modificação
	 * abaixo;
	 */
	private double quantidadeDeProduto;

	private double imposto;

	/**
	 * Pode ser que ainda seja cedo demais para isso mas sempre quando for programar
	 * utilize termos em ingles, em nenhum lugar do mundo programar na sua lingua
	 * materna é bem aceito, por isso comece desde cedo a utilizar tais termos como
	 * "scanner" para o seu objeto de Scanner ao invés de ler entendeu?
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/**
		 * Aqui não entendi a necessidade de vc declarar as variaveis novamente visto
		 * que vc já havia declarado fora da classe no ambito global, por isso voce deve
		 * decidir se as variaveis estaram no escopo do metodo, ou seja, que só vão
		 * existir quando o método executar, ou se vão existir no ambito "global" da
		 * classe, onde outros métodos poderão acessá-las
		 * 
		 * Na minha opinião pode seguir no escopo do metodo, nesse caso Não precisa do
		 * modificador pois o escopo já é fechado no método
		 */
		String nome;
		double preco;
		double quantidadeDeProduto;
		double imposto;


		/**
		 * Acharia melhor colocar uma mensagem para cada informacao assim o usuario teria um feedback quando apertasse
		 * o enter e não ficaria achando que o programa travou ou algo do tipo.
		 *
		 */
		System.out.println("Informe o nome do produto: ");

		/**
		 * Para vc capturar o valor do Scanner vc deve utilizar o metodo nextLine() ao inves de next()
		 */
		nome = ler.nextLine();
		System.out.println("Informe o preco: ");
		preco = ler.nextInt();
		System.out.println("Informe a quantidade: ");
		quantidadeDeProduto = ler.nextInt();

		/**
		 * Aqui é a mesma coisa, coloca uma mensagem falando que vc está calculando o valor do imposto e cria uma
		 * mensagem mais bonitinha para passar essa informacao.
		 */
		System.out.println("Calculando o valor do imposto....");
		imposto = (preco * 0.1);
		System.out.printf("O valor do imposto sobre o produto %s foi: %f", nome, imposto);

		System.out.println("Fim....");

		/**
		 * Todo objeto que interage com o sistem fazendo funçoes de leitura e escrita,
		 * que em programação chamamos de IO (Procura no google a definição do termo)
		 * deve ser fechado para evitar desperdício de memória.
		 */
		ler.close();
	}

}
