package com.example.myecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class SecondPage extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        t1=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String str= intent.getStringExtra("username");
        t1.setText(str);

    }
}