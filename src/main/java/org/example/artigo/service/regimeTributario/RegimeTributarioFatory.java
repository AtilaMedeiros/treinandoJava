package org.example.artigo.service.regimeTributario;

import org.example.artigo.model.Empresa;



//o retorno dessa fatory injeta os membros de LucroPresumido ou SimplesNational na interface RegimeTributario

public class RegimeTributarioFatory {

    public RegimeTributarioFatory() {
    }

    public static IRegimeTributario findTributacao(Empresa empresa){
        if ("1".equals(empresa.getTipo())) return new RegimeLucroPresumido();
        else if ("2".equals(empresa.getTipo())) return new RegimeSimplesNational();

        throw new RuntimeException(String.format("Tipo %s Invalido",empresa.getTipo()) );

    }

}
