package fundamentos.fundamentos;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        /** 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área. */


        Scanner teclado  = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = teclado.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = teclado.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A Área do triângulo é: " + area);

        teclado.close();
    }
}
