package org.example.artigo.service.cadastro;

import org.example.artigo.model.Empresa;
import org.example.artigo.service.ReceberValor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastroEmpresaService extends Cadastro{

    private String nomeEmpresa;
    private String tipo;
    private Empresa empresa;
    private ReceberValor receberValor = new ReceberValor();
    private static List<Empresa> empresas = new ArrayList<>();


    @Override
    public List<Empresa> cadastrarEmpresa() {

        System.out.println("Digite o nome da empresa:");
        nomeEmpresa = receberValor.obterValorTexto();

        System.out.println("Digite o tipo da empresa: 1=Lucro Presumido | 2=Simples Nacional");
        tipo =  receberValor.obterValorTexto();

        empresa = new Empresa(nomeEmpresa, tipo);
        empresas.add(empresa);

        return empresas;
    }

    @Override
    public void imprimirEmpresa() {
        System.out.println(empresas.toString());
    }

    //    @Override
//    public void cadastrar() {
//
//        System.out.println("Digite o nome da empresa:");
//        nomeEmpresa = receberValor.obterValorTexto();
//
//        System.out.println("Digite o tipo da empresa: 1=Lucro Presumido | 2=Simples Nacional");
//        tipo =  receberValor.obterValorTexto();
//
//        empresa = new Empresa(nomeEmpresa, tipo);
//        empresas.add(empresa);
//
//
//    }
//    @Override
//    public void imprimir(){
//        System.out.println(empresas.toString());
//    }

}

