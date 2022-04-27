package com.example.a10119212latihan2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// Muhammad Irsyad Ibrahim 10119212 IF-6
public class Register extends AppCompatActivity {

    private RadioGroup gender;
    private RadioButton genderbutton;
    private Spinner blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void back(View v){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void register(View v){
        Intent intent = new Intent(this, Verifikasi.class);
        startActivity(intent);
    }

    public void onClick(View v){
        int selectedId = gender.getCheckedRadioButtonId();

        genderbutton = (RadioButton) findViewById(selectedId);
    }

    public void listBlood(View view){
        Toast.makeText(Register.this,"Selected"+blood.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }
}
