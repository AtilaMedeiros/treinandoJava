package org.example.artigo.service.regimeTributario;

import org.example.artigo.model.Produto;

public class RegimeLucroPresumido implements IRegimeTributario {

    public RegimeLucroPresumido() {
    }

    @Override
    public double acrescentarValorImposto(Produto produto) {

        double precoCompra = produto.getPrecoCompra();

        return precoCompra * 1.5;
    }
}
