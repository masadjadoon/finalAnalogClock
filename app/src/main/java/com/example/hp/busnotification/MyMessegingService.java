package com.example.hp.busnotification;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MyMessegingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Shownotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }
    public void Shownotification(String title,String message){
        NotificationCompat.Builder builder =new NotificationCompat.Builder(this,"MyNotification")
                .setContentTitle(title)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setAutoCancel(true)
                .setContentText(message);
        NotificationManagerCompat managerCompat =NotificationManagerCompat.from(this);
        managerCompat.notify(999,builder.build());


    }
}
