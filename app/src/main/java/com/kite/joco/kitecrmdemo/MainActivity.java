package com.kite.joco.kitecrmdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        CrmViewPagerAdapter adapter = new CrmViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);*/
    }

    public void onClick(View v){
        switch (v.getId()){
            case (R.id.btnPartner):
                Intent newContactIntent = new Intent(this,NewContactActivity.class);
                startActivity(newContactIntent);
                    break;

            default:
                Toast.makeText(this,"A kapott id"+  v.getId(),Toast.LENGTH_LONG).show();
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
