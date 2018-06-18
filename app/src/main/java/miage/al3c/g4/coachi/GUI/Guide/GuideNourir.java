package miage.al3c.g4.coachi.GUI.Guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.R;

public class GuideNourir extends AppCompatActivity {

    Button btnOkayNourir;

    public GuideNourir() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate GuideNourir");
        setContentView(R.layout.activity_guide_nourir);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnOkayNourir = findViewById(R.id.btOkayNourir);
        btnOkayNourir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
