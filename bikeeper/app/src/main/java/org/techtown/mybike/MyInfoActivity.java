package org.techtown.mybike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MyInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);
        ImageButton backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        ImageButton profile = (ImageButton)findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prointent = new Intent(MyInfoActivity.this,ProfileActivity.class);
                startActivity(prointent);
            }
        });
        ImageButton bikeinfo = (ImageButton)findViewById(R.id.bikeinfo);
        bikeinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bik = new Intent(MyInfoActivity.this,BikeInfoAcivity.class);
                startActivity(bik);
            }
        });
        ImageButton personal = (ImageButton)findViewById(R.id.personal);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent per = new Intent(MyInfoActivity.this,Personalinfo2Activity.class);
                startActivity(per);
            }
        });
        ImageButton ready1 = (ImageButton)findViewById(R.id.ready1);
        ImageButton ready2 = (ImageButton)findViewById(R.id.ready2);

        ready1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyInfoActivity.this, "기능 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });

        ready2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyInfoActivity.this, "기능 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
