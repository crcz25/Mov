package com.example.crcz.lab3;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bLogin;
    EditText ed1, ed2;

    TextView txt;
    String mytext;
    Context context;

    public void passData(View view, String userName){
        String text = userName;

        Intent pass_data = new Intent(MainActivity.this, Main2Activity.class);
        pass_data.putExtra("userName",text);
        startActivity(pass_data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();


        bLogin = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Password OK!",Toast.LENGTH_SHORT).show();
                    passData(v, ed1.getText().toString());

                    int NOTIF_ID = 1234;
                    NotificationCompat.Builder NotifBuilder = new NotificationCompat.Builder(MainActivity.this);
                    NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
                    NotifBuilder.setContentTitle("Lab 3");
                    NotifBuilder.setContentText("Logged In:- " + ed1.getText().toString());

                    Intent notificationIntent = new Intent(MainActivity.this, Main2Activity.class);
                    PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
                    NotifBuilder.setContentIntent(contentIntent);

                    NotificationManager MyNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    MyNotification.notify(NOTIF_ID, NotifBuilder.build());
                } else {
                    AlertDialog.Builder SecondDialogConf = new AlertDialog.Builder(MainActivity.this);

                    SecondDialogConf.setTitle("Confirmation Dialog");
                    SecondDialogConf.setMessage("Wrong!!");
                    SecondDialogConf.setIcon(R.mipmap.ic_launcher);

                    SecondDialogConf.setPositiveButton("Retry",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Toast.makeText(context, "You answer Retry.", Toast.LENGTH_LONG).show();
                                    finish();
                                    startActivity(getIntent());
                                }
                            });

                    AlertDialog MySecondDialog = SecondDialogConf.create();
                    MySecondDialog.show();

                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
