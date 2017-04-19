package com.awesome.jitsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.awesome.samplekit.Api;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Api.testPrint();
    }
}
