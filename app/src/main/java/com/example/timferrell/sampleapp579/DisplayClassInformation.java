package com.example.timferrell.sampleapp579;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayClassInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_class_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();

    }

    public void displayTaInfo(View view){
        TextView infoText=(TextView) findViewById(R.id.taInfo);
        if(infoText.getVisibility()==View.GONE) {
            infoText.setVisibility(View.VISIBLE);
        }
        else{
            infoText.setVisibility(View.GONE);
        }
    }

    public void displayInstructorInfo(View view){
        TextView infoText=(TextView) findViewById(R.id.instructorInfo);
        if(infoText.getVisibility()==View.GONE) {
            infoText.setVisibility(View.VISIBLE);
        }
        else{
            infoText.setVisibility(View.GONE);
        }
    }

    public void displayTeamInfo(View view){
        TextView infoText=(TextView) findViewById(R.id.teamInfo);
        if(infoText.getVisibility()==View.GONE) {
            infoText.setVisibility(View.VISIBLE);
        }
        else{
            infoText.setVisibility(View.GONE);
        }
    }

}
