package com.example.sengnupan.android_pj;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    private EditText etText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final AlertDialog.Builder builder = new AlertDialog.Builder(Feedback.this);
        final EditText input=new EditText(Feedback.this);
        builder.setTitle("Feeling about support what you received?");
        setTitleColor(Color.GREEN);
        builder.setView(input);
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                String message=input.getText().toString();
                String[] to={"hninsunyein07@gmail.com"};
                Intent email=new Intent(Intent.ACTION_SEND);
                //  email.setData(Uri.parse(message));
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL,to);
                email.putExtra(Intent.EXTRA_TEXT,message);
                try{
                    startActivity(email);
                    finish();
                }catch(android.content.ActivityNotFoundException ex){
                    Toast.makeText(Feedback.this,"NO",Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
               dialog.dismiss();
                Intent i=new Intent(Feedback.this,MainActivity.class);
                startActivity(i);
            }
        });
        builder.show();
    }
}
