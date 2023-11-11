package fundamentos.fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario;

        // Tipos numéricos inteiros
        byte anosDEEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos númericos reais

        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano;

        boolean estaDeFerias = false; // true;

        // Tipo caractere
        char status = 'A'; // ativo;

        // Dias de empresa
        System.out.println(anosDEEmpresa * 365);

        // Números de viagens
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha --> " + salario);
        System.out.println("Feriás? " + estaDeFerias);
        System.out.println("Status: " + status);







    }
}
