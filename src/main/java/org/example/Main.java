package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //public: método público, O que é método?
    //static: não é necessário istanciar o objeto da classe. Não pode usar o "This", porque eh static.
    //void: retorno da func.
    public static void main(String[] args){
        Jogador jogador1 = new Jogador(1,"printf");
        Jogador jogador2 = new Jogador(2, "Gnl");

        jogador1.avaliarJogada(jogador2);

//        System.out.println("jogador_1 = " + jogador_1.jogada);
//        System.out.println("jogador_2 = " + jogador_2.jogada);
//
////        if (jogador_1.jogada == "printf" && jogador_2.jogada == "libft")
////            System.out.println("jogador_2 venceu");
//        if (jogador_1.jogada == "printf") {
//            if (jogador_2.jogada == "libft")
//                System.out.println("jogador_2 venceu");
//            else if (jogador_2.jogada == "gnl")
//                System.out.println("jogador_1 venceu");
//            else
//                System.out.println("Empatou");
//        }
    }
}