package org.example.artigo.service.cadastro;

import org.example.artigo.model.Empresa;
import org.example.artigo.model.Produto;
import org.example.artigo.service.ReceberValor;

import java.util.List;

public class CadastroFatory {

    private int opcao = 0;

    private List<Produto> produtos;

    ReceberValor receberValor = new ReceberValor();

    public CadastroFatory() {
    }

    public List<String> criar(){
        do{

            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastrar Empresa");
            System.out.println("Opção 2 - Cadastrar Produto");
            System.out.println("Opção 3 - Listar Empresas");
            System.out.println("Opção 4 - Listar Produtos");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = receberValor.obterValorInteiro();

            switch (opcao){
                case 1: new CadastroEmpresaService().cadastrarEmpresa();
                case 2: new CadastroProdutoService().cadastrarProduto();
                case 3: new CadastroEmpresaService().imprimirEmpresa();
                case 4: new CadastroProdutoService().imprimirProduto();
            }




        } while (opcao != 0);

        return null;


    }



    public List<Produto> receberProdutos () {
        produtos = new CadastroProdutoService().receberProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);;
        }

        return produtos;
    };



    //aqui vai instanciar as class com as 4 opcoes
}


/*

    Scanner sc = new Scanner(System.in);

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