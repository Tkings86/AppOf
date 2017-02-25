package com.example.appof;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.LoginFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

public class TelaprincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Hunter Food");
        setSupportActionBar(toolbar);
        //Populando Array para colocar na Spinner
        //Inicio
        Spinner s_preco = (Spinner) findViewById(R.id.s_preco);
        List<String> preco = new ArrayList<>();
            preco.add("20 reais");
            preco.add("25 reais");
            preco.add("30 reais");
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, preco);
        s_preco.setAdapter(adapterSpinner);

        Spinner s_categoria = (Spinner) findViewById(R.id.s_categoria);
        List<String> categoria = new ArrayList<>();
            categoria.add("Lanche");
            categoria.add("Prato Feito");
            categoria.add("Doçes");
        ArrayAdapter<String> adapterSpinner2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categoria);
        s_categoria.setAdapter(adapterSpinner2);
        //Fim

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.locais){
            return true;
        }
        else if(id == R.id.configuracao){
            return true;
        }
        return super.onContextItemSelected(item);

    }


}
