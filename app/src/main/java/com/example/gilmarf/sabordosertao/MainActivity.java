package com.example.gilmarf.sabordosertao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaVendaClick(View view){
        startActivity(new Intent(getBaseContext(), NovaVendaActivity.class));
    }

    public void telaDespoupaClick(View view){
        startActivity(new Intent(getBaseContext(), NovaDespoupaActivity.class));
    }

    public void telaDespesaClick(View view){
        startActivity(new Intent(getBaseContext(), NovaDespesaActivity.class));
    }

    public void telaEnvaseClick(View view){
        startActivity(new Intent(getBaseContext(), NovoEnvaseActivity.class));
    }

    public void telaFuncionarioClick(View view){
        startActivity(new Intent(getBaseContext(), NovoFuncionarioActivity.class));
    }

    public void telaRelatorioClick(View view){
        //startActivity(new Intent(getBaseContext(), NovaVenda.class));
    }
}
