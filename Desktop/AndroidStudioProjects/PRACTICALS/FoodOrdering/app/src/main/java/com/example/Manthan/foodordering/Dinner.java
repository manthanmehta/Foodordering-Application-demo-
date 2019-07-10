package com.example.swapniltamrkar.foodordering;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dinner extends AppCompatActivity {

    int cost = 0;
    Intent intent;
    int temp;
    EditText c,m,s,d,r,mu,p;

    ArrayList<String> item = new ArrayList<>();
    ArrayList<String> amount = new ArrayList<>();
    ArrayList<String> quan = new ArrayList<>();
    ListView listView1;
    ListView listView2;
    ListView listView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dinner );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        c = (EditText) findViewById( R.id.rotid );
        m = (EditText) findViewById( R.id.mixvegd );
        s = (EditText) findViewById( R.id.shaahipaneerd );
        d = (EditText) findViewById( R.id.dald );
        r = (EditText) findViewById( R.id.riced );
        mu = (EditText) findViewById( R.id.mushroomd );
        p = (EditText) findViewById( R.id.paneermasalad );
        listView1 = (ListView) findViewById( R.id.listview1 );
        listView2 = (ListView) findViewById( R.id.listview2 );
        listView3 = (ListView) findViewById( R.id.listview3 );


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menudinner, menu );
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {

            intent = new Intent();
            startActivity( new Intent( this, MainActivity.class ) );

        }
        if (id == R.id.lunch) {

            intent = new Intent();
            startActivity( new Intent( this, Lunch.class ) );

        }
        if (id == R.id.breakfast) {
            intent = new Intent();
            startActivity( new Intent( this, BreakFast.class ) );
        }


        return super.onOptionsItemSelected( item );
    }


    public void caldincst(View view) {
        switch (view.getId()) {
            case R.id.rotid:
                temp = (10 * (Integer.parseInt( (String) c.getText() )));
                cost = cost + temp;
                item.add( "Roti" );
                quan.add( (String) c.getText() );
                amount.add( Integer.toString( temp ) );
                break;

            case R.id.mixvegd:
                temp = (120 * (Integer.parseInt( (String) mixvegd.getText() )));
                cost = cost + temp;
                item.add( "Mix veg" );
                quan.add( (String) m.getText() );
                amount.add( Integer.toString( temp ) );
                break;

            case R.id.shaahipaneerd:
                temp = (200 * (Integer.parseInt( (String) shahipannerd.getText() )));
                cost = cost + temp;
                item.add( "Sahi paneer" );
                quan.add( (String) shahipannerd.getText() );
                amount.add( Integer.toString( temp ) );
                break;

            case R.id.dald:
                temp = (180 * (Integer.parseInt( (String) dald.getText() )));
                item.add( "Dal" );
                quan.add( (String) dald.getText() );
                amount.add( Integer.toString( temp ) );
                cost = cost + temp;
                break;

//            case R.id.riced:
//                temp = (100 * (Integer.parseInt( (String) riced.getText() )));
//                cost = cost + temp;
//                item.add( "Rice" );
//                quan.add( (String) riced.getText() );
//                amount.add( Integer.toString( temp ) );


                break;

            case R.id.mushroomd:
                temp = (250 * (Integer.parseInt( (String) mushroomd.getText() )));
                cost = cost + temp;
                item.add( "Mushroom" );
                quan.add( (String) mushroomd.getText() );
                amount.add( Integer.toString( temp ) );
                break;

            case R.id.paneermasalad:
                temp = (250 * (Integer.parseInt( (String) pannermasalad.getText() )));
                cost = cost + temp;
                item.add( "Paneer masala" );
                quan.add( (String) pannermasalad.getText() );
                amount.add( Integer.toString( temp ) );
                break;

            case R.id.submitd:
                AlertDialog.Builder builder = new AlertDialog.Builder( this );
                LayoutInflater inflater = this.getLayoutInflater();
                View dialogview = inflater.inflate( R.layout.dinnerbill, null );
                builder.setView( dialogview );
                builder.setTitle( "BILL" );
                builder.setMessage( (Integer.toString( cost )) );
                builder.setMessage( cost );
                listView1.setAdapter( new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, item ) );
                listView2.setAdapter( new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, quan ) );
                listView3.setAdapter( new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, amount ) );


                AlertDialog dialog = builder.create();
                dialog.show();
                break;


        }
    }


}
