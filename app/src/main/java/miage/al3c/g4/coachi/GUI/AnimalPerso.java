package miage.al3c.g4.coachi.GUI;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.gson.Gson;

import miage.al3c.g4.coachi.Animal;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class AnimalPerso extends AppCompatActivity {

    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();

    private Utilisateur utilisateur;
    private Animal animal;
    Button btnBoutique, btnStatistiques, btnJouer, btnNourir, BtnAbreuver, BtnSoigner, BtnLaver, BtnSortir;
    ProgressBar pbEnergie, pbSante, pbMoral;

    public AnimalPerso() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate AnimalPerso");
        setContentView(R.layout.activity_animalperso);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //com.Coachi.Coachi3D.ControlleurChien3D ctrl = new com.Coachi.Coachi3D.ControlleurChien3D();



        // Récupération SharedPreferences
        myPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        myPrefsEditor = myPrefs.edit();

        // Récupérer l'utilisateur
        String json = myPrefs.getString("Utilisateur", "");
        utilisateur = gson.fromJson(json, Utilisateur.class);

        // Récupérer l'animal
        animal = utilisateur.getAnimal();

        //Initialisations Boutons
        btnBoutique = findViewById(R.id.btBoutique);
        btnBoutique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToBoutique;
                goToBoutique = new Intent(AnimalPerso.this, Boutique.class);
                startActivity(goToBoutique);
            }
        });

        btnStatistiques = findViewById(R.id.btStatistiques);
        btnStatistiques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToStatistiques;
                goToStatistiques = new Intent(AnimalPerso.this, Statistiques.class);
                startActivity(goToStatistiques);
            }
        });

        btnJouer = findViewById(R.id.btJouer);
        btnJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToJouer;
                goToJouer = new Intent(AnimalPerso.this, Jouer.class);
                startActivity(goToJouer);
            }
        });

        btnNourir = findViewById(R.id.btNourir);
        btnNourir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToNourir;
                goToNourir = new Intent(AnimalPerso.this, Nourir.class);
                startActivity(goToNourir);
            }
        });

        BtnAbreuver = findViewById(R.id.btAbreuver);
        BtnAbreuver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAbreuver;
                goToAbreuver = new Intent(AnimalPerso.this, Abreuver.class);
                startActivity(goToAbreuver);
            }
        });

        BtnSoigner = findViewById(R.id.btSoigner);
        BtnSoigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSoigner;
                goToSoigner = new Intent(AnimalPerso.this, Soigner.class);
                startActivity(goToSoigner);
            }
        });

        BtnLaver = findViewById(R.id.btHygiene);
        BtnLaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLaver;
                goToLaver = new Intent(AnimalPerso.this, Laver.class);
                startActivity(goToLaver);
            }
        });

        BtnSortir = findViewById(R.id.btSortir);
        BtnSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSortir;
                goToSortir = new Intent(AnimalPerso.this, Sortir.class);
                startActivity(goToSortir);
            }
        });

        // Initialisation ProgressBar

        int energie, sante, moral;

        pbEnergie= findViewById(R.id.pbEnergie);
        if (utilisateur != null) {
            energie = utilisateur.getAnimal().getEnergieP();
        }else {
            energie = 100;
        }
        pbEnergie.setProgress(energie);

        pbSante= findViewById(R.id.pbSante);
        if (utilisateur != null) {
            sante = utilisateur.getAnimal().getSanteP();
        }else {
            sante = 750;
        }
        pbSante.setProgress(sante);

        pbMoral= findViewById(R.id.pbMoral);
        if (utilisateur != null) {
            moral = utilisateur.getAnimal().getMoralP();
        }else {
            moral = 50;
        }
        pbMoral.setProgress(moral);


    }

}
