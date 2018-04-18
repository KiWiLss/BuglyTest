package com.kiwilss.buglytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateListener(View view) {

        Beta.checkUpgrade();
    }

    public void clickListener(View view) {
        String test=null;
        //Log.e("MMM", "clickListener: "+test.length());
        Toast.makeText(this, "******", Toast.LENGTH_SHORT).show();
    }

    public void downListener(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
