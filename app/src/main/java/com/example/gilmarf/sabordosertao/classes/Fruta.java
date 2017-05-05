package com.example.gilmarf.sabordosertao.classes;

/**
 * Created by gilmarf on 04/05/2017.
 */

public class Fruta {

    private String id;
    private String nome;

    public Fruta(String id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
