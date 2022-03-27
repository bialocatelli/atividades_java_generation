package br.com.generation.collections;

import java.util.ArrayList;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
// Armazenar dados da List
// Remover dados da list;
// Atualizar dados da list.
//Apresentar todos os dados da list.
//10-03-22 Beatriz Locatelli



public class Estoque {

	public static void main(String[] args) {
		
		String roupa1 = "Saia" ;
		 String roupa2 = "Short";
		 String roupa3 = "Camiseta";
		 String roupa4 = "Croped";
		 		
		 
		 ArrayList <String> roupas = new ArrayList<>(); 
		 
		 roupas.add(roupa1);
		 roupas.add(roupa2);
		 roupas.add(roupa3);
		 roupas.add(roupa4);
		 
		 System.out.println("Estoque dia 01/03/2022");
		  for(int i = 0; i < roupas.size(); i++) {
				System.out.println("Roupas: " + roupas.get(i));
			}
			
			System.out.println();
			System.out.println("Minha lista tem o total de " + roupas.size() + " tipos de roupas.");
			
			System.out.println();
		 	System.out.print("Estoque dia 10/03/2022");
		 	roupas.remove(2);
			System.out.println();
		for(int i = 0; i < roupas.size(); i++) {
			System.out.println("Roupas: " + roupas.get(i));
		}
		
		System.out.println();
		System.out.println("Minha lista tem o total de " + roupas.size() + " tipos de roupas.");
		 
	}


}
