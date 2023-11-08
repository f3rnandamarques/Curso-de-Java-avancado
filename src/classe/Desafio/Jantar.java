package classe.Desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.8);
        Comida c2 = new Comida("Feijão", 0.5);

        Pessoa p = new Pessoa("Fernanda", 60);

        System.out.println(p.apresentar());

        p.comer(c1);
        System.out.println(p.apresentar());

        p.comer(c1);
        p.comer(c2);
        System.out.println(p.apresentar());

    }
}
