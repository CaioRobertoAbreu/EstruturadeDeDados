package com.caio.estruturadedados.vetor.exercicios;

import com.caio.estruturadedados.vetor.classe.VetorGenerico;

public class Exer04 {
    public static void main(String[] args) {

        //Implementacao de metodo get (de ArrayList) no VetorGenerico
        var vetor = new VetorGenerico<String>(5);

        vetor.adiciona("Gabriela");
        vetor.adiciona("Ana");
        vetor.adiciona("Maria");
        vetor.adiciona("Carlos");

        var nomeABuscar = "Ana";
        System.out.println(vetor.get(2));



    }
}
