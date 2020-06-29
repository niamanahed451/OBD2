package com.example.obd2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {
    //declaration
    EditText etVoiture ,etMatricule, etPanne;
    Button bSubmit,bSuivant,bdiagnostic;
    TextView tvRegister;
    DatabaseReference reff;
    Member member ;
    long maxid=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //recupération des id
        etVoiture=(EditText)findViewById(R.id.etVoiture);
        etMatricule=(EditText)findViewById(R.id.etMatricule);
        etPanne=(EditText)findViewById(R.id.etPanne);
        bSubmit=(Button) findViewById(R.id.bSubmit);
        bSuivant=(Button) findViewById(R.id.bSuivant);
        bdiagnostic=(Button) findViewById(R.id.bdiagnostic);
        tvRegister=(TextView) findViewById(R.id.tvRegister);
        member = new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                    maxid=(dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //association des listeenners


        bSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Login.this,Panne.class));

            }
        });

        bdiagnostic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //traitement
                // (safi niya min... ila ...
                startActivity(new Intent(Login.this,Diagnostic.class));

            }
        });



        // connection firebase

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int Panne =Integer.parseInt(etPanne.getText().toString().trim());
                member.setPanne(Panne);
                member.setMarque(etVoiture.getText().toString().trim());
                member.setMatricule(etMatricule.getText().toString().trim());
                reff.push().setValue(member);

                reff.child(String.valueOf(maxid+1)).setValue(member);
                Toast.makeText(Login.this, "data  insered successfuly", Toast.LENGTH_SHORT).show();


            }
        });

           // champs required


        if( TextUtils.isEmpty(etVoiture.getText())){
            /**
             *   You can Toast a message here that the Username is Empty
             **/

            etVoiture.setError( "required" );

        }else{
            Intent i = new Intent(getApplicationContext(), Login.class);
            startActivity(i);
        }
       




        if( TextUtils.isEmpty(etPanne.getText())){
            /**
             *   You can Toast a message here that the Username is Empty
             **/

            etPanne.setError( " required!" );

        }else{
            Intent i = new Intent(getApplicationContext(), Login.class);
            startActivity(i);
        }


        if( TextUtils.isEmpty(etMatricule.getText())){
            /**
             *   You can Toast a message here that the Username is Empty
             **/

            etMatricule.setError( " required!" );

        }else{
            Intent i = new Intent(getApplicationContext(), Login.class);
            startActivity(i);
        }








      /* etPanne.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                insertValues();
                EditText userName = (EditText) findViewById(R.id.etPanne);

                if( userName.getText().toString().length() == 0 )
                    userName.setError( " veillez remplir votre champs!" );

                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        }); */


       /* bSubmit.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                insertValues();
                Button userName = (Button) findViewById(R.id.bSubmit);

                if( userName.getText().toString().length() == 0 )
                    userName.setError( " veillez remplir votre champs!" );

                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        }); */















    }

    private void insertValues() {
    }


}
