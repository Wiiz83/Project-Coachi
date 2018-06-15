package miage.al3c.g4.coachi.GUI;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import miage.al3c.g4.coachi.Animal;
import miage.al3c.g4.coachi.GUI.Guide.GuideLaver;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class Laver extends AppCompatActivity {

    Button btnWikiLaver, btnLaver;

    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private Animal animal;

    public Laver() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Laver");
        setContentView(R.layout.activity_laver);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Récupération SharedPreferences
        myPrefs = getSharedPreferences("Coachi", Context.MODE_PRIVATE);
        myPrefsEditor = myPrefs.edit();

        // Récupérer l'utilisateur
        String json = myPrefs.getString("Utilisateur", "");
        utilisateur = gson.fromJson(json, Utilisateur.class);

        // Récupérer l'animal
        animal = utilisateur.getAnimal();

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
                laver(3, 3, 3);
            }
        });
    }

    public void laver(int energie, int sante, int moral) {
        Intent intent = new Intent(Laver.this, AnimalPerso.class);
        intent.putExtra("Action", "Laver");
        intent.putExtra("EnergieBonus", energie);
        intent.putExtra("SanteBonus", sante);
        intent.putExtra("MoralBonus", moral);
        finish();
        startActivity(intent);
    }


}
