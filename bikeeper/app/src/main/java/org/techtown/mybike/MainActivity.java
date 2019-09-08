package org.techtown.mybike;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageButton lock, notice, save, returns, state;
    Boolean checks = false;
    TextView textlocation, stateText;
    String location;
    ImageView inquiry, setting,reservation_return,reservation_store,myinfo;

    private ImageSwitcher is1;
    private TextSwitcher ts1;
    private
    int index;
    float downX, upX;
    String texts[] = {"일정거리 이탈시 알림", "충격감지시 알림", "주기적인 상태 알림"};
    int images[] = {R.drawable.ic_slide_01, R.drawable.ic_slide_02, R.drawable.ic_slide_03};

    @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);



        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);

        // 전체화면인 DrawerLayout 객체 참조
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Drawer 화면(뷰) 객체 참조
        final View drawerView = (View) findViewById(R.id.drawer);


        // 드로어 화면을 열고 닫을 버튼 객체 참조
        ImageButton btnOpenDrawer = (ImageButton) findViewById(R.id.menu);
        LinearLayout btnCloseDrawer =(LinearLayout)findViewById(R.id.out);

        // 드로어 여는 버튼 리스너
        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });


        // 드로어 닫는 버튼 리스너
        btnCloseDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(drawerView);
            }
        });

        lock = (ImageButton) findViewById(R.id.security);
        notice = (ImageButton) findViewById(R.id.notice);
        save = (ImageButton) findViewById(R.id.save);
        returns = (ImageButton) findViewById(R.id.returns);
        state = (ImageButton) findViewById(R.id.state);

        inquiry = (ImageView)findViewById(R.id.inquiry);
        setting = (ImageView)findViewById(R.id.setting);
        reservation_return = (ImageView)findViewById(R.id.reservation);
        myinfo = (ImageView)findViewById(R.id.myinfo);

        textlocation = (TextView) findViewById(R.id.locaText);



        stateText = (TextView) findViewById(R.id.stateText);

        stateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stat = new Intent(MainActivity.this, BikeStateActivity.class);
                startActivity(stat);
            }
        });

        inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inquiryintent = new Intent(MainActivity.this,InquiryActivity.class);
                startActivity(inquiryintent);
            }
        });
        myinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inquiryintent = new Intent(MainActivity.this,MyInfoActivity.class);
                startActivity(inquiryintent);
            }
        });

        reservation_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inquiryintent = new Intent(MainActivity.this,ReservationReturnActivity.class);
                startActivity(inquiryintent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inquiryintent = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(inquiryintent);
            }
        });



       /* Intent intent = getIntent();
        location = intent.getExtras().getString("location");
        textlocation.setText(location);
*/
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "푸쉬알림은 준비중입니다.", Toast.LENGTH_SHORT).show();
                Intent note = new Intent(MainActivity.this, pushActivity.class);
                startActivity(note);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sav = new Intent(MainActivity.this, LocationActivity.class);
                startActivity(sav);
            }
        });
        returns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retrn = new Intent(MainActivity.this, LocationRetrunActivity.class);
                startActivity(retrn);
            }
        });
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stat = new Intent(MainActivity.this, BikeStateActivity.class);
                startActivity(stat);
            }
        });

    }

    public void OnSecurityPopupClick(View v) {
        LayoutInflater inflater = getLayoutInflater();

        final View dialogView = inflater.inflate(R.layout.activity_securityset, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final Switch swit = (Switch) dialogView.findViewById(R.id.onoff);

        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    Toast.makeText(MainActivity.this, "잠금모드 실행", Toast.LENGTH_SHORT).show();
                    lock.setImageResource(R.drawable.ic_lock_re);
                    swit.setChecked(true);
                    checks = true;
                } else {
                    Toast.makeText(MainActivity.this, "잠금모드 해제", Toast.LENGTH_SHORT).show();
                    lock.setImageResource(R.drawable.ic_unlock_re);
                    swit.setChecked(false);
                    checks = false;
                }
            }
        });

        if (checks == true)
            swit.setChecked(true);
        else
            swit.setChecked(false);

        builder.setView(dialogView);

        final AlertDialog dialog = builder.create();
        dialog.show();

    }

    @SuppressLint("ClickableViewAccessibility")
    public void SecurityOnPopupClick(View v) {
        final LayoutInflater inflater = getLayoutInflater();

        final View dialogView = inflater.inflate(R.layout.activity_securityset, null);
        final View dialogView2 = inflater.inflate(R.layout.activity_lock_popup, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final Switch swit = (Switch) dialogView.findViewById(R.id.onoff);


                if(checks==true) {
                    builder.setView(dialogView2);

                    is1 = (ImageSwitcher) dialogView2.findViewById(R.id.is1);
                    is1.setFactory(new ViewSwitcher.ViewFactory() {
                        @Override
                        public View makeView() {
                            ImageView imageView = new ImageView(getApplicationContext());
                            return imageView;
                        }
                    });

                    is1.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {

                            if(event.getAction()== MotionEvent.ACTION_DOWN)
                            {
                                downX=event.getX();
                            }
                            else if(event.getAction()== MotionEvent.ACTION_UP){
                                upX=event.getX();

                                if(downX<upX){
                                    if(index>0) {
                                        index--;
                                        is1.setInAnimation(MainActivity.this, android.R.anim.slide_in_left);
                                        is1.setOutAnimation(MainActivity.this, android.R.anim.slide_out_right);
                                        setImagenText();
                                    }
                                }
                                else if(downX>upX)
                                {
                                    if(index<2) {
                                        index++;
                                        is1.setInAnimation(MainActivity.this, R.anim.slide_in_right);
                                        is1.setOutAnimation(MainActivity.this, R.anim.slide_out_left);
                                        if (index == images.length)
                                            index = 0;
                                        is1.setImageResource(images[index]);
                                        ts1.setText(texts[index]);
                                    }
                                }

                            }
                            return true;
                        }
                    });
                    ts1 = (TextSwitcher) dialogView2.findViewById(R.id.ts1);
                    ts1.setFactory(new ViewSwitcher.ViewFactory() {
                        @Override
                        public View makeView() {
                            TextView textView = new TextView(getApplicationContext());
                            textView.setTextSize(20.f);
                            textView.setTextColor(Color.GRAY);
                            textView.setGravity(Gravity.CENTER);
                            return textView;
                        }
                    });
                    ts1.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {

                            if(event.getAction()== MotionEvent.ACTION_DOWN)
                            {
                                downX=event.getX();
                            }
                            else if(event.getAction()== MotionEvent.ACTION_UP){
                                upX=event.getX();
                                if(downX<upX){
                                    if(index>0) {
                                        index--;
                                        is1.setInAnimation(MainActivity.this, android.R.anim.slide_in_left);
                                        is1.setOutAnimation(MainActivity.this, android.R.anim.slide_out_right);
                                        setImagenText();
                                    }
                                }
                                else if(downX>upX)
                                {
                                    if(index<2) {
                                        index++;
                                        is1.setInAnimation(MainActivity.this, R.anim.slide_in_right);
                                        is1.setOutAnimation(MainActivity.this, R.anim.slide_out_left);
                                        if (index == images.length)
                                            index = 0;
                                        is1.setImageResource(images[index]);
                                        ts1.setText(texts[index]);
                                    }
                                }

                            }
                            return true;}
                    });
                    setImagenText();

                    final AlertDialog dialog = builder.create();
                    dialog.show();
                }
    }

    public void setImagenText(){
        is1.setImageResource(images[index]);
        ts1.setText(texts[index]);
    }
}
