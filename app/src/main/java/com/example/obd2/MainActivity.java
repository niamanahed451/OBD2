package com.example.obd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    TextView tvRegister;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Firebase connection success", Toast.LENGTH_SHORT).show();
        toolbar=findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tvRegister=(TextView) findViewById(R.id.tvRegister);






        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                 startActivity(new Intent(MainActivity.this,Login.class));



            }
        });


    }
}
