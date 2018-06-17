package miage.al3c.g4.coachi.GUI.Actions;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import miage.al3c.g4.coachi.Animal;
import miage.al3c.g4.coachi.GUI.Accueil.AnimalPerso;
import miage.al3c.g4.coachi.GUI.Guide.GuideJouer;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class Jouer extends AppCompatActivity {

    Button btnWikiJouer, btnJouer;

    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private Animal animal;

    public Jouer() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Jouer");
        setContentView(R.layout.activity_jouer);
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
                jouer(10, 5, 20);
            }
        });
    }

    public void jouer(int energie, int sante, int moral){
        Intent intent = new Intent(Jouer.this, AnimalPerso.class);
        intent.putExtra("Action", "Jouer");
        intent.putExtra("EnergieBonus", energie);
        intent.putExtra("SanteBonus", sante);
        intent.putExtra("MoralBonus", moral);
        finish();
        startActivity(intent);
    }

}
