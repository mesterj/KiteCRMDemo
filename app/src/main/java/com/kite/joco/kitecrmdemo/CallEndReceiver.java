package com.kite.joco.kitecrmdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.Set;

/**
 * Created by Joco on 2015.03.20..
 */
public class CallEndReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();

        Set<String> keys = bundle.keySet();
        final String TAG="KITECRMDEMO";

        /*
        The value of incoming_number key in the bundle is the called number, maybe passing for content of the new memo.
         */

        TelephonyManager telephony = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        CustomPhoneStateListener myStateListener = new CustomPhoneStateListener();

        telephony.listen(myStateListener, PhoneStateListener.LISTEN_CALL_STATE);

        String calledNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        String callerNumber ="" ;

        String stateval = bundle.getString("state");

        // A hívás végének figyelése
        if (stateval != null && stateval.equals("IDLE")){
            Log.i(TAG,"CALL ENDED");
            Log.i(TAG,stateval);
            if (!callerNumber.equals("")) {
                Intent newContactIntent = new Intent(context,NewContactActivity.class);
                newContactIntent.putExtra("Number", callerNumber);
                newContactIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(newContactIntent);
            }

            // Toast.makeText(context, "A hívott szám : " + calledNumber, Toast.LENGTH_LONG).show();
            // intent for create new memo
        }
        else if (stateval != null && stateval.equals("RINGING")){
            Log.i(TAG,"CALL_STARTED");
            Log.i(TAG,stateval);
            Log.i(TAG+ " incoming number : ",bundle.getString("incoming_number"));
            //Toast.makeText(context," A hívó száma: " + bundle.getString("incoming_number"),Toast.LENGTH_LONG).show();
            callerNumber = bundle.getString("incoming_number");
        }
        else {
            Log.i(TAG,"Nem tudom ilyenkor mi van");
        }

    }
}
