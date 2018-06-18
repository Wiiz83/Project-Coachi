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
import miage.al3c.g4.coachi.GUI.Guide.GuideSortir;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class Sortir extends AppCompatActivity {

    Button btnWikiSortir, btnSortir;

    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private Animal animal;

    public Sortir() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Sortir");
        setContentView(R.layout.activity_sortir);
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
                sortir(-20, 5, 30, "Normal");
            }
        });
    }

    public void sortir(int energie, int sante, int moral, String etat){
        Intent intent = new Intent(Sortir.this, AnimalPerso.class);
        intent.putExtra("Action", "Sortir");
        intent.putExtra("EnergieBonus", energie);
        intent.putExtra("SanteBonus", sante);
        intent.putExtra("MoralBonus", moral);
        intent.putExtra("Etat", etat);
        finish();
        startActivity(intent);
    }

}
