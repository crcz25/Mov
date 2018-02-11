package com.example.crcz.lab4;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChildGyro extends AppCompatActivity implements SensorEventListener {

    private TextView rollText, yawText, pitchText;
    private Sensor mySensor;
    private SensorManager SM;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_gyro);

        SM = (SensorManager)getSystemService(SENSOR_SERVICE);
        mySensor = SM.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_UI);

        yawText = (TextView)findViewById(R.id.yawText);
        pitchText = (TextView)findViewById(R.id.pitchText);
        rollText = (TextView)findViewById(R.id.rollText);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(ChildGyro.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        yawText.setText(("Yaw: " + sensorEvent.values[0]));
        pitchText.setText(("Pitch: " + sensorEvent.values[1]));
        rollText.setText(("Roll: " + sensorEvent.values[2]));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        //Not in use
    }

    @Override
    protected void onResume() {
        super.onResume();
        SM.registerListener(this, this.mySensor, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SM.unregisterListener(this);
    }
}
