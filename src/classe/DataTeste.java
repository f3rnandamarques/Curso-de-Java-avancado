package classe;

public class DataTeste {
    public static void main(String[] args) {

    Data d1 = new Data();

    var d2 = new Data(31, 12, 2020);
    d2.dia = 31;
    d2.mes = 12;
    d2.ano = 2012;

    System.out.println(d1.obterDataFormatada());
    System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
