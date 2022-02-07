package com.caio.estruturadedados.vetor.test.vetor;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class RemovendoElemento {
    public static void main(String[] args) {

        var vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        vetor.remover(4);
        System.out.println(vetor);

        vetor.adiciona("L");
        System.out.println(vetor);

        var indice = vetor.busca("C");

        if(indice != -1) vetor.remover(indice);
        System.out.println(vetor);

    }
}
