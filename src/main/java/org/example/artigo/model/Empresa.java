package org.example.artigo.model;

import java.util.Objects;

public class Empresa {

    private static int count = 1;
    private int id;
    private String nome;
    private String tipo;

    public Empresa(String nome, String tipo) {
        this.id =  + count;
        this.nome = nome;
        this.tipo = tipo;
        count ++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return id == empresa.id && Objects.equals(nome, empresa.nome) && Objects.equals(tipo, empresa.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, tipo);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
