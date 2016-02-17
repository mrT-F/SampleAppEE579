package com.example.timferrell.sampleapp579;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {
    public final static String USER_NAME = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /*This method is called when the Submit button is clicked*/
    public void validateUserName(View view){
        //Get username and compare it
        EditText userName = (EditText) findViewById(R.id.userName);
        String userNameSubmission = userName.getText().toString();
        TextView errorMessage = (TextView) findViewById(R.id.userNameErrorMessage);
        errorMessage.setVisibility(View.GONE);
        if(userNameSubmission.equalsIgnoreCase("TA") || userNameSubmission.equalsIgnoreCase("ee579_g1")){
            Intent intent = new Intent(this,DisplayClassInformation.class);
            intent.putExtra(USER_NAME, userNameSubmission);
            startActivity(intent);
        }
        else{
            //Re-display Warning
            errorMessage.setVisibility(View.VISIBLE);
        }


    }
}
