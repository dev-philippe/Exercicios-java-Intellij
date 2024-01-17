package controle;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /** 4. Criar um programa que receba um número e diga se ele é um  número primo.
         *
         */

        int contadorDeDivisores = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nDigite um número para verificar se é primo: ");
        int numero = teclado.nextInt();

        for ( int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        if(contadorDeDivisores == 0) {
            System.out.println("\nO número " + numero + " é primo");
        }else {
            System.out.println("\nO numero " + numero + " não é primo");
        }

        teclado.close();

    }
}
