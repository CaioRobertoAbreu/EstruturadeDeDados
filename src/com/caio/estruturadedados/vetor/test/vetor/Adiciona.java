package com.caio.estruturadedados.vetor.test.vetor;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class Adiciona {

    public static void main(String[] args) {

        var vetor = new Vetor(2);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println("Tamanho: " + vetor.tamanho());

    }
}
