package classe;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {
        Usuario outro = (Usuario) objeto;

        return outro.nome == this.nome;
    }
}
