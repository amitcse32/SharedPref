package com.cssoft.sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set shared pref values
        SharedPreferences sharedPreferences = getSharedPreferences("mypref", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("aa", "INDIA");
        editor.commit();

        //GET Shared Pref Values
        String var = sharedPreferences.getString("aa", "NOVALdlskfgj");
        Toast.makeText(this, var, Toast.LENGTH_SHORT).show();

        //Clear shared pref values
        editor.putString("aa", "");
        editor.commit();


    }
}
