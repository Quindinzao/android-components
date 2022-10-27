package com.quindinzao.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, getText(R.string.is_checked).toString(), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getText(R.string.is_not_checked).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}