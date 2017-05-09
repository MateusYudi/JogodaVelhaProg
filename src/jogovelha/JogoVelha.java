package jogovelha;

import javax.swing.JOptionPane;

public class JogoVelha {

    Jogador jogador1;
    Jogador jogador2;
    boolean simboloigual; //Booleana para verificação dos simbolos
    boolean jogadorvencedor;
    public JogoVelha() {
        jogador1 = new Jogador(); //Inicializar jogador
        jogador2 = new Jogador();
    }

    public void IniciarJogo(String jogadornome1, String jogadornome2, String jogadorsimbolo1, String jogadorsimbolo2) { //Pegar nomes e simbolos
        jogador1.setNome(jogadornome1); 
        jogador2.setNome(jogadornome2);
        jogador1.setSimbolo(jogadorsimbolo1);
        jogador2.setSimbolo(jogadorsimbolo2);

    }

    public void VerificarSimbolo() { //Se simbolos forem iguais não pode jogar
        if (jogador1.getSimbolo().equals(jogador2.getSimbolo())) { 
            JOptionPane.showMessageDialog(null, "Simbolo Igual.");
            simboloigual = true;
        } else {
            simboloigual = false;
        }
    }

    public boolean VerificarGanhador(String campo1, String campo2, String campo3, String campo4, String campo5,
            String campo6, String campo7, String campo8, String campo9, boolean jogador) { //Verificação de ganhadores
        jogadorvencedor = jogador;
        if (campo1.equals(campo2) && campo1.equals(campo3) && campo1 != " ") {
            if (jogadorvencedor == false) { //Saber se foi jogador 1 ou 2
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true; //Booleana para poder mudar nomes
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo4.equals(campo5) && campo4.equals(campo6) && campo4 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo7.equals(campo8) && campo7.equals(campo9) && campo7 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo1.equals(campo4) && campo1.equals(campo7) && campo1 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo2.equals(campo5) && campo2.equals(campo8) && campo2 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo3.equals(campo6) && campo3.equals(campo9) && campo3 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo1.equals(campo5) && campo1.equals(campo9) && campo1 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        }
        if (campo3.equals(campo5) && campo3.equals(campo7) && campo3 != " ") {
            if (jogadorvencedor == false) {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador1.getNome());
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Vencedor: " + jogador2.getNome());
                return true;
            }
        } else if(campo1 != " " && campo2 != " " && campo3 != " " && campo4 != " " && campo5 != " " && campo6 != " " && campo7 != " " && campo8 != " " && campo9 != " "){
            JOptionPane.showMessageDialog(null, "Velha.");
            return true;
            
        }
        return true;
    }
    
    public boolean MudarNome(){
        return true;
    }
}
