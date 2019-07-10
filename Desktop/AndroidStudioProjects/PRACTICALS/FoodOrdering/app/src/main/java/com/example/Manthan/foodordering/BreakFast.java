package com.example.swapniltamrkar.foodordering;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BreakFast extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_break_fast );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menubreak, menu );
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {

            intent =new Intent();
            startActivity( new Intent(this,MainActivity.class) );

        }
        if (id == R.id.lunch)
        {

            intent =new Intent();
            startActivity( new Intent(this,Lunch.class) );

        }


        return super.onOptionsItemSelected( item );
    }

}
