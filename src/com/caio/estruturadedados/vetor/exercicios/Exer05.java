package com.caio.estruturadedados.vetor.exercicios;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class Exer05 {
    public static void main(String[] args) {

        //Implementacao de metodo para remover todos os elementos no VetorGenerico
        var vetor = new VetorGenerico<String>(5);

        vetor.adiciona("Gabriela");
        vetor.adiciona("Ana");
        vetor.adiciona("Maria");
        vetor.adiciona("Carlos");

        System.out.println(vetor);

        vetor.remove();

        System.out.println("Vetor removido: " + vetor);



    }
}
