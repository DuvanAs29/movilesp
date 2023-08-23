package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteles extends AppCompatActivity {
Button botonVermas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        botonVermas=findViewById(R.id.botonvermashoteles);
        botonVermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Hoteles.this,HomeHotel.class);
                startActivity(intent);
            }
        });
    }
}