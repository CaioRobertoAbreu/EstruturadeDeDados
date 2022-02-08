package com.caio.estruturadedados.vetor.test;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class AdicionaElementoNaPosicao {
    public static void main(String[] args) {

        var vetor = new Vetor(13);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor.toString());

        vetor.adiciona(0, "A");
        System.out.println(vetor.toString());

        vetor.adiciona(3, "D");
        System.out.println(vetor.toString());

    }
}
