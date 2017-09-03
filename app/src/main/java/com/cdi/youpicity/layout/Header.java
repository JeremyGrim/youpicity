package com.cdi.youpicity.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cdi.youpicity.Home;
import com.cdi.youpicity.R;

public class Header extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_action);

        final ImageView connexion = (ImageView) findViewById(R.id.homeLink);
        connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Header.this, Home.class);
                startActivity(intent);
            }
        });


    }
}
