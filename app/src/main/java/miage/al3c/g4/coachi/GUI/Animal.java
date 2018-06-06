package miage.al3c.g4.coachi.GUI;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import miage.al3c.g4.coachi.R;

public class Animal extends AppCompatActivity {

    public Animal() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TESTGUI", "onCreate Animal");
        setContentView(R.layout.activity_animal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        com.Coachi.Coachi3D.ControlleurChien3D ctrl = new com.Coachi.Coachi3D.ControlleurChien3D();
    }

}
