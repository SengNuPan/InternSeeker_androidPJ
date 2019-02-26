package com.example.sengnupan.android_pj;


import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    String str;
    String pdfFile;
    public final static int MY_PERMISSION_REQUEST_STORAGE=1;
    DrawerLayout drawer;
    NavigationView navigationView;
    LinearLayout getstarted,stories,activities,cvform;
    EditText email;
    String emailaddress;
    String companyName;
    String[]name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)){
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST_STORAGE);
            }
            else{
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST_STORAGE);

            }
        } else{
            //do nothing
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        //ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        getstarted=(LinearLayout) findViewById(R.id.started);
        getstarted.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, searchCompany.class);
                intent.putExtra("Companies", 1);
                startActivity(intent);
            }
        });
        stories=(LinearLayout) findViewById(R.id.stories);
        stories.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, their_stories.class);
                intent.putExtra("Their Stories", 1);
                startActivity(intent);
            }
        });
        activities=(LinearLayout) findViewById(R.id.activities);
        activities.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, their_activites.class);
                intent.putExtra("Their Stories", 1);
                startActivity(intent);
            }
        });
        cvform=(LinearLayout) findViewById(R.id.cvform);

        cvform.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
              AlertDialog.Builder mBuilder=new AlertDialog.Builder(MainActivity.this);
              View mView=getLayoutInflater().inflate(R.layout.dialog_box,null);
              //email=(EditText)findViewById(R.id.email);
              //emailaddress=email.getText().toString();
              //mBuilder.setTitle("CV Forms");
                final Spinner mSpinner=(Spinner)mView.findViewById(R.id.spinner);

                ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.companyList));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);
                mBuilder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int i) {

                        //exit from dialog
                    }

                });

                mBuilder.setNegativeButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                   /*if(!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a company...")){
                       Toast.makeText(MainActivity.this,
                               mSpinner.getSelectedItem().toString(),
                               Toast.LENGTH_SHORT).show();

                   }*/
                        str=mSpinner.getSelectedItem().toString();
                        if(str.equals("Signal Base Myanmar")){
                            pdfFile="Signal Base Myanmar.pdf";
                        }
                        else if(str.equals("Orient")){
                            pdfFile="Orient.pdf";
                        }
                        else if(str.equals("Software Myanmar")){
                            pdfFile="Software Myanmar.pdf";
                        }
                        else{
                            pdfFile="UTYCC Intern.pdf";
                        }

                        copyAsset(pdfFile);

                    }
                });

                mBuilder.setPositiveButton("View", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int i) {


                               Intent intent = new Intent(MainActivity.this, Files.class);
                                // intent.putExtra("EXTRA_SESSION_ID", 1);
                      companyName=  mSpinner.getSelectedItem().toString();
                                intent.putExtra("key",companyName);
                                startActivity(intent);


                            }

                        });



                mBuilder.setView(mView);
               AlertDialog dialog=mBuilder.create();
                dialog.show();

            }
        });
        //initNavigationDrawer
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,R.string.drawer_open, R.string.drawer_close)
        {

            public void onDrawerClosed(View view) {
                // Snackbar.make(view, R.string.drawer_close, Snackbar.LENGTH_SHORT).show();
            }


            public void onDrawerOpened(View drawerView) {
                // Snackbar.make(drawerView, R.string.drawer_open, Snackbar.LENGTH_SHORT).show();
            }
        };
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        menuItem.setChecked(true);
        //Log.i("CLICK ", menuItem.getItemId()+"");
        displayView(menuItem.getItemId());
        drawer.closeDrawers();
        return true;

    }
    private void displayView(int menuid) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (menuid) {
            case R.id.favorite:
               Intent favourite=new Intent(MainActivity.this,Favourite_Activity.class);
                startActivity(favourite);
               break;
            case R.id.invite:

                Intent invite=new Intent(MainActivity.this,Invite_Friends_Activity.class);
                startActivity(invite);

                break;
            case R.id.share:
                Intent email=new Intent(MainActivity.this,Share_Activity.class);
                startActivity(email);

                break;
            case R.id.feedback:
                Intent feedback=new Intent(MainActivity.this,Feedback.class);
                startActivity(feedback);

                break;
            case R.id.about:
                final Intent about=new Intent(MainActivity.this,about_us.class);
                startActivity(about);
                // fragment = new frag();
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }


/*   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/


    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                return true;

            case R.id.profile:
                CustomDialogClass cdd=new CustomDialogClass(MainActivity.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                cdd.show();

                break;
        }


        return super.onOptionsItemSelected(item);
    }


//File save

    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[]grantResults){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        switch(requestCode){
            case MY_PERMISSION_REQUEST_STORAGE:{
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    if(ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
                        //do nothing
                    }else{
                        Toast.makeText(this,"No Permission Granted",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }

    public void copyAsset(String fileName) {
        String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/MyFiles";
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        AssetManager assetManager = getAssets();
        InputStream in = null;
        OutputStream out = null;
        try {
            in = assetManager.open(fileName);
            File outFile = new File(dirPath, fileName);
            out = new FileOutputStream(outFile);
            copyFile(in, out);
            Toast.makeText(this, "File has been saved in your device storage as MyFiles folder", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Filed!", Toast.LENGTH_SHORT).show();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void copyFile (InputStream in, OutputStream out)throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }

    }


}