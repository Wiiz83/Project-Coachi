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
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;

import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class Boutique extends AppCompatActivity {

    ImageButton btnNourritures1, btnNourritures2, btnNourritures3, btnAccessoires1, btnAccessoires2, btnAccessoires3;
    TextView txtviewDepenses;
    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private String txtDepenses = "Tes dépenses actuelles sont de ";

    public Boutique() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Boutique");
        setContentView(R.layout.activity_boutique);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Récupération SharedPreferences
        myPrefs = getSharedPreferences("Coachi", Context.MODE_PRIVATE);
        myPrefsEditor = myPrefs.edit();

        // Récupérer l'utilisateur
        String json = myPrefs.getString("Utilisateur", "");
        utilisateur = gson.fromJson(json, Utilisateur.class);
        Log.d("TESTGUI", "(Create)utilisateur dépenses : " + utilisateur.getSommmeDepensee());

        //Initialisations Boutons
        txtviewDepenses = findViewById(R.id.tvDepenses);
        txtviewDepenses.setText(txtDepenses + utilisateur.getSommmeDepensee() + "€");

        //Initialisations Boutons
        btnNourritures1 = findViewById(R.id.ibtN1);
        btnNourritures1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Croquettes", 1, 3);
            }
        });

        btnNourritures2 = findViewById(R.id.ibtN2);
        btnNourritures2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Pâté", 1, 5);
            }
        });

        btnNourritures3 = findViewById(R.id.ibtN3);
        btnNourritures3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Friandises", 1, 2);
            }
        });

        btnAccessoires1 = findViewById(R.id.ibtA1);
        btnAccessoires1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Jouet", 1, 10);
            }
        });

        btnAccessoires2 = findViewById(R.id.ibtA2);
        btnAccessoires2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Collier", 1, 20);
            }
        });

        btnAccessoires3 = findViewById(R.id.ibtA3);
        btnAccessoires3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem("Brosse", 1, 15);
            }
        });
    }

    private void addItem(String nomItem, int toAdd, int prixItem){
        utilisateur.getInventaire().addItem(nomItem, toAdd);
        utilisateur.setSommmeDepensee(utilisateur.getSommmeDepensee() + prixItem);
        txtviewDepenses.setText(txtDepenses + utilisateur.getSommmeDepensee() + "€");

        String jsonUtilisateur = gson.toJson(utilisateur);
        myPrefsEditor.putString("Utilisateur", jsonUtilisateur);
        myPrefsEditor.apply();
        Log.d("TESTGUI", "(addItem)utilisateur dépenses : " + utilisateur.getSommmeDepensee());
    }

}
