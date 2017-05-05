package com.example.gilmarf.sabordosertao.enums;

/**
 * Created by gilmarf on 05/05/2017.
 */

public enum TipoProdutoEnum {

    PULP( "PULP" ),
    FRUIT( "FRUIT" ),
    BAG_100( "BAG_100" ),
    BAG_500( "BAG_500" ),
    BAG( "BAG" ),
    LABEL( "LABEL" );

    private String name;

    private TipoProdutoEnum(String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };

    public static String getByName( String name ) {
        for ( TipoProdutoEnum o : TipoProdutoEnum.values() ) {
            if ( o.name.equals( name ) )
                return o.name;
        }
        return null;
    }


}
