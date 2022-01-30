package com.caio.estruturadedados.vetor.classe;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private Integer tamanho;

    public Vetor(Integer capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){

        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public Integer tamanho(){
        return this.tamanho;
    }

    public String busca(Integer posicao){

        if(!(posicao < tamanho && posicao >= 0)){

            throw  new IllegalArgumentException("Posicao Invalida");

        }

        return this.elementos[posicao];
    }

    @Override
    public String toString() {

        var s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < tamanho; i++){

            if(i != tamanho - 1){
                s.append(this.elementos[i]);
                s.append(", ");

            } else {
                s.append(this.elementos[i]);
            }
        }
        s.append("]");

        return s.toString();
    }
}
