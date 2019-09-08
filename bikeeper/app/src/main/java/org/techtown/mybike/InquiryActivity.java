package org.techtown.mybike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class InquiryActivity extends AppCompatActivity {

    ImageButton ready1,ready2,ready3,ready4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);

        ImageButton backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ready1=(ImageButton)findViewById(R.id.ready1);
        ready2=(ImageButton)findViewById(R.id.ready2);
        ready3=(ImageButton)findViewById(R.id.ready3);
        ready4=(ImageButton)findViewById(R.id.ready4);

        ready1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InquiryActivity.this, "공지사항 기능은 지원하지 않습니다.", Toast.LENGTH_SHORT).show();

            }
        });

        ready2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InquiryActivity.this, "이용약관 기능은 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        ready3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InquiryActivity.this, "자주묻는질문은 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        ready4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InquiryActivity.this, " 1:1 문의는 준비중입니다.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
