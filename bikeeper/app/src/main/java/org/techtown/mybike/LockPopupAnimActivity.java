package org.techtown.mybike;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class LockPopupAnimActivity extends AppCompatActivity {

    private ImageSwitcher is1;
    private TextSwitcher ts1;
    int index;
    float downX,upX;
    String texts[]={"흑석역 앞 중앙 사우나에 불났어요","상도역 사거리 교통사고","보라매 아파트 추락사고발생"};
    int images[]={R.drawable.ic_slide_01,R.drawable.ic_slide_02,R.drawable.ic_slide_03};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_popup);

    }
}