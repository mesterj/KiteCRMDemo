package com.kite.joco.kitecrmdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import com.kite.joco.entities.Partner;


public class NewContactActivity extends ActionBarActivity {

    String callernumber="";

    String TAG = "KITECRMDEMO";
    boolean ismobilnumber = false;
    Switch swMaganCeges;
    EditText etVezeteknev;
    EditText etKeresztnev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        if (getIntent().getExtras() != null){
            callernumber = getIntent().getExtras().getString("Number");
            EditText etNumber = (EditText) findViewById(R.id.etNumber);
            etNumber.setText(callernumber);
            if (callernumber.matches("^[+]36[237]0\\d*")) {
                ismobilnumber = true;
            }
        }

        swMaganCeges= (Switch) findViewById(R.id.swMaganCeges);
        swMaganCeges.setChecked(true);
        swMaganCeges.setTextOn("Céges");
        swMaganCeges.setTextOff("Magán");
        if (ismobilnumber) {
            swMaganCeges.setText("Mobil");
        }

        etVezeteknev = (EditText) findViewById(R.id.etFirstName);

        etKeresztnev = (EditText) findViewById(R.id.etSecondName);
    }

    public void deleteNumber(View v){
        final String connectfile = "CallerNum";
        deleteFile(connectfile);
        finish();
    }

    public void saveNumber(View v){
        Partner p = new Partner();
        if (callernumber.matches("^[+]36[237]0\\d*")){
            if (swMaganCeges.isChecked()) {
                p.setMaganMobilTelefonszam(callernumber);
            }
            else {
                p.setCegMobilTelefonszam(callernumber);
            }
        }
        else {
            if (swMaganCeges.isChecked()) {
                p.setMaganVezetekesTelefonszam(callernumber);
            }
            else {
                p.setCegVezetekesTelefonszam(callernumber);
            }
        }
        p.setKapcsolatnev(etVezeteknev.getText()+" "+etKeresztnev.getText() );

        p.save();
    }


}
