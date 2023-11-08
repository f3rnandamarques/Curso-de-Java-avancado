package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {

        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }
    Data(int diaInicial, int mesInicial, int anoInicial) {
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    String obterDataFormatada() {
        final String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }
    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}
