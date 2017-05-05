package com.example.gilmarf.sabordosertao.classes;

import java.util.List;

/**
 * Created by gilmarf on 05/05/2017.
 */

public class NotaVenda {

    private String id;
    private List<Venda> vendas;

    public NotaVenda(String id, List<Venda> vendas){
        this.id = id;
        this.vendas = vendas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
