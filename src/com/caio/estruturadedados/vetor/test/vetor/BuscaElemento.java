package com.caio.estruturadedados.vetor.test.vetor;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class BuscaElemento {
    public static void main(String[] args) {

        var vetor = new Vetor(12);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");

        System.out.println(vetor.busca("elemento 4"));
        System.out.println(vetor.busca("elemento 12"));
    }
}
