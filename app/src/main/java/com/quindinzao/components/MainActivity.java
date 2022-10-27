package com.quindinzao.components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public String stateImg = "android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Button btnChangeImage = findViewById(R.id.btnChangeImage);

        btnChangeImage.setOnClickListener(v -> {
            if (Objects.equals(stateImg, "person")) {
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
                stateImg = "android";
            } else {
                imageView.setImageResource(R.drawable.ic_person);
                stateImg = "person";
            }
        });
    }
}