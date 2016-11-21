package com.example.gatorsgonnagait.amtrack;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Status extends Activity {
    TextView resultHours;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        resultHours = (TextView) findViewById(R.id.hoursInput);


        TextView resultMinutes = (TextView)findViewById(R.id.minutesInput);
        TextView resultLength = (TextView)findViewById(R.id.lengthInput);
        //ImageView image = (ImageView)findViewById(R.id.imgStatus);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int hours = sharedPref.getInt("key1", 0);
        int minutes = sharedPref.getInt("key2", 0);
        int length = sharedPref.getInt("key3", 0);
        resultHours.setText(Integer.toString(hours));
        /*
        if(hours > 23){
            resultHours.setText(hours + " not appropriate hour number");
        }
        if(minutes > 59){
            resultMinutes.setText(minutes + " not appropriate minute number");
        }*/
        //resultMinutes.setText(minutes + " minutes");
        //.setText(hours + " hours");


        //resultHours.setText(hours);
    }
}
