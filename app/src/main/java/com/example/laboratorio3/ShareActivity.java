package com.example.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.laboratorio3.utils.person;

public class ShareActivity extends AppCompatActivity {
    private TextView tvusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        tvusername = findViewById(R.id.tv_username);
        Intent Intent = getIntent();
        if (Intent!=null) {
            tvusername.setText(Intent.getStringExtra(Intent.EXTRA_TEXT));
    }
    }
}
