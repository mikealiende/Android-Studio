package com.example.dialogalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myalertBuider = new AlertDialog.Builder(MainActivity.this);
        myalertBuider.setTitle(R.string.title_alert);
        myalertBuider.setMessage(R.string.msg_alert);

        //Buttons
        myalertBuider.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), getString(R.string.press_ok),Toast.LENGTH_SHORT).show();
            }
        });
        myalertBuider.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),getString(R.string.press_cancel),Toast.LENGTH_SHORT).show();
            }
        });


        myalertBuider.show();
    }
}