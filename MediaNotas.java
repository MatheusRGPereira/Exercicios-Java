package Exercicios;
	import java.util.*;
public class MediaNotas {
	
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		double n1,n2,n3,media,s;
		
		System.out.println("Digite a sua primeira nota");
		n1=leia.nextDouble();
		System.out.println("Digite a sua segunda nota");
		n2=leia.nextDouble();
		System.out.println("Digite a sua terceira nota");
		n3=leia.nextDouble();
		
		s=(n1*2)+(n2*3)+(n3*5);
		media=s/(2+3+5);
		System.out.println("A media das suas notas é: "+media);
	}
}
