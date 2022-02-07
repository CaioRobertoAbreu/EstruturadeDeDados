package com.caio.estruturadedados.vetor.test.classejava;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        var nomes = new ArrayList<String>();

        nomes.add("Ana");
        nomes.add("Beatriz");
        nomes.add("Caio");
        nomes.add("Daniel");
        System.out.println(nomes);

        nomes.add(0, "Alexandre");
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);

        var contem = "Ana";
        System.out.println("Contem " + contem + ": " + nomes.contains(contem));

        var posicaoElemento = nomes.indexOf("Daniel");
        System.out.println("posicao: " + posicaoElemento);

    }
}
