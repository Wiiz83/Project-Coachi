package miage.al3c.g4.coachi.GUI;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.Coachi.Coachi3D.ControlleurChien3D;
import com.google.gson.Gson;
import com.unity3d.player.UnityPlayer;

import miage.al3c.g4.coachi.Animal;
import miage.al3c.g4.coachi.GUI.Guide.GuideSommaire;
import miage.al3c.g4.coachi.R;
import miage.al3c.g4.coachi.Utilisateur;

public class AnimalPerso extends AppCompatActivity {

    Button btnBoutique, btnGuideSommaire, btnDeconnexion, btnJouer, btnNourir, BtnAbreuver, BtnSoigner, BtnLaver, BtnSortir;
    TextView textviewNom, textViewAge;
    ProgressBar pbEnergie, pbSante, pbMoral;
    private SharedPreferences myPrefs;
    private SharedPreferences.Editor myPrefsEditor;
    private Gson gson = new Gson();
    private Utilisateur utilisateur;
    private Animal animal;

    private UnityPlayer mUnityPlayer;
    private ControlleurChien3D controlleurChien3D;

    public AnimalPerso() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Unity
        mUnityPlayer = new UnityPlayer(this);

        Log.d("TESTGUI", "onCreate AnimalPerso");
        setContentView(R.layout.activity_animalperso);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //com.Coachi.Coachi3D.ControlleurChien3D ctrl = new com.Coachi.Coachi3D.ControlleurChien3D();

        // Unity
        LinearLayout layoutUnity = (LinearLayout) findViewById(R.id.llUnity);
        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, getResources().getDisplayMetrics());
        layoutUnity.addView(mUnityPlayer, 0, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, height, LinearLayout.LayoutParams.MATCH_PARENT));

        // Récupération SharedPreferences
        myPrefs = getSharedPreferences("Coachi", Context.MODE_PRIVATE);
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

        btnGuideSommaire = findViewById(R.id.btGuideSommaire);
        btnGuideSommaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideSommaire;
                goToGuideSommaire = new Intent(AnimalPerso.this, GuideSommaire.class);
                startActivity(goToGuideSommaire);
            }
        });

        btnDeconnexion = findViewById(R.id.btDeconnexion);
        btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToConnexion;
                goToConnexion = new Intent(AnimalPerso.this, Connexion.class);
                startActivity(goToConnexion);
                finish();
                utilisateur = null;
                String jsonUtilisateur = gson.toJson(utilisateur);
                myPrefsEditor.putString("Utilisateur", jsonUtilisateur);
                myPrefsEditor.apply();
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
        BtnSoigner.setClickable(false);

        BtnLaver = findViewById(R.id.btLaver);
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

        // Initialisation Nom et Age

        // Initialisation Données Chien
        textviewNom = findViewById(R.id.tvNom);
        textViewAge = findViewById(R.id.tvAge);
        pbEnergie = findViewById(R.id.pbEnergie);
        pbSante = findViewById(R.id.pbSante);
        pbMoral = findViewById(R.id.pbMoral);
        rereshStatusChien();

        controlleurChien3D = new ControlleurChien3D();
        controlleurChien3D.goToCenter();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        processIntent();
    }

    private void processIntent() {
        Bundle extras = getIntent().getExtras();

        switch (extras.getString("Action")) {
            case "Jouer":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras,  animal.getNom() + " a fini de jouer. Il remue la queue.");
                break;
            case "Nourir":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras, "Super, " + animal.getNom() + " a fini de manger !");
                break;
            case "Abreuver":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras, animal.getNom() + " a fini de boire.");
                break;
            case "Soigner":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras, animal.getNom() + " a était remis à neuf par le vétérianaire.");
                break;
            case "Laver":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras, animal.getNom() + " est tout propre.");
                break;
            case "Sortir":
                controlleurChien3D.goToBowlAndEat();
                waitForBonus(extras, animal.getNom() + " a fini sa promenade.");
                break;
            default:
                break;
        }
    }

    public void waitForBonus(final Bundle extras, final String message) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                controlleurChien3D.stopMovement();
                //animal.addBonus(extras.getInt("EnergieBonus"), extras.getInt("SanteBonus"), extras.getInt("MoralBonus"));
                animal.addBonus(extras.getInt("EnergieBonus"), extras.getInt("SanteBonus"), extras.getInt("MoralBonus"));
                saveChanges();
                rereshStatusChien();
                messageToast(message);
                controlleurChien3D.goToCenter();
            }
        }, 10000);
    }

    public void saveChanges() {
        String jsonUtilisateur = gson.toJson(utilisateur);
        myPrefsEditor.putString("Utilisateur", jsonUtilisateur);
        myPrefsEditor.apply();
    }

    public void rereshStatusChien() {
        textviewNom.setText(animal != null ? "Nom : " + animal.getNom() : "Nom : Nom du Chien");
        textViewAge.setText(animal != null ? "Age : " + animal.getAge() : "Age : Age du Chien");
        pbEnergie.setProgress(animal != null ? animal.getEnergieP() : 50);
        pbSante.setProgress(animal != null ? animal.getSanteP() : 50);
        pbMoral.setProgress(animal != null ? animal.getMoralP() : 50);
    }


    public void messageToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    // Quit Unity
    @Override
    protected void onDestroy() {
        mUnityPlayer.quit();
        super.onDestroy();
    }

    // Pause Unity
    @Override
    protected void onPause() {
        super.onPause();
        mUnityPlayer.pause();
    }

    // Resume Unity
    @Override
    protected void onResume() {
        super.onResume();
        mUnityPlayer.resume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mUnityPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mUnityPlayer.stop();
    }

    // Low Memory Unity
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mUnityPlayer.lowMemory();
    }

    // Trim Memory Unity
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level == TRIM_MEMORY_RUNNING_CRITICAL) {
            mUnityPlayer.lowMemory();
        }
    }

    // This ensures the layout will be correct.
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mUnityPlayer.configurationChanged(newConfig);
    }

    // Notify Unity of the focus change.
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mUnityPlayer.windowFocusChanged(hasFocus);
    }

    // For some reason the multiple keyevent type is not supported by the ndk.
    // Force event injection by overriding dispatchKeyEvent().
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_MULTIPLE)
            return mUnityPlayer.injectEvent(event);
        return super.dispatchKeyEvent(event);
    }

    // Pass any events not handled by (unfocused) views straight to UnityPlayer
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

    /*API12*/
    public boolean onGenericMotionEvent(MotionEvent event) {
        return mUnityPlayer.injectEvent(event);
    }

}
