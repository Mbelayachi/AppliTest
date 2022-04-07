package com.belayachi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActEmpty extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_empty);


        tvResult=(TextView) findViewById(R.id.tvResult);

        Intent intent = getIntent();
        String nomrecap = "Bonjour : " + intent.getStringExtra("nom");
        nomrecap += "\nVotre mot de passe : " + intent.getStringExtra("passe");
        nomrecap += "\nVotre choix : " + intent.getStringExtra("choix");

        tvResult.setText(nomrecap);


    }
}