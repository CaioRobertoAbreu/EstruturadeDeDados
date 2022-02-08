package com.caio.estruturadedados.vetor.test;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class ImprimindoValorPorPosicao {

    public static void main(String[] args) {

        var vetor = new Vetor(12);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");

        System.out.println(vetor.busca(5));
    }
}
