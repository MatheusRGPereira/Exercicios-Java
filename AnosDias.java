package Exercicios;

import java.util.Scanner;

public class AnosDias {
		public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int dias,anos,meses;
		
		System.out.println("DIgite quantos anos voce tem");
		anos=leia.nextInt();
		System.out.println("DIgite quantos meses voce tem");
		meses=leia.nextInt();
		System.out.println("DIgite quantos dias voce tem");
		dias=leia.nextInt();
		
		dias = (anos*365 +meses*30+dias);
		
		System.out.println("a sua idade em dias é "+dias);
				
		leia.close();
			
		}
	
}
