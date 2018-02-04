package com.tugas.farhanfaizakbar.farhanfaizakbar_1202150095_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private int hargaAbnormal = 30000;
    private int hargaEatbus = 50000;
    public int uang = 65500;
    private int totalHarga;
    private EditText aMenu;
    private EditText aTotal;
    String adaMenu = "Nasi Uduk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aMenu = (EditText) findViewById(R.id.menu);
        aTotal = (EditText) findViewById(R.id.jumlah);
    }


    public void clickEatbus(View view) {
        Log.d(LOG_TAG, "Button Eatbus");
        int jumlah = Integer.parseInt(aTotal.getText().toString());
        String menu = aMenu.getText().toString();
        totalHarga = jumlah * hargaEatbus;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("menu", menu);
        intent.putExtra("totalHarga", totalHarga);
        intent.putExtra("uang", uang);
        intent.putExtra("lokasi", "Eatbus");
        startActivity(intent);}

    public void clickAbnormal(View view) {
        Log.d(LOG_TAG, "Button Upnormal");
        int jumlah = Integer.parseInt(aTotal.getText().toString());
        String menu = aMenu.getText().toString();
        totalHarga = jumlah * hargaAbnormal;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("menu", menu);
        intent.putExtra("totalHarga", totalHarga);
        intent.putExtra("uang", uang);
        intent.putExtra("lokasi", "Upnormal");
        startActivity(intent);

    }

}
