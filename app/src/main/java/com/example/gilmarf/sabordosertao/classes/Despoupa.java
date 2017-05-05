package com.example.gilmarf.sabordosertao.classes;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Despoupa {

    private String id;
    private Fruta fruta;
    private Funcionario funcionario;
    private BigDecimal tempo;
    private BigDecimal kgPoupa;
    private Date data;
    private BigDecimal qtdFinal;

    public Despoupa(String id, Fruta fruta, Funcionario funcionario, BigDecimal tempo, BigDecimal kgPoupa,
                    Date data, BigDecimal qtdFinal){
        this.id = id;
        this.fruta = fruta;
        this.funcionario = funcionario;
        this.tempo = tempo;
        this.kgPoupa = kgPoupa;
        this.data = data;
        this.qtdFinal = qtdFinal;
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

    public BigDecimal getTempo() {
        return tempo;
    }

    public void setTempo(BigDecimal tempo) {
        this.tempo = tempo;
    }

    public BigDecimal getKgPoupa() {
        return kgPoupa;
    }

    public void setKgPoupa(BigDecimal kgPoupa) {
        this.kgPoupa = kgPoupa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getQtdFinal() {
        return qtdFinal;
    }

    public void setQtdFinal(BigDecimal qtdFinal) {
        this.qtdFinal = qtdFinal;
    }
}
