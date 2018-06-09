package miage.al3c.g4.coachi.Utilitaire;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;

public class Notification extends AppCompatActivity{
    private String id;
    private CharSequence nm;
    private NotificationChannel nc = new NotificationChannel("channelIdCoachie",  "popupAnim", NotificationManager.IMPORTANCE_DEFAULT);
    private NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, nc.getId() );

    

}
