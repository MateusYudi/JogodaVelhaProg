package jogovelha;

public class Jogador {

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String simbolo;
    private String nome;
    String jogada;

    public Jogador() {
        this.nome = " ";
        this.simbolo = " ";
    }
}
