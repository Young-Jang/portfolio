package org.techtown.mybike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ReservationStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_store);
        ImageButton backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sto = new Intent(ReservationStoreActivity.this,MainActivity.class);
                startActivity(sto);
            }
        });

        TextView returnss = (TextView)findViewById(R.id.returnss);
        returnss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(ReservationStoreActivity.this,ReservationReturnActivity.class);
                startActivity(ret);
            }
        });
    }
}
