package controle;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {

        /** 3. Criar um programa que receba duas notas parciais,calcular a média
         * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
         * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime
         * no console "Recuperação" , caso contrário imprime no console  " reprovado"
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota Parcial 1: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Nota Parcial 2: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Sua média foi " + media + " e  vc está aprovado");
        } else if (media >= 4) {
            System.out.println("Sua média foi " + media + " e você esta de recuperação");

        }else {
            System.out.println("Sua média foi " + media + " e você está reprovado");
        }
    }
}
