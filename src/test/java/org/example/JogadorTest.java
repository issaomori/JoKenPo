package org.example;

import org.junit.jupiter.api.Test;
//alt + enter, faz uma janela de diagolo.

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void shouldLibftfWinAgainstPrintf(){
        Jogador jogador1 = new Jogador(1,"libft");
        Jogador jogador2 = new Jogador(2, "printf");
        //jogadores invertidos
        Jogador jogador3 = new Jogador(3,"printf");
        Jogador jogador4 = new Jogador(4, "libft");

        jogador1.avaliarJogada(jogador2);
        jogador3.avaliarJogada(jogador4);

        System.out.println(jogador1.toString());
        System.out.println(jogador2.toString());
        System.out.println(jogador3.toString());
        System.out.println(jogador4.toString());


        assertTrue(jogador1.venceu);
        assertTrue(jogador4.venceu == false);
    }
    @Test
    void shouldPrintfloserAgainstPrintf(){
        Jogador jogador1 = new Jogador(1,"printf");
        Jogador jogador2 = new Jogador(2, "libft");

        jogador1.avaliarJogada(jogador2);


        assertTrue(jogador1.venceu);
    }

}