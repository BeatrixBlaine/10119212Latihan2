package com.example.a10119212latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// Muhammad Irsyad Ibrahim 10119212 IF-6
public class Verifikasi_code extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifikasi_code);
    }

    public void send (View view) {
        Intent intent = new Intent(this, com.example.a10119212latihan2.user.class);
        startActivity(intent);
    }
}
