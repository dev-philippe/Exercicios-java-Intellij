package fundamentos.fundamentos.operadores;

public class DesafiosLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (v ou F)
        // Trabalho na quinta (V oui F)


        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        // Operador unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou tv 50\"? " + comprouTv50);
        System.out.println("Comprou tv 32\"? " + comprouTv32);
        System.out.println("Comprou o sorvete\"? " + comprouSorvete);

        System.out.println("Mais saudável? " + maisSaudavel);









    }
}
