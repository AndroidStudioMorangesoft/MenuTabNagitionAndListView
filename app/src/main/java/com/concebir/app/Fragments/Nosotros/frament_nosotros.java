package com.concebir.app.Fragments.Nosotros;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.concebir.app.R;


public class frament_nosotros extends Fragment {

    int[] IMAGENES ={R.drawable.anonimus_2 , R.drawable.anonimus_3,R.drawable.anonimus_5,R.drawable.anonimus_2 , R.drawable.anonimus_3,R.drawable.anonimus_5};

    String[] NAMES = {"Anonimous 2","Anonimous 3","Anonimous 5","Anonimous 2","Anonimous 3","Anonimous 5"};
    String[] DESCRIPTIONS = {"Caracteristicas 2","Caracteristicas 3","Caracteristicas 5","Caracteristicas 2","Caracteristicas 3","Caracteristicas 5"};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frament_nosotros,container,false);

        ListView listView =(ListView)view.findViewById(R.id.lvItems);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


        return view;

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGENES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.item,null);
            ImageView imageView =(ImageView)view.findViewById(R.id.imgfoto);
            TextView textView_nombre = (TextView)view.findViewById(R.id.tvTitulo);
            TextView textView_contenido = (TextView)view.findViewById(R.id.tvContenido);

            imageView.setImageResource(IMAGENES[i]);
            textView_nombre.setText(NAMES[i]);
            textView_contenido.setText(DESCRIPTIONS[i]);

            return view;
        }
    }



}
