package Exercicios;

import java.util.*;
public class DiasEmAnos {
		public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int anos,meses,dias, diaz;
		System.out.println("Quantos anos voce tem expresso em dias");
		dias=leia.nextInt();
		anos = dias/365;
		meses= (dias%365)/30;
		diaz = dias/365;
		
		System.out.println("a sua idade é de "+anos);
		System.out.println("e em meses é de: "+meses);
		System.out.println("e em dias é de: "+diaz);
		
		leia.close();
		}
}
