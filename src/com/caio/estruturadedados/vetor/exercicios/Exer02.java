package com.caio.estruturadedados.vetor.exercicios;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class Exer02 {
    public static void main(String[] args) {

        //Implementacao do metodo lastIndex no VetorGenerico
        var vetor = new VetorGenerico<String>(5);

        vetor.adiciona("Carlos");
        vetor.adiciona("Ana");
        vetor.adiciona("Maria");
        vetor.adiciona("Carlos");

        var nomeDeBusca1 = "Carlos";
        var nomeDeBusca2 = "Jose";

        System.out.println("Ultima posicao " + nomeDeBusca1 + ": " + vetor.lastIndexOf(nomeDeBusca1));
        System.out.println("Ultima posicao " + nomeDeBusca2 + ": " + vetor.lastIndexOf(nomeDeBusca2));



    }
}
