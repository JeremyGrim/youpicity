package com.cdi.youpicity.Ville.lille;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.cdi.youpicity.Home;
import com.cdi.youpicity.R;
import com.cdi.youpicity.adapters.EtapesAdapter;
import com.cdi.youpicity.models.Etapes;

import java.util.ArrayList;
import java.util.List;

public class ListeEtapes extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_etapes);

        mListView = (ListView) findViewById(R.id.liste);

        List<Etapes> etapesList = genererEtape();

        EtapesAdapter adapter = new EtapesAdapter(ListeEtapes.this, etapesList);
        mListView.setAdapter(adapter);

        final ImageView connexion = (ImageView) findViewById(R.id.homeLink);
        connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeEtapes.this, Home.class);
                startActivity(intent);
            }
        });


        ImageButton focus = (ImageButton) findViewById(R.id.btn_Parcours);
        focus.setBackgroundResource( R.drawable.ic_parcours_t_focus);
        focus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListeEtapes.this, Home.class);
                startActivity(intent);
            }
        });
    }

    private List<Etapes> genererEtape() {
        List<Etapes> infos = new ArrayList<Etapes>();
        infos.add(new Etapes("Place Charles de Gaulle", "1 indice à trouver"));
        infos.add(new Etapes("Notre-Dame de la Treille", "Étape"));
        infos.add(new Etapes("Opéra de Lille", "2 indices à trouver"));
        infos.add(new Etapes("Palais des beaux Arts", "1 indice à trouver"));
        infos.add(new Etapes("Citadelle de Lille", "Étape"));
        infos.add(new Etapes("Place Charles de Gaulle", "Enigme à résoudre"));
        infos.add(new Etapes("Notre-Dame de la Treille", "1 indices à trouver"));
        infos.add(new Etapes("Opéra de Lille", "Étape"));
        infos.add(new Etapes("Palais des beaux Arts", "2 indices à trouver"));
        infos.add(new Etapes("Citadelle de Lille", "Énigme final"));
        return infos;
    }
}
