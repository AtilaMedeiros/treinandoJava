package org.example;

import org.example.artigo.model.Produto;
import org.example.artigo.service.cadastro.CadastroEmpresaService;
import org.example.artigo.service.cadastro.CadastroFatory;
import org.example.artigo.service.cadastro.CadastroProdutoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {



           new CadastroFatory().criar();


//
//       List<Produto> cadastroFatory = new CadastroFatory().receberProdutos();
//
//        System.out.println(cadastroFatory.toString());

//        ReceberValor receberValor = new ReceberValor();
//
//        String nome = receberValor.obterValorTexto();
//
//        System.out.println(nome);

//        new CadastroEmpresaService().cadastrar();
//
//        new CadastroEmpresaService().imprimir();

        //CadastroProdutoService cadastroProdutoService = new CadastroProdutoService();

        //cadastroProdutoService.cadastrar();
        //cadastroProdutoService.imprimir();

    //int choise = EntradaDadosService.getData();


    //ScanService.getMenu();


 /*       Scanner sc = new Scanner(System.in);

        Produto produto;
        Empresa empresa;
        int opcao = 0;

        List<Empresa> empresas = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();


        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastrar Empresa");
            System.out.println("Opção 2 - Cadastrar Produto");
            System.out.println("Opção 3 - Listar Empresas");
            System.out.println("Opção 4 - Listar Produtos");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            //cadastro empresa
            if (opcao == 1) {

                System.out.println("Digite o nome da empresa:");
                String nomeEmpresa = sc.nextLine();

                System.out.println("Digite o tipo da empresa: 1=Lucro Presumido | 2=Simples Nacional");
                String type = sc.nextLine();

                empresa = new Empresa(nomeEmpresa, type);

                empresas.add(empresa);

                //cadastro produto
            } else if (opcao == 2) {
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = sc.nextLine();

                System.out.println("Digite o preço de compra do produto: ");
                double precoCompra = Double.parseDouble(sc.nextLine());

                System.out.println("Digite o codigo da Empresa que o produto esta vinculado: ");
                String codigoEmpresa = sc.nextLine();

                produto = new Produto(nomeProduto, precoCompra, codigoEmpresa);

                produtos.add(produto);

                //listar empresas
            } else if (opcao == 3) {

                if (empresas.isEmpty()){
                    System.out.println("Não existem Empresas cadastradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                }else {
                    System.out.println(empresas.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }

                //listar produtos
            }else if (opcao == 4) {

                if (produtos.isEmpty()){
                    System.out.println("Não existem Produtos cadastrados, pressione uma tecla para continuar!");
                    sc.nextLine();
                }else {
                    System.out.println(produtos.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }

            }

        } while (opcao != 0);

        sc.close();

        Iterator<Empresa> iteratorEmpresa = empresas.iterator();

        System.out.println(empresas.toString());
        System.out.println(produtos.toString());

        while(iteratorEmpresa.hasNext()){

            Empresa cadaEmpresa  = iteratorEmpresa.next();

            String idEmpresa = Integer.toString(cadaEmpresa.getId());

            //foi injetado em regimeTributario a implementacao RegimeLucroPresumido ou RegimeSimplesNacional
            IRegimeTributario IRegimeTributario = new RegimeTributarioFatory().findTributacao(cadaEmpresa);

            //delegando para esse class. Precisou dessa linha a mais
            PrecificacaoService precificacaoService = new PrecificacaoService(IRegimeTributario);


            System.out.println("\n" + cadaEmpresa.getNome());
            System.out.println("=======================");


            for(Produto cadaProduto: produtos){

                String codigoEmpresa = cadaProduto.getCodigoEmpresa();

                if(codigoEmpresa.equals(idEmpresa)){

                    //uso o method do implemento para aplicar a regra matematica no produto
                    //double valorVenda = regimeTributario.acrescentarValorImposto(cadaProduto);

                    double valorVenda = precificacaoService.calcularPrecoVenda(cadaProduto);

                    System.out.println("Nome: " + cadaProduto.getNome() + " | Valor: " + valorVenda + " | Codigo Empresa: " + cadaProduto.getCodigoEmpresa());

                }


            }



        }
*/
    }


}
/*
        List<Produto> produtos = new ArrayList<>();
        Produto produtoA = new Produto("cadeira", 10, "1");
        Produto produtoB = new Produto("mesa", 10, "1");
        Produto produtoC = new Produto("jarro", 10, "2");
        Produto produtoD = new Produto("portaCopo", 10, "2");
        Produto produtoE = new Produto("pano", 10, "3");
        Produto produtoF = new Produto("carta", 12, "3");
        produtos.add(produtoA);
        produtos.add(produtoB);
        produtos.add(produtoC);
        produtos.add(produtoD);
        produtos.add(produtoE);
        produtos.add(produtoF);

        List<Empresa> empresas = new ArrayList<>();
        Empresa empresaA = new Empresa("Empresa A", "1");
        Empresa empresaB = new Empresa("Empresa B", "2");
        Empresa empresaC = new Empresa("Empresa C", "2");
        empresas.add(empresaA);
        empresas.add(empresaB);
        empresas.add(empresaC);
*/





