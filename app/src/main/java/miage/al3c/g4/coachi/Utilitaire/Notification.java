package miage.al3c.g4.coachi.Utilitaire;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;

public class Notification {
    private String id;
    private CharSequence nm;
    private NotificationChannel nc = new NotificationChannel(id,  nm, NotificationManager.IMPORTANCE_DEFAULT);
    private NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(Notification.this, nc.getId() );

}
