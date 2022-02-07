package com.caio.estruturadedados.vetor.classe;

public class VetorObjetos {

    private Object[] elementos;
    private Integer tamanho;

    public VetorObjetos(Integer capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento){
        aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public boolean adiciona(Integer posicao, Object elemento){
        aumentaCapacidade();
        verificaPosicaoInvalida(posicao);

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

    public Object busca(Integer posicao){

        verificaPosicaoInvalida(posicao);

        return this.elementos[posicao];
    }

    public Integer busca(String elemento){

        for (int i = 0; i < tamanho; i++){

            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public void remover(int posicao){
        verificaPosicaoInvalida(posicao);
        for(int i = posicao; i < tamanho; i++){

            if(i == (tamanho-1)){
                this.elementos[i] = null;

            }else {

                this.elementos[i] = this.elementos[i+1];
            }
        }

        this.tamanho--;
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

        if(this.tamanho == this.elementos.length){
            var novoTamanho = this.elementos.length * 2;
            var novoArray = new Object[novoTamanho];

            for(int i = 0; i < tamanho; i++){
                novoArray[i] = this.elementos[i];
            }

            this.elementos = novoArray;
        }
    }

    private void verificaPosicaoInvalida(int posicao){
        if(!(posicao < tamanho && posicao >= 0)){

            throw  new IllegalArgumentException("Posicao Invalida");
        }
    }
}
