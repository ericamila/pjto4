package com.curso.pjto4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ItemProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_produto);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("nome");

        TextView nome = this.findViewById(R.id.textView6);

        nome.setText(parametro);

    }

}