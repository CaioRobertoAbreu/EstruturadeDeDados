package com.caio.estruturadedados.vetor.test;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class TesteVetorGenerico {
    public static void main(String[] args) {

        var lista = new VetorGenerico<Integer>(5);

        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);
        System.out.println(lista);

        lista.remover(2);
        System.out.println(lista);

        var elementoPosicao = lista.busca(2);
        System.out.println("Elemento na posicao 3: " + elementoPosicao);

        var posicaoElemento = lista.buscaElemento(5);
        System.out.println("Posicao do elemento de valor 5: " + posicaoElemento);


    }
}
