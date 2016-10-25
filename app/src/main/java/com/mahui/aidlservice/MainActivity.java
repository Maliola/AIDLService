package com.mahui.aidlservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mahui.aidlservice.service.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this, MyService.class);
        startService(intent);
    }
/*
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent=new Intent(this, MyService.class);
        stopService(intent);
    }*/
}
