package com.luckey.esmokingprogress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CircleProgressBar cpbDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        cpbDemo = (CircleProgressBar) findViewById(R.id.circleprogressbar_cpb_demo);
        cpbDemo.setProgress(55);
    }
}
