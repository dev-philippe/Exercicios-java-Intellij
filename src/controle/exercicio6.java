package controle;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        /**
         * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. armazene
         * um número aleatório em uma variável. O jogador tem 10 tentativas para adivinhar o
         * numero gerado. ao final de cada tentativa,imprima a quantidade de tentativas restantes,
         * e imprima se o numero inserido é maior ou menor do que o número armazenado.
         */

        Scanner teclado = new Scanner(System.in);
        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {
            System.out.println("Sorteando numeros entre 0 e 100...\n");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começou o jogo! Sera que consegue me vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativa %d: ", tentativas);
                numero = teclado.nextInt();

                if (numero > numeroSorteado) {
                    System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

                } else if (numero < numeroSorteado) {
                    System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

                } else {

                    System.out.printf("\nParabens! Voce acertou o numeo em %d tentativas!\n\n", tentativas);
                    break;
                }
                }
                while (tentativas != 10) ;

                System.out.println("Digite 0 para sair , ou qualquer outro número para continuar: ");
                continuar = teclado.nextInt();
            } while (continuar != 0);

            teclado.close();

        }

    }




