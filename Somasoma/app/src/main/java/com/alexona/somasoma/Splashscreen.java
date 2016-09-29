package com.alexona.somasoma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread mythread = new Thread() {
            @Override
            public void run(){
                try {
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(),AppIntro.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        mythread.start();
    }
}
