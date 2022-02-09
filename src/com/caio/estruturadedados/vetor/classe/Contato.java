package com.caio.estruturadedados.vetor.classe;

import java.util.Objects;

public class Contato {

    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return email.equals(contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
