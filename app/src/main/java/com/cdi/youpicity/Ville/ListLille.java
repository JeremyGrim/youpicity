package com.cdi.youpicity.Ville;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.cdi.youpicity.Home;
import com.cdi.youpicity.R;
import com.cdi.youpicity.adapters.ParcoursAdapter;
import com.cdi.youpicity.layout.Header;
import com.cdi.youpicity.models.Parcours;

import java.util.ArrayList;
import java.util.List;

public class ListLille extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_parcours);

/*        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
        TextView button = (TextView)findViewById( R.id.fa);
        button.setTypeface(font);*/

        mListView = (ListView) findViewById(R.id.liste);

        List<Parcours> parcoursList = genererParcours();

        ParcoursAdapter adapter = new ParcoursAdapter(ListLille.this, parcoursList);
        mListView.setAdapter(adapter);

        final ImageView connexion = (ImageView) findViewById(R.id.homeLink);
        connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListLille.this, Home.class);
                startActivity(intent);
            }
        });


 //   Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
 //   setSupportActionBar(myToolbar);

    }

    private List<Parcours> genererParcours() {
        List<Parcours> infos = new ArrayList<Parcours>();
        infos.add(new Parcours( R.drawable.lille_1,  "Le tours du centre ville", "2 heures"));
        infos.add(new Parcours( R.drawable.lille_2,  "Le tours de lille", "8 heures"));
        infos.add(new Parcours( R.drawable.lille_3,  "Tout Lille en un Weekend", "2 jours"));
        infos.add(new Parcours( R.drawable.lille_4,  "Le tours du centre ville", "2 heures"));
        infos.add(new Parcours( R.drawable.lille_1,  "Tout Lille en un Weekend", "2 jours"));
        infos.add(new Parcours( R.drawable.lille_4,  "Le tours de lille", "8 heures"));
        infos.add(new Parcours( R.drawable.lille_2,  "Le tours du centre ville", "2 heures"));
        infos.add(new Parcours( R.drawable.lille_3,  "Le tours de lille", "8 heures"));
        infos.add(new Parcours( R.drawable.lille_1,  "Tout Lille en un Weekend", "2 jours"));
        infos.add(new Parcours( R.drawable.lille_4,  "Le tours de lille", "8 heures"));
        return infos;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        //ajoute les entrées de menu_test à l'ActionBar
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
}
