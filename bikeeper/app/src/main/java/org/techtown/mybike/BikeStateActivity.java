package org.techtown.mybike;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BikeStateActivity extends AppCompatActivity {


    ImageButton backbutton;
    ImageView states;
    LinearLayout[] lays = new LinearLayout[5];
    int max=6;
    static int count =1;
    int[] imgs = new int[max];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_state);

        states=(ImageView) findViewById(R.id.states);
        backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        lays[1]=(LinearLayout)findViewById(R.id.lay2);
        lays[2]=(LinearLayout)findViewById(R.id.lay3);
        lays[3]=(LinearLayout)findViewById(R.id.lay4);
        lays[4]=(LinearLayout)findViewById(R.id.lay5);

        for (int i = 1; i < max; i++) {
            imgs[i] = getApplicationContext().getResources().getIdentifier("ic_step0"+ i, "drawable", "org.techtown.mybike");
            //리소스 획득 (R.drawable.img0)
        }

        states.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count==6) {
                    count = 1;
                    for(int i=1;i<5;i++)
                    {
                        lays[i].setVisibility(View.INVISIBLE);
                    }
                }
                if(count != 1)
                lays[count-1].setVisibility(View.VISIBLE);
                states.setImageResource(imgs[count]);
            }
        });
    }
}
