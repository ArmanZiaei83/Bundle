package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean passCheck ;

    public Button signIn ;
    public EditText email , pass , repeatPass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn = (Button) findViewById(R.id.signIn);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        repeatPass = (EditText) findViewById(R.id.repeatPass);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().equals(repeatPass.getText().toString()) && email.getText().toString().contains("@gmail.com")){
                    Intent intent = new Intent(getApplicationContext() , sendData.class);
                    intent.putExtra("email" , email.getText().toString());
                    intent.putExtra("pass" , pass.getText().toString());

                    startActivity(intent);
                }
            }
        });
    }
}