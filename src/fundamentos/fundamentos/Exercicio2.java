package fundamentos.fundamentos;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        /** 2. Criar um programa que leia a temperatura em fahrenheit e converta para celsius. */


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit: ");
        double fahrenheit = teclado.nextDouble();

        double conversao =  (fahrenheit - 32 )  / 1.8;

        System.out.println("Valor em celsius: " + conversao);

        teclado.close();

    }
}
