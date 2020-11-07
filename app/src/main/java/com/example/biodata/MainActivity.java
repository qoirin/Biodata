package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG="AppCallLink";
    Button btnalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Pada Event onCreate()");

    }
    public void onClickCallsEvent (View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 081296685729"));
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "Pada Event onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Pada Event onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Pada Event onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "Pada Event onStop()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "Pada Event onRestart()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "Pada Event onDestroy()");


    }
    public void maps (View view) {
        Uri uri = Uri.parse("geo:-6.991898, 110.397697");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"qoirinresionph@gmail.com"});

        try{
            startActivity(intent);
        }catch (ActivityNotFoundException ex){

        }
    }

}