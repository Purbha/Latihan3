package com.ims_hr.latihan3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_Submit();
    }

    private void Inisial() {
        tombol = findViewById(R.id.button_Main_Submit);
    }

    private void Listen_B_Submit() {
        tombol.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Halo apa kabar", Toast.LENGTH_LONG).show());
    }

}
