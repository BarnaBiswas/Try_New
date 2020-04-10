package com.example.welink.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.welink.R;

public class MainActivity extends AppCompatActivity {
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.loginBtn);
        signup = (Button) findViewById(R.id.signUpBtn);

    }
}
