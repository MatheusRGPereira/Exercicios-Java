package Exercicios;
	import java.util.*;
	import java.math.*;
public class CalcularDistancia {
			public static void main(String[] args) {
				
			Scanner leia= new Scanner(System.in);
			double x1, y1 ,x2 ,y2, d;
			
			System.out.println("Digite o valor de x1:");
			x1=leia.nextDouble();
			System.out.println("Digite o valor de x2:");
			x2=leia.nextDouble();
			System.out.println("Digite o valor de y1:");
			y1=leia.nextDouble();
			System.out.println("Digite o valor de y2:");
			y2=leia.nextDouble();
			
			d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
			Math.sqrt(d);
			System.out.println("a distancia entre o ponto A e o ponto B é de:"+d);
	
	
				
			}
	
}
