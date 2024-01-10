package fundamentos.fundamentos;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        /** 3. Criar um programa que leia o peso e altura do usuário e imprima no console IMC. */


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        teclado.close();
    }
}
