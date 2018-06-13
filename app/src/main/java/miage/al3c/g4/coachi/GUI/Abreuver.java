package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideAbreuver;
import miage.al3c.g4.coachi.R;

public class Abreuver extends AppCompatActivity {

    Button btnWikiAbreuver, btnAbreuver;

    public Abreuver() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Abreuver");
        setContentView(R.layout.activity_abreuver);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiAbreuver = findViewById(R.id.btWikiAbreuver);
        btnWikiAbreuver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideAbreuver;
                goToGuideAbreuver = new Intent(Abreuver.this, GuideAbreuver.class);
                startActivity(goToGuideAbreuver);
            }
        });

        btnAbreuver = findViewById(R.id.btAbreuver);
        btnAbreuver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
