package com.example.obd2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Diagnostic extends AppCompatActivity {
    TextView tv0,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14;

    Button button;
    DatabaseReference reff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic);


        tv0=(TextView) findViewById(R.id.tv0);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);
        tv5=(TextView) findViewById(R.id.tv5);
        tv6=(TextView) findViewById(R.id.tv6);
        tv7=(TextView) findViewById(R.id.tv7);
        tv8=(TextView) findViewById(R.id.tv8);
        tv9=(TextView) findViewById(R.id.tv9);
        tv10=(TextView) findViewById(R.id.tv10);
        tv11=(TextView) findViewById(R.id.tv11);
        tv12=(TextView) findViewById(R.id.tv12);
        tv13=(TextView) findViewById(R.id.tv13);
        tv14=(TextView) findViewById(R.id.tv14);



        button=(Button) findViewById(R.id.button);

/*


        reff= FirebaseDatabase.getInstance().getReference().child("Codes-defauts");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String P0100=dataSnapshot.child("P0100").getValue().toString();
                String P0217=dataSnapshot.child("P0217").getValue().toString();
                String P0218=dataSnapshot.child("P0218").getValue().toString();
                String P0515=dataSnapshot.child("P0515").getValue().toString();
                String P0802=dataSnapshot.child("P0802").getValue().toString();
                String P2067=dataSnapshot.child("P2067").getValue().toString();
                String P0507=dataSnapshot.child("P0507").getValue().toString();



                textView2.setText(P0100);
                textView4.setText(P0217);
                textView6.setText(P0218);
                textView8.setText(P0515);
                textView10.setText(P0802);
                textView12.setText(P2067);
                textView14.setText(P0507);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


*/




//recupérer donner
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reff= FirebaseDatabase.getInstance().getReference().child("Codes-defauts");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String P0100 ="";
                        String P0218 ="";
                        String P0515 ="";
                        String P0802 ="";
                        String P2067 ="";
                        String P0217 ="";
                        String P0507 ="";

                        ///////////////////////////
                        P0100=dataSnapshot.child("P0100").getValue().toString();
                        P0217=dataSnapshot.child("P0217").getValue().toString();
                        P0218=dataSnapshot.child("P0218").getValue().toString();
                        P0515=dataSnapshot.child("P0515").getValue().toString();
                        P0802=dataSnapshot.child("P0802").getValue().toString();
                        P2067=dataSnapshot.child("P2067").getValue().toString();
                        P0507=dataSnapshot.child("PO507").getValue().toString();

                        tv2.setText(P0100);
                        tv4.setText(P0217);
                        tv6.setText(P0218);
                        tv8.setText(P0515);
                        tv10.setText(P0802);
                        tv12.setText(P2067);
                        tv14.setText(P0507);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });



            }
        });
    }
}
