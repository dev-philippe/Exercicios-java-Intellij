package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = teclado.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "b";
                break;
            case 6:
            case 5:
                conceito = "c";
                break;

            case 4:
            case 3:
                conceito = "d";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "não encontrado";


        }

        System.out.println("Conceito é " + conceito);


    }
}
