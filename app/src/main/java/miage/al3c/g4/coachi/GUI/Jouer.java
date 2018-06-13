package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideJouer;
import miage.al3c.g4.coachi.R;

public class Jouer extends AppCompatActivity {

    Button btnWikiJouer, btnJouer;

    public Jouer() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Jouer");
        setContentView(R.layout.activity_jouer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiJouer = findViewById(R.id.btWikiJouer);
        btnWikiJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideJouer;
                goToGuideJouer = new Intent(Jouer.this, GuideJouer.class);
                startActivity(goToGuideJouer);
            }
        });

        btnJouer = findViewById(R.id.btJouer);
        btnJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
