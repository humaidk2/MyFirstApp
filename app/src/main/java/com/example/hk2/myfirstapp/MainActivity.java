package com.example.hk2.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    TextView t;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.xmlTextView);
        b = (Button) findViewById(R.id.button);
        t.setText("lol");
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Hey this", LENGTH_SHORT).show();
    }

    public void buttonPressed(View view) {
        t.setText("yolo");
    }


}
