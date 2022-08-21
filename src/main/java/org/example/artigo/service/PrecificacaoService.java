package org.example.artigo.service;

import org.example.artigo.model.Produto;
import org.example.artigo.service.regimeTributario.IRegimeTributario;

public class PrecificacaoService {

    private IRegimeTributario IRegimeTributario;

    //recebe todos os elementos da interface RegimeTributario que por sua vez foi atualizada com a regra da implementacao RegimeTributarioFactory
    public PrecificacaoService(IRegimeTributario IRegimeTributario) {
        this.IRegimeTributario = IRegimeTributario;
    }

    public double calcularPrecoVenda(Produto produto){

        //retornando o method da interface RegimeTributario que tambem recebeu de uma de suas implementaçoes
        return this.IRegimeTributario.acrescentarValorImposto(produto);
    }
}
