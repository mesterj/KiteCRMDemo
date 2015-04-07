package com.kite.joco.kitecrmdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class NewContactActivity extends ActionBarActivity {

    String callernumber="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        if (getIntent().getExtras() != null){
            callernumber = getIntent().getExtras().getString("Number");
            TextView tvCallerNumber = (TextView) findViewById(R.id.tvHello);
            tvCallerNumber.setText("A hívó száma ez volt: " + callernumber);
        }
    }

    public void deleteNumber(View v){
        final String connectfile = "CallerNum";
        deleteFile(connectfile);
        finish();
    }



}
