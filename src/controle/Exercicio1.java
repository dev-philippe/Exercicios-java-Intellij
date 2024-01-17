package controle;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /** 1. Criar um programa que receba um numero e verifique se ele está entre
         * 0 e 10 e é par;
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O numero " + numero + " Esta entre 0 e 10 e é par. ");
            } else {
                System.out.println("O numero " + numero + " Está entre 0 e 10 mas não é par. ");
            }

        } else {
            System.out.println("O número " + numero + " Não esta entre 0 e 10. ");
        }

        teclado.close();


    }
}


