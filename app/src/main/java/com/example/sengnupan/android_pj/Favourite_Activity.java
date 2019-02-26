package com.example.sengnupan.android_pj;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Favourite_Activity extends AppCompatActivity {
    DatabaseHandler myDB;
    private ListView list;
    ArrayList<String> listitems = new ArrayList<String>();
    //  ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

       setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        list = findViewById(R.id.list);
        myDB = new DatabaseHandler(this);


        ArrayList<String> theList = new ArrayList<>();

        Cursor data = myDB.getListContents();

        if (data.getCount() == 0) {

            Toast.makeText(this, "There are no contents in this list!", Toast.LENGTH_LONG).show();

        } else {

            while (data.moveToNext()) {

                theList.add(data.getString(1));

                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);

                list.setAdapter(listAdapter);



            }
        }
    }
}

