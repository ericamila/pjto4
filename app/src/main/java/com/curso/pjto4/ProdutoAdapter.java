package com.curso.pjto4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProdutoAdapter extends ArrayAdapter<Produtos> {
    private final Context context;
    private final ArrayList<Produtos> elementos;

    public ProdutoAdapter(Context context, ArrayList<Produtos> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent,false);
        TextView nomeProduto = (TextView) rowView.findViewById(R.id.nomep);
        TextView preco = (TextView) rowView.findViewById(R.id.precop);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.img1);
        nomeProduto.setText(elementos.get(position).getNome());
        preco.setText(elementos.get(position).getPreco());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }

}
