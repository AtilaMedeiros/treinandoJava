package org.example.artigo.service.regimeTributario;

import org.example.artigo.model.Produto;

public class RegimeSimplesNational implements IRegimeTributario {

    public RegimeSimplesNational() {
    }

    @Override
    public double acrescentarValorImposto(Produto produto) {

        double precoCompra = produto.getPrecoCompra();

        return precoCompra * 2.5;
    }
}
