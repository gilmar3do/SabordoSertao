package com.example.gilmarf.sabordosertao.classes;

import com.example.gilmarf.sabordosertao.enums.TipoProdutoEnum;

import java.math.BigDecimal;

/**
 * Created by gilmarf on 05/05/2017.
 */

public class Estoque {

    private String id;
    private Fruta fruta;
    private String medida;
    private BigDecimal quantidade;
    private TipoProdutoEnum tipoProduto;

    public Estoque(String id, Fruta fruta, String medida,
                   BigDecimal quantidade, TipoProdutoEnum tipoProduto){
        this.id = id;
        this.fruta = fruta;
        this.medida = medida;
        this.quantidade = quantidade;
        this.tipoProduto = tipoProduto;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public TipoProdutoEnum getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProdutoEnum tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
