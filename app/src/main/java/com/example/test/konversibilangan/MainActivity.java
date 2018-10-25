package com.example.test.konversibilangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_decimal(View view) {
        Intent psg = new Intent(MainActivity.this, Decimal.class);
        startActivity(psg);
    }


    public void btn_hexa(View view) {
        Intent hex = new Intent(MainActivity.this, hexa.class);
        startActivity(hex);
    }
}
