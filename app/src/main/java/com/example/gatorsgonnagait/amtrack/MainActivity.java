package com.example.gatorsgonnagait.amtrack;


import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    int hours;
    int minutes;
    int length;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText hoursInput = (EditText) findViewById(R.id.hoursInput);
        final EditText minutesInput = (EditText) findViewById(R.id.minutesInput);
        final EditText lengthInput = (EditText) findViewById(R.id.lengthInput);

        Button save = (Button) findViewById(R.id.save);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //System.out.println(hoursInput);

                hours = Integer.parseInt(hoursInput.getText().toString());
                minutes = Integer.parseInt(minutesInput.getText().toString());
                length = Integer.parseInt(lengthInput.getText().toString());

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", hours);
                editor.putInt("key2", minutes);
                editor.putInt("key3", length);
                boolean successfullySaved = editor.commit();
                //System.out.println(hours);
                if(successfullySaved) {
                    startActivity(new Intent(MainActivity.this, Status.class));
                }

            }
        });
    }



}
