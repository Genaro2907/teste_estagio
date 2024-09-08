package testes_estágio;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
	      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um texto: ");
        String texto = sc.nextLine();
        

        int cont = contLetraA(texto);
        System.out.println("A letra 'a'  ocorre " + cont + " vezes no texto.");
        sc.close();
    }

    public static int contLetraA(String str) {
        return (int) str.chars().mapToObj(c -> (char) c).filter(c -> c == 'a' || c == 'A').count();
    }

}


