package com.curso.pjto4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        ListView listaDeItens = (ListView) findViewById(R.id.lvProdutos);
        ArrayList<Produtos> produtos = adicionarProdutos();
        ArrayAdapter adapter = new ProdutoAdapter(this, produtos);
        listaDeItens.setAdapter(adapter);

        listaDeItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ProdutosActivity.this, ItemProdutoActivity.class);
                startActivity(intent);
                intent.putExtra("nome", (String) produtos.get(i).getNome());
            }
        });
    }

    private ArrayList<Produtos> adicionarProdutos() {
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        Produtos e = new Produtos("Alicate",
                "R$ 30,00", R.drawable.falicate);
        produtos.add(e);
        e = new Produtos("Equipamentos de Proteção Individual",
                "R$ 82,00", R.drawable.fepi);
        produtos.add(e);
        e = new Produtos("Escada",
                "R$ 140,00", R.drawable.fescada);
        produtos.add(e);
        e = new Produtos("Furadeira",
                "R$ 200,00", R.drawable.ffuradeira);
        produtos.add(e);
        e = new Produtos("Marreta",
                "R$ 70,00", R.drawable.fmarreta);
        produtos.add(e);
        e = new Produtos("Martelo",
                "R$ 40,85", R.drawable.fmartelo);
        produtos.add(e);
        e = new Produtos("Tijolos",
                "R$ 0,85", R.drawable.tijolo);
        produtos.add(e);
        e = new Produtos("Cimentos",
                "R$ 48,00", R.drawable.cimento);
        produtos.add(e);
        e = new Produtos("Telhas",
                "R$ 55,00", R.drawable.telhas);
        produtos.add(e);
        e = new Produtos("Forros e Gesso",
                "R$ 120,00", R.drawable.piso);
        produtos.add(e);
        e = new Produtos("Canos",
                "R$ 40,00", R.drawable.canos);
        produtos.add(e);
        e = new Produtos("Madeiras",
                "R$ 35,00", R.drawable.tabuas);
        produtos.add(e);
        e = new Produtos("Sofá",
                "R$ 2050,00", R.drawable.msofa);
        produtos.add(e);
        e = new Produtos("Poltrona",
                "R$ 300,00", R.drawable.mpoltrona);
        produtos.add(e);
        e = new Produtos("Lâmpadas",
                "R$ 90,00", R.drawable.mlampada);
        produtos.add(e);
        e = new Produtos("Espelhos",
                "R$ 200,00", R.drawable.mespelho);
        produtos.add(e);
        e = new Produtos("Cadeiras",
                "R$ 110,00", R.drawable.mcadeira);
        produtos.add(e);
        e = new Produtos("Armários",
                "R$ 700,00", R.drawable.marmario);
        produtos.add(e);

        return produtos;
    }
}