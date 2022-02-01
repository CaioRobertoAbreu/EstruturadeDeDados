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
        aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public boolean adiciona(Integer posicao, String elemento){
        aumentaCapacidade();
        if(!(posicao < tamanho && posicao >= 0)){

            throw  new IllegalArgumentException("Posicao Invalida");

        }

        if(this.elementos[posicao] == null){
            this.elementos[posicao] = elemento;
            tamanho++;
            return true;

        }else {

            for(int i = tamanho; i > posicao; i--){
                this.elementos[i] = this.elementos[i-1];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
            return true;
        }
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

    public Integer busca(String elemento){

        for (int i = 0; i < tamanho; i++){

            if(this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }

        return -1;
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

    private void aumentaCapacidade(){

        if(tamanho == this.elementos.length){
            var novoTamanho = this.elementos.length * 2;
            var novoArray = new String[novoTamanho];

            for(int i = 0; i < tamanho; i++){
                novoArray[i] = this.elementos[i];
            }

            this.elementos = novoArray;
        }
    }
}
