package org.example.artigo.service.cadastro;

import org.example.artigo.model.Empresa;
import org.example.artigo.model.Produto;
import org.example.artigo.service.ReceberValor;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoService extends Cadastro{

    private String nomeProduto;
    private Double precoCompra;
    private String codigoEmpresa;
    private Produto produto;

    private static List<Produto> produtos = new ArrayList<>();
    protected ReceberValor receberValor = new ReceberValor();

    @Override
    public List<Produto> cadastrarProduto(){

        System.out.println("Digite o nome do produto: ");
        nomeProduto = receberValor.obterValorTexto();

        System.out.println("Digite o preço de compra do produto: ");
        precoCompra = receberValor.obterValorDouble();

        System.out.println("Digite o codigo da Empresa que o produto esta vinculado: ");
        codigoEmpresa = receberValor.obterValorTexto();

        produto = new Produto(nomeProduto,precoCompra, codigoEmpresa);
        produtos.add(produto);

        return produtos;

    }
    @Override
    public void imprimirProduto(){
        System.out.println(produtos.toString());
    }

    public List<Produto> receberProdutos(){
        return produtos;
    }

}

