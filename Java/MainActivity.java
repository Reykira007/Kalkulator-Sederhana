package com.belajar.latihan_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nila1, nilai2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nila1 = (EditText) findViewById(R.id.nilai1);
        nilai2 = (EditText) findViewById(R.id.nilai2);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity, menu);
        return true;
    }

    public void Tambah(View view) {
        Integer a = Integer.parseInt(nila1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = a + b;
        tvHasil.setText("Hasil " + "= " + c);
    }

    public void Kurang(View view) {
        Integer a = Integer.parseInt(nila1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = a - b;
        tvHasil.setText("Hasil " + "= " + c);
    }

    public void Kali(View view) {
        Integer a = Integer.parseInt(nila1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = a * b;
        tvHasil.setText("Hasil " + "= " + c);
    }

    public void Bagi(View view) {
        Integer a = Integer.parseInt(nila1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = a / b;
        tvHasil.setText("Hasil " + "= " + c);
    }
}