package miage.al3c.g4.coachi.Utilitaire;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;

import miage.al3c.g4.coachi.R;

public class Notification extends AppCompatActivity{
    private int id;
    private Class c;
    private String content;
    private NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
    private NotificationChannel nc = new NotificationChannel("channelIdCoachie",  "popupAnim", NotificationManager.IMPORTANCE_DEFAULT);
    private NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, nc.getId() );
    // Create an explicit intent for an Activity in your app
    private Intent intent = new Intent(this, c);
    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


    //Remplis tout les champs pour les notifs
    public Notification(int id, String ct, String title, Class c){
        setId(id);
        setContent(ct);
        setC(c);
        mBuilder.setSmallIcon(R.drawable.ic_notifs);
        mBuilder.setContentText(this.getContent().subSequence(0, this.getContent().length()));
        mBuilder.setContentTitle(title.subSequence(0, title.length()));
        mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setAutoCancel(true);
    }

    public Class getC() {
        return c;
    }

    public void setC(Class c) {
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Send la notification
    public void sendNotif(){
        notificationManager.notify(this.id, mBuilder.build());
    }
}
