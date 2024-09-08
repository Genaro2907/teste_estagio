package testes_estágio;

public class Teste4 {

	public static void main(String[] args) {

		// sequencia a
		int[] sequencia = { 1, 3, 5, 7 };
		int diferenca = 2;
		int proxElemento = sequencia[sequencia.length - 1] + diferenca;

		System.out.print("Sequência a: ");
		for (int num : sequencia) {
			System.out.print(num + " ");
		}

		while (proxElemento <= 9) {
			System.out.print(proxElemento + " ");
			proxElemento += diferenca;
		}

		// sequencia b
		int[] sequencia2 = { 2, 4, 8, 16, 32, 64 };
		int ratio = 2;
		int proxElemento2 = sequencia2[sequencia2.length - 1] * ratio;

		System.out.printf("%nSequência b: ");
		for (int num : sequencia2) {
			System.out.print(num + " ");
		}

		while (proxElemento2 <= 128) {
			System.out.print(proxElemento2 + " ");
			proxElemento2 *= ratio;
		}
		// sequencia c
		int[] sequencia3 = { 0, 1, 4, 9, 16, 25, 36 };
		int prox = sequencia3.length;
		int proxElemento3 = prox * prox;

		System.out.printf("%nSequência c: ");
		for (int num : sequencia3) {
			System.out.print(num + " ");
		}

		while (proxElemento3 <= 49) {
			System.out.print(proxElemento3 + " ");
			prox++;
			proxElemento3 = prox * prox;
		}
		// sequencia d
		int[] sequencia4 = { 4, 16, 36, 64 };
		int prox2 = sequencia4.length + 1;
		int proxElemento4 = prox2 * prox2;

		System.out.printf("%nSequência d: ");
		for (int num : sequencia4) {
			System.out.print(num + " ");
		}

		while (proxElemento4 <= 100) {
			System.out.print(proxElemento4 + " ");
			prox2 += 2;
			proxElemento4 = prox2 * prox2;
		}
		// sequencia e
		int[] sequencia5 = { 1, 1, 2, 3, 5, 8 };
		int proxElemento5 = sequencia5[sequencia5.length - 1] + sequencia5[sequencia5.length - 2];

		System.out.printf("%nSequência e: ");
		for (int num : sequencia5) {
			System.out.print(num + " ");
		}

		while (proxElemento5 <= 13) {
			System.out.print(proxElemento5 + " ");
			int temp = sequencia5[sequencia5.length - 1];
			sequencia5[sequencia5.length - 1] = proxElemento4;
			proxElemento5 = proxElemento5 + temp;
		}
		// sequencia f
		int[] sequencia6 = { 2, 10, 12, 16, 17, 18, 19 };
		int proxElemento6 = 200;

		System.out.printf("%nSequência f: ");
		for (int num : sequencia6) {
			System.out.print(num + " ");
		}

		System.out.print(proxElemento6);
	}
}
