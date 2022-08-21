package org.example.artigo.model;

public class Produto {

    private String nome;
    private double precoCompra;
    private String codigoEmpresa;


    public Produto(String nome, double precoCompra, String codigoEmpresa) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", codigoEmpresa=" + codigoEmpresa +
                '}';
    }
}
