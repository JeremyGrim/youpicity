package com.cdi.youpicity.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cdi.youpicity.R;
import com.cdi.youpicity.models.Etapes;
import com.cdi.youpicity.models.Parcours;
import com.cdi.youpicity.parcours.ParcoursActivity;

import java.util.List;

/**
 * Created by grim on 03/09/2017.
 */

public class EtapesAdapter extends ArrayAdapter<Etapes> {

    public EtapesAdapter(Context context, List<Etapes> etapes) {

        super(context, 0, etapes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.model_liste_etapes,parent, false);
        }

        EtapesAdapter.EtapeViewHolder viewHolder = (EtapesAdapter.EtapeViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new EtapesAdapter.EtapeViewHolder();
            viewHolder.Adresse = (TextView) convertView.findViewById(R.id.adresse);
            viewHolder.Indice = (TextView) convertView.findViewById(R.id.indice);
            convertView.setTag(viewHolder);
        }

        final Etapes etape = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.Adresse.setText(etape.getAdresse());
        viewHolder.Indice.setText(etape.getIndice());

        return convertView;
    }


    private class EtapeViewHolder{
        public TextView Adresse;
        public TextView Indice;
    }
}
