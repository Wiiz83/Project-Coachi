package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideSoigner;
import miage.al3c.g4.coachi.R;

public class Soigner extends AppCompatActivity {

    Button btnWikiSoigner, btnSoigner;

    public Soigner() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Soigner");
        setContentView(R.layout.activity_soigner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiSoigner = findViewById(R.id.btWikiSoigner);
        btnWikiSoigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideSoigner;
                goToGuideSoigner = new Intent(Soigner.this, GuideSoigner.class);
                startActivity(goToGuideSoigner);
            }
        });

        btnSoigner = findViewById(R.id.btSoigner);
        btnSoigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
