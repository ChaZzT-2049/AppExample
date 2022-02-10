package com.example.appexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAl, btnDa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAl= findViewById(R.id.Alim);
        btnDa= findViewById(R.id.Agua);
        btnAl.setOnClickListener(this);
        btnDa.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageView img1 = findViewById(R.id.comida);
        ImageView img2 = findViewById(R.id.bagua);
        if (view.getId()==btnAl.getId()){
            Toast.makeText(getApplicationContext(), "Alimentando a Pou",Toast.LENGTH_LONG).show();
            img1.setVisibility(View.INVISIBLE);

        }
        if (view.getId()==R.id.Agua){
            Toast.makeText(getApplicationContext(), "Hidratando a Pou",Toast.LENGTH_LONG).show();
            img2.setVisibility(View.INVISIBLE);

        }

    }
}