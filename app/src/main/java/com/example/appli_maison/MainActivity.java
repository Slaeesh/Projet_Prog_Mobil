package com.example.appli_maison;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLaunchServer = findViewById(R.id.btnLaunchServer);
        Button btnLaunchClient = findViewById(R.id.btnLaunchClient);

        btnLaunchServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implémenter l'Intent pour lancer l'activité Serveur
            }
        });

        btnLaunchClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implémenter l'Intent pour lancer l'activité Client
            }
        });
    }
}