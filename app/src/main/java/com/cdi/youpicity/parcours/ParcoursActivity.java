package com.cdi.youpicity.parcours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.cdi.youpicity.Home;
import com.cdi.youpicity.R;
import com.cdi.youpicity.Ville.ListLille;

public class ParcoursActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcours);


        Intent intent = getIntent();
        TextView idDisplay = (TextView) findViewById(R.id.title);
        TextView timeDisplay = (TextView) findViewById(R.id.time);
        ImageView imgDisplay = (ImageView) findViewById(R.id.imageParcours);

        if (intent != null) {
            idDisplay.setText(intent.getStringExtra("id"));
            timeDisplay.setText(intent.getStringExtra("time"));
            imgDisplay.setImageResource(intent.getIntExtra("img", 0));
        }

        //    Gestion du menu footer

        ImageButton focus = (ImageButton) findViewById(R.id.btn_Parcours);
        focus.setBackgroundResource( R.drawable.ic_parcours_t_focus);
        focus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParcoursActivity.this, Home.class);
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
