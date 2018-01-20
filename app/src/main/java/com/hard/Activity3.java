package com.hard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        textView = findViewById(R.id.textView3);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }
}
