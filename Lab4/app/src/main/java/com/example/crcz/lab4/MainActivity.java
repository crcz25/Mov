package com.example.crcz.lab4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, 50);
            Log.i("myTag", "SOLICITAR PERMISOS PARA CAMARA");

        }

        Button accButton = findViewById(R.id.accButton);
        accButton.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ChildAccelerometer.class);
                    startActivity(intent);
                }
            }
        );
        Button gyroButton = findViewById(R.id.gyroButton);
        gyroButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, ChildGyro.class);
                        startActivity(intent);
                    }
                }
        );
        Button flashButton = findViewById(R.id.flashButton);
        flashButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, ChildFlashlight.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
