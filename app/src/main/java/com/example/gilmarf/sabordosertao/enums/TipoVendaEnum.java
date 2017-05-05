package com.example.gilmarf.sabordosertao.enums;

/**
 * Created by gilmarf on 05/05/2017.
 */

public enum TipoVendaEnum {

    WHOLESALE( "WHOLESALE" ),
    RETAIL( "RETAIL" );

    private String name;

    private TipoVendaEnum( String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };

    public static String getByName( String name ) {
        for ( TipoVendaEnum o : TipoVendaEnum.values() ) {
            if ( o.name.equals( name ) )
                return o.name;
        }
        return null;
    }

}
