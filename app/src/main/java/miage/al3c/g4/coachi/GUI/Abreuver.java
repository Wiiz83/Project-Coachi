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
import miage.al3c.g4.coachi.GUI.Guide.GuideAbreuver;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class Abreuver extends AppCompatActivity {

    Button btnWikiAbreuver, btnAbreuver;

    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private Animal animal;

    public Abreuver() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Abreuver");
        setContentView(R.layout.activity_abreuver);
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
                abreuver(10, 5, 5);
            }
        });
    }

    public void abreuver(int energie, int sante, int moral){
        Intent intent = new Intent(Abreuver.this, AnimalPerso.class);
        intent.putExtra("Action", "Abreuver");
        intent.putExtra("EnergieBonus", energie);
        intent.putExtra("SanteBonus", sante);
        intent.putExtra("MoralBonus", moral);
        finish();
        startActivity(intent);
    }

}
