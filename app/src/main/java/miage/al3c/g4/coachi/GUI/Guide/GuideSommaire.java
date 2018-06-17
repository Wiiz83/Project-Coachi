package miage.al3c.g4.coachi.GUI.Guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.R;

public class GuideSommaire extends AppCompatActivity {

    Button btnGuideJouer, btnGuideNourir, BtnGuideAbreuver, BtnGuideSoigner, BtnGuideLaver, BtnGuideSortir;

    public GuideSommaire() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate GuideSommaire");
        setContentView(R.layout.activity_guide_sommaire);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnGuideJouer = findViewById(R.id.btGuideJouer);
        btnGuideJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideJouer;
                goToGuideJouer = new Intent(GuideSommaire.this, GuideJouer.class);
                startActivity(goToGuideJouer);
            }
        });

        btnGuideNourir = findViewById(R.id.btGuideNourir);
        btnGuideNourir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideNourir;
                goToGuideNourir = new Intent(GuideSommaire.this, GuideNourir.class);
                startActivity(goToGuideNourir);
            }
        });

        BtnGuideAbreuver = findViewById(R.id.btGuideAbreuver);
        BtnGuideAbreuver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideAbreuver;
                goToGuideAbreuver = new Intent(GuideSommaire.this, GuideAbreuver.class);
                startActivity(goToGuideAbreuver);
            }
        });

        BtnGuideSoigner = findViewById(R.id.btGuideSoigner);
        BtnGuideSoigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideSoigner;
                goToGuideSoigner = new Intent(GuideSommaire.this, GuideSoigner.class);
                startActivity(goToGuideSoigner);
            }
        });

        BtnGuideLaver = findViewById(R.id.btGuideLaver);
        BtnGuideLaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideLaver;
                goToGuideLaver = new Intent(GuideSommaire.this, GuideLaver.class);
                startActivity(goToGuideLaver);
            }
        });

        BtnGuideSortir = findViewById(R.id.btGuideSortir);
        BtnGuideSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToGuideSortir;
                goToGuideSortir = new Intent(GuideSommaire.this, GuideSortir.class);
                startActivity(goToGuideSortir);
            }
        });
    }

}
