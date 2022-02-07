package com.caio.estruturadedados.vetor.test.vetor;

import com.caio.estruturadedados.vetor.classe.VetorObjetos;

public class TesteVetorObjetos {

    public static void main(String[] args) {

        var vetorObjetos = new VetorObjetos(3);

        vetorObjetos.adiciona(3);
        vetorObjetos.adiciona(4);
        vetorObjetos.adiciona(5);

        System.out.println(vetorObjetos);

    }
}
