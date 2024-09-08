package testes_estágio;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe um número inteiro: ");
		int n = sc.nextInt();

		if (eFibonacci(n)) {
			System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
		}
		sc.close();
	}

	public static boolean eFibonacci(int n) {
		if (n < 0) {
			return false;
		}
		int a = 0;
		int b = 1;
		while (a < n) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		return a == n;
	}

}