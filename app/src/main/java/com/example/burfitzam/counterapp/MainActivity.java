package com.example.burfitzam.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView angka;
    Button tombolKiri;
    Button tombolKanan;
    Button tombolReset;
    int counter;

    //referensi
    //https://www.youtube.com/watch?v=7d6iKupzkEg&t=194s
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_kiri:
                    minus();
                    break;
                case R.id.btn_kanan:
                    plus();
                    break;
                case R.id.btn_reset:
                    reset();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka = (TextView) findViewById(R.id.tv_angka);
        tombolKiri = (Button) findViewById(R.id.btn_kiri);
        tombolKiri.setOnClickListener(clickListener);
        tombolKanan = (Button) findViewById(R.id.btn_kanan);
        tombolKanan.setOnClickListener(clickListener);
        tombolReset = (Button) findViewById(R.id.btn_reset);
        tombolReset.setOnClickListener(clickListener);

        init();

    }
    private void init(){
        counter = 0;
        angka.setText(counter + " ");
    }
    private void plus (){
        counter++;
        angka.setText(counter + " ");
    }
    private void minus (){
        counter--;
        angka.setText(counter + " ");
    }
    private void reset () {
        counter = 0;
        angka.setText(counter + " ");
    }
}
