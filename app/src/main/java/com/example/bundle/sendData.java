package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sendData extends AppCompatActivity {
    TextView setEmail , setPass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data);

        setEmail = (TextView) findViewById(R.id.txtv_email);
        setPass = (TextView) findViewById(R.id.txtv_pass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("email");
        String pass = bundle.getString("pass");

        setEmail.setText("Email :" + email);
        setPass.setText("Pass : " + pass);
    }
}