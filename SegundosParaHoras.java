package Exercicios;
	import java.util.*;
	public class SegundosParaHoras {
		public static void main(String[] args) {
			Scanner leia= new Scanner(System.in);
			
			int seg,min,horas;
			System.out.println("Quantos segundos foi os eventos na fabrica");
			seg=leia.nextInt();
					
			min=seg/60;
			horas=min/60;
			System.out.println("O tempo em horas � de "+horas);
			System.out.println("Em minutos � de: "+min);
			System.out.println("e em segundos � de: "+seg);
			
		leia.close();
		}
}
