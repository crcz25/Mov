package com.example.crcz.lab4;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChildFlashlight extends AppCompatActivity {
    private boolean isFlashOn, hasFlash;
    private Camera camera;
    private Camera.Parameters params;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_flashlight);

        Button flashButton = findViewById(R.id.buttonFlashLight);

        isFlashOn = false;

        hasFlash = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        if (!hasFlash){
            Toast.makeText(ChildFlashlight.this, "Sorry, you device does not have any camera", Toast.LENGTH_LONG).show();
            return;
        } else {
            Log.i("myTag", "OBTENIENDO CAMARA");
            getCamera();
        }

        flashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (isFlashOn) {
                        turnOffTheFlash();
                        isFlashOn = false;
                    } else {
                        turnOnTheFlash();
                        isFlashOn = true;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(ChildFlashlight.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    private void getCamera() {
        if (camera == null) {
            try {
                camera = Camera.open();
                params = camera.getParameters();
            } catch (RuntimeException e) {
                Log.e("Camera Error. Error: ", e.getMessage());
            }
        }
    }

    private void turnOffTheFlash() {
        params = camera.getParameters();
        params.setFlashMode(params.FLASH_MODE_OFF);
        camera.setParameters(params);
        camera.stopPreview();
        isFlashOn = false;
    }

    private void turnOnTheFlash() {
        params = camera.getParameters();
        params.setFlashMode(params.FLASH_MODE_TORCH);
        camera.setParameters(params);
        camera.startPreview();
        isFlashOn = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(isFlashOn){
            turnOffTheFlash();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(isFlashOn){
            turnOffTheFlash();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(isFlashOn){
            turnOnTheFlash();
        }
    }

}
