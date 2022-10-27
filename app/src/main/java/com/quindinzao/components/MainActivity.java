package com.quindinzao.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUsername = findViewById(R.id.edtUsername);
        Button btnShowUsername = findViewById(R.id.btnShowUsername);

        btnShowUsername.setOnClickListener(v -> {
            if (!edtUsername.getText().toString().equals("")) {
                Toast.makeText(this, edtUsername.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}