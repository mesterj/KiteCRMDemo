package com.kite.joco.kitecrmdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.kite.joco.entities.Partner;


public class Contacts extends ActionBarActivity {

    private RecyclerView rvContacts;
    private RecyclerView.LayoutManager contactsLayoutManager;
    private RecyclerView.Adapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        rvContacts = (RecyclerView) findViewById(R.id.rcvContacts);
        contactsLayoutManager = new LinearLayoutManager(this);
        rvContacts.setLayoutManager(contactsLayoutManager);
        contactAdapter = new ContactRecycleAdapter(Partner.listAll(Partner.class));
        rvContacts.setAdapter(contactAdapter);
    }
    // List<Book> books = Book.listAll(Book.class);


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contacts, menu);
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
            Intent newContactIntent = new Intent(this,NewContactActivity.class);
            startActivity(newContactIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
