package com.example.gilmarf.sabordosertao.classes;

import java.math.BigDecimal;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Despesa {

    private String id;
    private Fruta fruta;
    private BigDecimal quantidade;
    private BigDecimal valor;
    private String tipo;
    private String descricao;

    public Despesa(String id, Fruta fruta, BigDecimal quantidade, BigDecimal valor,
                   String tipo, String descricao){
        this.id = id;
        this.fruta = fruta;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
