package com.caio.estruturadedados.vetor.classe;

public class VetorGenerico<T> {

    private T[] elementos;
    private Integer tamanho;

    public VetorGenerico(Integer capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public boolean adiciona(Integer posicao, T elemento){
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

    public T busca(Integer posicao){

        verificaPosicaoInvalida(posicao);

        return this.elementos[posicao];
    }

    public Integer buscaElemento(T elemento){

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
            var novoArray = (T[]) new Object[novoTamanho];

            for(int i = 0; i < tamanho; i++){
                novoArray[i] = this.elementos[i];
            }

            this.elementos = novoArray;
        }
    }

    public boolean contem(T elemento){

       return buscaElemento(elemento) > -1;
    }

    public Integer lastIndexOf(T elemento){

        for (int i = this.tamanho-1; i > -1; i--){

            if(this.elementos[i].equals(elemento)){
                return  i;
            }
        }

        return -1;

    }

    public void remove(T elemento){

        var posicao = buscaElemento(elemento);

        if(posicao > -1){
            remover(posicao);
        }
    }

    public T get(int posicao){
        return busca(posicao);
    }

    private void verificaPosicaoInvalida(int posicao){
        if(!(posicao < tamanho && posicao >= 0)){

            throw  new IllegalArgumentException("Posicao Invalida");
        }
    }
}
