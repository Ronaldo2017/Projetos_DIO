package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		System.out.println("Informe a quantidade de produto para registrar: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int qtd = sc.nextInt();

			Produto prod = new Produto(nome, preco, qtd);

			produtos.add(prod);

		}

		//procurando por filtro, expressao lambda
//		List<Produto> result = produtos.stream().filter(produto -> produto.equals('T')).collect(Collectors.toList());
//		for (Produto prod : result) {
//			System.out.println(prod);
//		}
		System.out.println(produtos);

		sc.close();

	}


	public static String buscaNome(List<Produto> prod, String nome){
		for (int i = 0; i < prod.size(); i++) {
			if (prod.get(i).getNome() == nome){
				return nome;
			}
		}
		return null;
	}
}
