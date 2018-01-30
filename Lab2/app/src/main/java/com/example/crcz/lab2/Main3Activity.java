package com.example.crcz.lab2;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {
    private ConstraintLayout layout;
    private Button buttonColor;

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnMain = (Button) findViewById(R.id.button_to_main);

        btnMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(Main3Activity.this, MainActivity.class));
            }
        });

        layout = findViewById(R.id.layout);
        buttonColor = findViewById(R.id.button_random_color);

        buttonColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int color = getRandomColor();
                layout.setBackgroundColor(color);
            }
        });

    }
}
