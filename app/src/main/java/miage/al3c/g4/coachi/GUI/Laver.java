package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideLaver;
import miage.al3c.g4.coachi.R;

public class Laver extends AppCompatActivity {

    Button btnWikiLaver, btnLaver;

    public Laver() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Laver");
        setContentView(R.layout.activity_laver);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiLaver = findViewById(R.id.btWikiLaver);
        btnWikiLaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideLaver;
                goToGuideLaver = new Intent(Laver.this, GuideLaver.class);
                startActivity(goToGuideLaver);
            }
        });

        btnLaver = findViewById(R.id.btLaver);
        btnLaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
