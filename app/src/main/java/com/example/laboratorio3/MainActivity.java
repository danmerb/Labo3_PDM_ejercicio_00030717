package com.example.laboratorio3;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.laboratorio3.utils.AppConstants;
import com.example.laboratorio3.utils.person;

public class MainActivity extends AppCompatActivity {

    private EditText etusername,etpass,etemail,etgen;
    private Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusername=findViewById(R.id.et_username);
        etpass=findViewById(R.id.et_password);
        etemail=findViewById(R.id.et_email);
        etgen=findViewById(R.id.et_gender);

        btnsend=findViewById(R.id.btn_send);
        btnsend.setOnClickListener(v -> {
            person  persona = new person(etusername.getText().toString(),
                    etpass.getText().toString(),
                    etemail.getText().toString(),
                    etgen.getText().toString());

            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,persona);
            startActivity(mIntent);
        });

    }

    }

