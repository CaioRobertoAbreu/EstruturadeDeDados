package com.caio.estruturadedados.vetor.exercicios;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class Exer03 {
    public static void main(String[] args) {

        //Implementacao de metodo para remover elemento T no VetorGenerico
        var vetor = new VetorGenerico<String>(5);

        vetor.adiciona("Gabriela");
        vetor.adiciona("Ana");
        vetor.adiciona("Maria");
        vetor.adiciona("Carlos");

        System.out.println(vetor);

        var nomeARemover = "Ana";
        vetor.remove(nomeARemover);
        System.out.println(vetor);

        var nomeARemover2 = "Jose";
        vetor.remove(nomeARemover2);
        System.out.println(vetor);


    }
}
