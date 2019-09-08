package org.techtown.mybike;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TimeSelectActivity extends AppCompatActivity {

    Spinner month,date,time;
    String[] Imonth,Idate,Itime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_select);

        ImageButton backbutton = (ImageButton)findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        month = (Spinner)findViewById(R.id.month);
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);

            ListPopupWindow window = (ListPopupWindow)popup.get(month);
            window.setHeight(700); //pixel
        } catch (Exception e) {
            e.printStackTrace();
        }

        date = (Spinner)findViewById(R.id.date);
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);

            ListPopupWindow window = (ListPopupWindow)popup.get(date);
            window.setHeight(700); //pixel
        } catch (Exception e) {
            e.printStackTrace();
        }

        time = (Spinner)findViewById(R.id.time);
        try {
            Field popup = Spinner.class.getDeclaredField("mPopup");
            popup.setAccessible(true);

            ListPopupWindow window = (ListPopupWindow)popup.get(time);
            window.setHeight(700); //pixel
        } catch (Exception e) {
            e.printStackTrace();
        }

        Imonth= new String[]{"월","1","2","3","4","5","6","7","8","9","10","11","12"};
        Idate = new String[]{"일","1","2","3","4","5","6","7","8","9","10","11","12","13","14"
                ,"15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        Itime = new String[]{"시","06:00","06:15","06:30","06:45","07:00","07:15","07:30","07:45","08:00","08:15","08:30","08:45"
                ,"09:00","09:15","09:30","09:45","10:00","10:15","10:30","10:45"};

        ArrayAdapter<String> Madapter = new ArrayAdapter<String>(this,R.layout.spinner_row,Imonth);
        Madapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        month.setAdapter(Madapter);

        ArrayAdapter<String> Dadapter = new ArrayAdapter<String>(this,R.layout.spinner_row,Idate);
        Dadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        date.setAdapter(Dadapter);

        ArrayAdapter<String> Tadapter = new ArrayAdapter<String>(this,R.layout.spinner_row,Itime);
        Tadapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        time.setAdapter(Tadapter);



        month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        date.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Button okay=(Button)findViewById(R.id.okay);

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ok = new Intent(TimeSelectActivity.this,CompleteActivity.class);
                startActivity(ok);
            }
        });

    }
}
