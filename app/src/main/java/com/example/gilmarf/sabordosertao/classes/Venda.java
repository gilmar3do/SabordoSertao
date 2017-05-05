package com.example.gilmarf.sabordosertao.classes;

import com.example.gilmarf.sabordosertao.enums.TipoVendaEnum;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Venda {

    private String id;
    private Fruta fruta;
    private Date data;
    private Integer quantidade;
    private TipoVendaEnum tipoVenda;
    private BigDecimal precoTotal;
    private BigDecimal kmPercorrido;
    private BigDecimal combustivel;

    public Venda(String id, Fruta fruta, Date data, Integer quantidade, TipoVendaEnum tipoVenda,
                 BigDecimal precoTotal, BigDecimal kmPercorrido, BigDecimal combustivel){
        this.id = id;
        this.fruta = fruta;
        this.data = data;
        this.quantidade = quantidade;
        this.tipoVenda = tipoVenda;
        this.precoTotal = precoTotal;
        this.kmPercorrido = kmPercorrido;
        this.combustivel = combustivel;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public TipoVendaEnum getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(TipoVendaEnum tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
    }

    public BigDecimal getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(BigDecimal kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public BigDecimal getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(BigDecimal combustivel) {
        this.combustivel = combustivel;
    }
}
