package com.example.deep_skku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    TextView login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);
    }



    public void onClick(View v) {
        if (v.getId() == R.id.login_btn) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
}
}