package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // Atribuição por referência (objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());


        voltaDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitvo(c);
        System.out.println(c);
    }

    static void voltaDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;


    }

    static void alterarPrimitvo(int a ){
        a++;

    }


}
