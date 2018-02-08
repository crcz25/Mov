package com.example.crcz.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        String data = bundle.getString("userName");

        TextView myText = (TextView) findViewById(R.id.textView1);
        if(data.length() > 0){
            myText.setText("Welcome back:- "+data);
            Button btn1 = (Button) findViewById(R.id.button_back);
            btn1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    startActivity(new Intent(Main2Activity.this, MainActivity.class));
                }
            });
        } else {
            myText.setText("Wrong user!!");
        }

    }
}
