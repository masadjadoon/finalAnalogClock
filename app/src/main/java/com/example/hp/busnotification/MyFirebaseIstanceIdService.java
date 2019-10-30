package com.example.hp.busnotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIstanceIdService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String s) {
    String token=FirebaseInstanceId.getInstance().getToken();
        Log.d("Token",token);


        //super.onNewToken(s);
    }
}
