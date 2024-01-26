package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes,d1.ano);

        var d2 = new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2020;

        String dataFortmata1 = d1.obterDataFormatada();


        System.out.println(dataFortmata1);
        System.out.println(d2.obterDataFormatada());


        d1.imprimirDataFormatada();



    }
}
