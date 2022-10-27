package com.quindinzao.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgOptions = findViewById(R.id.rgOptions);

        rgOptions.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.optionA) {
                Toast.makeText(this, getString(R.string.option_a) + " is selected!", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.optionB) {
                Toast.makeText(this, getString(R.string.option_b) + " is selected!", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.optionC) {
                Toast.makeText(this, getString(R.string.option_c) + " is selected!", Toast.LENGTH_SHORT).show();
            } else {
                return;
            }
        });
    }
}