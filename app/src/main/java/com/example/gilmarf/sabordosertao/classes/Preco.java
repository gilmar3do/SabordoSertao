package com.example.gilmarf.sabordosertao.classes;

import com.example.gilmarf.sabordosertao.enums.TipoVendaEnum;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Preco {

    private String id;
    private Fruta fruta;
    private BigDecimal preco;
    private Date dataInicial;
    private Date dataFinal;
    private TipoVendaEnum tipoVenda;

    public Preco(String id, Fruta fruta, BigDecimal preco, Date dataInicial,
                 Date dataFinal, TipoVendaEnum tipoVenda){
        this.id = id;
        this.fruta = fruta;
        this.preco = preco;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoVenda = tipoVenda;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public TipoVendaEnum getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(TipoVendaEnum tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
}
