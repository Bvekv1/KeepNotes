package com.bibek.keepnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvHeader, tvNoAccount;
    private EditText  etUserName, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHeader = findViewById(R.id.tvHeader);
        tvNoAccount = findViewById(R.id.tvNoAccount);
        
    }
}
