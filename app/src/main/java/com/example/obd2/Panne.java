package com.example.obd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Panne extends AppCompatActivity {
    Button bpanne1, bpanne2, bpanne3, bpanne4, bpanne5, bpanne6, bpanne7, bpanne8, bpanne9, bpanne10, bpanne11, bpanne12, bpanne13, bpanne14, bpanne15, bpanne16, bpanne17;
    TextView tvcode;
    private int buttonState = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panne);
        bpanne1=(Button) findViewById(R.id.bpanne1);
        bpanne2=(Button) findViewById(R.id.bpanne2);
        bpanne3=(Button) findViewById(R.id.bpanne3);
        bpanne4=(Button) findViewById(R.id.bpanne4);
        bpanne5=(Button) findViewById(R.id.bpanne5);
        bpanne6=(Button) findViewById(R.id.bpanne6);
        bpanne7=(Button) findViewById(R.id.bpanne7);
        bpanne8=(Button) findViewById(R.id.bpanne8);
        bpanne9=(Button) findViewById(R.id.bpanne9);
        bpanne10=(Button) findViewById(R.id.bpanne10);
        bpanne11=(Button) findViewById(R.id.bpanne11);
        bpanne17=(Button) findViewById(R.id.bpanne17);
        bpanne12=(Button) findViewById(R.id.bpanne12);
        bpanne13=(Button) findViewById(R.id.bpanne13);
        bpanne14=(Button) findViewById(R.id.bpanne14);
        bpanne15=(Button) findViewById(R.id.bpanne15);
        bpanne16=(Button) findViewById(R.id.bpanne16);
        bpanne17=(Button) findViewById(R.id.bpanne17);
        tvcode=(TextView) findViewById(R.id.tvcode);




        bpanne17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page.class));



            }
        });


        bpanne16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page1.class));



            }
        });

        bpanne15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page2.class));



            }
        });

        bpanne14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page3.class));



            }
        });


        bpanne13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page4.class));



            }
        });



        bpanne12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page5.class));



            }
        });


        bpanne11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page6.class));



            }
        });


        bpanne10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page7.class));



            }
        });


        bpanne9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page8.class));



            }
        });


        bpanne8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page9.class));



            }
        });



        bpanne7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page10.class));



            }
        });



        bpanne6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page11.class));



            }
        });


        bpanne5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page12.class));



            }
        });


        bpanne4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page13.class));



            }
        });


        bpanne3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page14.class));



            }
        });

        bpanne2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page15.class));



            }
        });

        bpanne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Panne.this,Page16.class));




                



            }
        });






    }




}
