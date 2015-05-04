package com.kite.joco.kitecrmdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Joco on 2015.05.04..
 */
public class OutgoingCallReceiver extends BroadcastReceiver {

    private static final String TAG="KITECRMDEMO";

    @Override
        public void onReceive(Context context, Intent intent) {
        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        Log.i(TAG, phoneNumber);
        Toast.makeText(context, "Outgoing call catched!: " + phoneNumber, Toast.LENGTH_LONG).show();
    }
}
