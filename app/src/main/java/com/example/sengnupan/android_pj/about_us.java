package com.example.sengnupan.android_pj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

public class about_us extends AppCompatActivity {


 public TextView about;
    String str1="* Intern Seeker targets to students who has a problem with searching company for internship.";
    String str2="* This app describes general information of companies.";
    String str3="* We use companies information just to share to students for their convenience at searching company for internship";
    String addStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addStr=str1+"<br/>"+"<br/>"+str2+"<br/>"+"<br/>"+str3;

        about=(TextView)findViewById(R.id.text1);

        about.setText(Html.fromHtml(addStr));



    }

}
