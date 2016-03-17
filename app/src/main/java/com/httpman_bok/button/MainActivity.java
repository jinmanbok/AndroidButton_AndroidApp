package com.httpman_bok.button;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity  implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mFirstButton,mSecondButton, mThirdButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               mFirstButton = (Button) findViewById(R.id.bFirstButton);
               mSecondButton = (Button) findViewById(R.id.bSecondButton);
               mThirdButton = (Button) findViewById(R.id.bThirdButton);



               mFirstButton.setOnClickListener(MainActivity.this);
               mSecondButton.setOnClickListener(MainActivity.this);
               mThirdButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Log.d(TAG,"Third Button Clicked");
                   }
               });

        }
    public void performStuff (View v) {
        Log.d(TAG, "Button was clicked");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bFirstButton:
                Log.d(TAG, "First Button Clicked");

                break;

            case R.id.bSecondButton:
                Log.d(TAG, "Second Button Clicked");

                break;

        }
    }}

