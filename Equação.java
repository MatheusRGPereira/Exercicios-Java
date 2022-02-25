package Exercicios;

import java.util.*;

public class Equação {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double a, b, c, r, s, d;
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();

		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r + s) / 2;

		System.out.println("O valor da seguinte expressão D= R+S/2");
		System.out.println(d);

	}
}
