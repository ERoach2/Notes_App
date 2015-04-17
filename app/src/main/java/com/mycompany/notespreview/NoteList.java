package com.mycompany.notespreview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class NoteList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_note_list, menu);
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


    public void fact(View view){

        Intent intent = new Intent(this,fact.class);
        startActivity(intent);

    }

    public void chap1(View view){

        Intent intent = new Intent(this, chap.class);
        startActivity(intent);

    }

    public void soft(View view){

        Intent intent = new Intent(this, soft.class);
        startActivity(intent);

    }

    public void req(View view){

        Intent intent = new Intent(this, req.class);
        startActivity(intent);

    }

    public void ed(View view)
    {
        Intent intent = new Intent(this, eddie.class);
        startActivity(intent);
    }
}
