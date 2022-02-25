package Exercicios;

import java.util.*;

public class CustoCarro {
	
		public static void main(String[] args) {
			
			Scanner leia= new Scanner(System.in);
			double custo,imposto,distrib,valorFinal;
			
			System.out.println("Digite o valor de custo do veiculo");
			custo=leia.nextDouble();
			
			distrib=(custo/100)*28;
			imposto=(custo/100)*45;
			valorFinal=custo+distrib+imposto;
			System.out.println("O valor do veiculo para o consumidor é de:R$"+valorFinal);
			
			
		}

}
