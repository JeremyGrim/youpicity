package com.cdi.youpicity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cdi.youpicity.Ville.ListLille;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final LinearLayout connexion = (LinearLayout) findViewById(R.id.btn_lille);
        connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ListLille.class);
                startActivity(intent);
            }
        });

//       Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
//       setSupportActionBar(myToolbar);


        //    Gestion des fonts

        Typeface font = Typeface.createFromAsset( getAssets(), "Shrikhand-Regular.ttf" );
        TextView title = (TextView)findViewById( R.id.title);
        title.setTypeface(font);


        //    Gestion du menu footer

        ImageButton focus = (ImageButton) findViewById(R.id.btn_Parcours);
        focus.setBackgroundResource( R.drawable.ic_parcours_t_focus);
        focus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Home.class);
                startActivity(intent);
            }
        });


    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        //ajoute les entrées de menu_test à l'ActionBar
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
}
