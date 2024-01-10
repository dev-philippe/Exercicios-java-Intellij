package fundamentos.fundamentos;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        /** Criar um programa que leia um valor e apresente o resultado ao quadrado e ao cubo do valor */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = teclado.nextDouble();

        /** Existe a seguinte possibilidade
         * double ao quadrado = valor * valor;
         * double cubo = valor * valor * valor;
         */

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O valor do quadrado é: " + quadrado + "/n O valor do cubo é: " + cubo);


    }
}
