package org.example.artigo.service.cadastro;

import org.example.artigo.model.Empresa;
import org.example.artigo.model.Produto;

import java.util.List;

public abstract class Cadastro {

    public List<Empresa> cadastrarEmpresa(){return null;};

    public List<Produto> cadastrarProduto(){return null;};

    public void imprimirEmpresa(){};

    public void imprimirProduto(){};

}
