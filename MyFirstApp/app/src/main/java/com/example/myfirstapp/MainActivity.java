package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    /*public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";*/
    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate end");
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Log.i("MainActivity", "Dentro de sendMessage");

        EditText editText = findViewById(R.id.editText);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        /*EditText editText = (EditText) findViewById(R.id.editText);*/
        /*String message = editText.getText().toString();*/
        intent.putExtra("MESSAGE_KEY","Texto que paso a la 2 actiidad");
        startActivity(intent);
    }
}




