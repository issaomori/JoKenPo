package org.example;

public class Jogador {
   //Estados!!(variaveis)
    public int numero;
    public String jogada;
    public boolean venceu;

    //Construtor!!
    public Jogador(int numero, String jogada){
        this.numero = numero;
        this.jogada = jogada;
        this.venceu = false;
    }
    private void oponenteJogouPrintf(Jogador oponente){
        if (this.jogada.equals("libft")){
            System.out.println("jogador " + this.numero + " ganhou");
            this.venceu = true;
        }
        else if (this.jogada.equals("gnl")){
            System.out.println("jogador " + oponente.numero + " ganhou");
            oponente.venceu = true;
        }
        else{
            System.out.println("empatou");
        }
    }

    private void oponenteJogouGnl(Jogador oponente){
        if (this.jogada.toLowerCase().equals("libft")){
            System.out.println("jogador " + oponente.numero + " ganhou");
        }
        else if (this.jogada.toLowerCase().equals("printf")){
            System.out.println("jogador " + this.numero + " ganhou");
        }
        else{
            System.out.println("empatou");
        }
    }

    private void oponenteJogouLibft(Jogador oponente){
        if (this.jogada.toLowerCase().equals("gnl")){
            System.out.println("jogador " + this.numero + " ganhou");
            this.venceu = true;
        }
        else if (this.jogada.toLowerCase().equals("printf")){
            System.out.println("jogador " + oponente.numero + " ganhou");
            oponente.venceu = true;
        }
        else{
            System.out.println("empatou");
        }
    }
    public void avaliarJogada(Jogador oponente){
        if (oponente.jogada.toLowerCase().equals("printf")){
            oponenteJogouPrintf(oponente);
        } else if (oponente.jogada.toLowerCase().equals("gnl")) {
            oponenteJogouGnl(oponente);
        } else {
            oponenteJogouLibft(oponente);
        }

    }

    @Override
    public String toString() {
        return "Jogador{" +
                "numero=" + numero +
                ", jogada='" + jogada + '\'' +
                ", venceu=" + venceu +
                '}';
    }
}
