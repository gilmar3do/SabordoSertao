package com.example.gilmarf.sabordosertao.classes;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Envase {

    private String id;
    private Fruta fruta;
    private Funcionario funcionario;
    private Date data;
    private BigDecimal kgPoupa;
    private BigDecimal qtdDivulente;
    private BigDecimal tempo;

    public Envase(String id, Fruta fruta, Funcionario funcionario, Date data, BigDecimal kgPoupa,
                  BigDecimal qtdDivulente, BigDecimal tempo){
        this.id = id;
        this.fruta = fruta;
        this.funcionario = funcionario;
        this.data = data;
        this.kgPoupa = kgPoupa;
        this.qtdDivulente = qtdDivulente;
        this.tempo = tempo;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getKgPoupa() {
        return kgPoupa;
    }

    public void setKgPoupa(BigDecimal kgPoupa) {
        this.kgPoupa = kgPoupa;
    }

    public BigDecimal getQtdDivulente() {
        return qtdDivulente;
    }

    public void setQtdDivulente(BigDecimal qtdDivulente) {
        this.qtdDivulente = qtdDivulente;
    }

    public BigDecimal getTempo() {
        return tempo;
    }

    public void setTempo(BigDecimal tempo) {
        this.tempo = tempo;
    }
}
