package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.GUI.Guide.GuideSortir;
import miage.al3c.g4.coachi.R;

public class Sortir extends AppCompatActivity {

    Button btnWikiSortir, btnSortir;

    public Sortir() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Sortir");
        setContentView(R.layout.activity_sortir);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnWikiSortir = findViewById(R.id.btWikiSortir);
        btnWikiSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideSortir;
                goToGuideSortir = new Intent(Sortir.this, GuideSortir.class);
                startActivity(goToGuideSortir);
            }
        });

        btnSortir = findViewById(R.id.btSortir);
        btnSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
