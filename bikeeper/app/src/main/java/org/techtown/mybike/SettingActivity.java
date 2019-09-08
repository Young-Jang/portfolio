package org.techtown.mybike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    ImageButton ready2,ready3,ready4;
    Button ready1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ImageButton backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ImageButton alarm = (ImageButton)findViewById(R.id.alarm);

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arm = new Intent(SettingActivity.this,NoticeActivity.class);
                startActivity(arm);
            }
        });

        ready1=(Button)findViewById(R.id.ready1);
        ready2=(ImageButton)findViewById(R.id.ready2);
        ready3=(ImageButton)findViewById(R.id.ready3);
        ready4=(ImageButton)findViewById(R.id.ready4);

        ready1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "로그아웃 기능은 지원하지 않습니다.", Toast.LENGTH_SHORT).show();

            }
        });

        ready2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "기능 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        ready3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "번역기능 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        ready4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "이미 최신버전입니다.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
