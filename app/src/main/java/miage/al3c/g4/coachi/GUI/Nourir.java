package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideNourir;
import miage.al3c.g4.coachi.R;

public class Nourir extends AppCompatActivity {

    Button btnWikiNourir, btnNourir;

    public Nourir() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Nourir");
        setContentView(R.layout.activity_nourir);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiNourir = findViewById(R.id.btWikiNourir);
        btnWikiNourir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideNourir;
                goToGuideNourir = new Intent(Nourir.this, GuideNourir.class);
                startActivity(goToGuideNourir);
            }
        });

        btnNourir = findViewById(R.id.btNourir);
        btnNourir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
