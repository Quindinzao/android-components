package com.quindinzao.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchMaterial swHelloWorld = findViewById(R.id.swHelloWorld);
        TextView txtHelloWorld = findViewById(R.id.txtHelloWorld);

        swHelloWorld.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                txtHelloWorld.setText("ON");
            } else {
                txtHelloWorld.setText("OFF");
            }
        });
    }
}