package com.caio.estruturadedados.vetor.test;

import com.caio.estruturadedados.vetor.classe.Vetor;

public class AumentaTamanhoVetor {
    public static void main(String[] args) {


        var v1 = new Vetor(3);

        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        System.out.println(v1.toString());


        v1.adiciona("D");
        v1.adiciona("E");
        v1.adiciona("F");
        System.out.println(v1.toString());
    }
}
