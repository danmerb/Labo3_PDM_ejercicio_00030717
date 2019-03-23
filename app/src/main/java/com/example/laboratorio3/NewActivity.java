package com.example.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.laboratorio3.utils.AppConstants;
import com.example.laboratorio3.utils.person;

public class NewActivity extends AppCompatActivity {

    private TextView tvusername,tvpass,tvemail,tvgen;
    private ImageView imgshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tvusername = findViewById(R.id.tv_username);
        tvpass = findViewById(R.id.tv_password);
        tvemail = findViewById(R.id.tv_email);
        tvgen = findViewById(R.id.tv_gender);
        Intent mIntent = this.getIntent();
        if (mIntent != null) {
            person persona = mIntent.getParcelableExtra("Persona");

            tvusername.setText( persona.getUsername());
            tvpass.setText( persona.getPassword());
            tvemail.setText( persona.getEmail());
            tvgen.setText( persona.getGender());

        }

        imgshare =findViewById(R.id.img_share);
        imgshare.setOnClickListener(v -> {

            String user = (String) tvusername.getText();
            String info = "Usuario:" + user;
            Intent Intent = new Intent();
            Intent.setAction(Intent.ACTION_SEND);
            Intent.setType("text/plain");
            Intent.putExtra(Intent.EXTRA_TEXT, info);
            startActivity(Intent);
        });
    }
}
