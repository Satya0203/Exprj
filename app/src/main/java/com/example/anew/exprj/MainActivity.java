package com.example.anew.exprj;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start=findViewById(R.id.b1);
        Button stop=findViewById(R.id.b2);
        stop.setEnabled(false);
        Random random=new Random();
        MediaPlayer mp;
    }

    public void start(View view)
    {
        if(checkPermission())
        {
            MediaRecorderReady();
            try
            {
                MediaRecorder mr
            }
            catch (Exception e)
            {
                System.err.print(e);
            }
        }

    }

    public void stop(View view) {
    }
}
