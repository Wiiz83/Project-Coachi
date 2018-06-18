package miage.al3c.g4.coachi.GUI.Guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import miage.al3c.g4.coachi.R;

public class GuideSoigner extends AppCompatActivity {

    Button btnOkaySoigner;

    public GuideSoigner() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate GuideSoigner");
        setContentView(R.layout.activity_guide_soigner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialisations Boutons
        btnOkaySoigner = findViewById(R.id.btOkaySoigner);
        btnOkaySoigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
