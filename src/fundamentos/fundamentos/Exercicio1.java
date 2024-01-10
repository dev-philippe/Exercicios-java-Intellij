package fundamentos.fundamentos;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        /** 1. Criar um programa que leia a temperatura em celsius e converta para Fahrenheit. */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();

        double conversao = celsius * 1.8 + 32;

        System.out.println("Valor em Farenheit: " + conversao);


        teclado.close();

    }
}
