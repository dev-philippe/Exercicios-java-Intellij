package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "vermelha";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekikin Shodan");
            case "roxa":
                System.out.println("Sei o heian Godan");
            case "verde":
                System.out.println("Sewi o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heidan Sandan");
            case "vermelha":
                System.out.println("Sei o Heian  Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei de nada ");

        }

        System.out.println("Fim!!");

        int idade = 2;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }
}