package com.caio.estruturadedados.vetor.exercicios;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class Exer01 {
    public static void main(String[] args) {

        //Implementacao do metodo contem no VetorGenerico

        var vetor = new VetorGenerico<String>(5);

        vetor.adiciona("Carlos");
        vetor.adiciona("Ana");
        vetor.adiciona("Maria");

        var nomeDeBusca1 = "Jose";
        var nomeDeBusca2 = "Ana";

        System.out.println("Contem " + nomeDeBusca1 + ": " + vetor.contem(nomeDeBusca1));
        System.out.println("Contem " + nomeDeBusca2 + ": " + vetor.contem(nomeDeBusca2));



    }
}
