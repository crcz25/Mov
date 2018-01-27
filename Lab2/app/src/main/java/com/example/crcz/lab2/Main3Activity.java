package com.example.crcz.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

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
    }
}
