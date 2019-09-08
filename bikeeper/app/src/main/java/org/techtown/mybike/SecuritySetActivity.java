package org.techtown.mybike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class SecuritySetActivity extends AppCompatActivity {

    Switch onoff;
    MainActivity main;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_securityset);

        Toast.makeText(SecuritySetActivity.this, "스위치-OFF", Toast.LENGTH_SHORT).show();
        Toast.makeText(SecuritySetActivity.this, "스위치-OFF", Toast.LENGTH_SHORT).show();

        onoff=(Switch)findViewById(R.id.onoff);
    }
}