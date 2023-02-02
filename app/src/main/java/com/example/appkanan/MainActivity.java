package com.example.appkanan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.nio.file.Path;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    boolean estson1 = false, estson2 = false, estson3 = false, estson4 = false, estson5 = false, estoff6 = false;

    CardView card1, card2, card3, card4, card5, card6;

    FirebaseDatabase database = FirebaseDatabase.getInstance();



    DatabaseReference reference_entrada1 = database.getReference("BOTONSON1");
    DatabaseReference reference_entrada2 = database.getReference("BOTONSON2");
    DatabaseReference reference_entrada3 = database.getReference("BOTONSON3");
    DatabaseReference reference_entrada4 = database.getReference("BOTONSON4");
    DatabaseReference reference_entrada5 = database.getReference("BOTONSON5");
    DatabaseReference reference_entrada6 = database.getReference("BOTONOFF6");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);




        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<Object, Object> info = new HashMap<>();
                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estson1 = !estson1;
                estson2 = false;
                estson3 = false;
                estson4 = false;
                estson5 = false;
                estoff6 = false;
                info2.put("valor", estson2);
                info3.put("valor", estson3);
                info4.put("valor", estson4);
                info5.put("valor", estson5);
                info6.put("valor", estoff6);
                reference_entrada2.setValue(info2);
                reference_entrada3.setValue(info3);
                reference_entrada4.setValue(info4);
                reference_entrada5.setValue(info5);
                reference_entrada6.setValue(info6);
                info.put("valor", estson1);
                reference_entrada1.setValue(info);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HashMap<Object, Object> info = new HashMap<>();
                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estson2 = !estson2;
                estson1 = false;
                estson3 = false;
                estson4 = false;
                estson5 = false;
                estoff6 = false;
                info2.put("valor", estson1);
                info3.put("valor", estson3);
                info4.put("valor", estson4);
                info5.put("valor", estson5);
                info6.put("valor", estoff6);
                reference_entrada1.setValue(info2);
                reference_entrada3.setValue(info3);
                reference_entrada4.setValue(info4);
                reference_entrada5.setValue(info5);
                reference_entrada6.setValue(info6);

                info.put("valor", estson2);
                reference_entrada2.setValue(info);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<Object, Object> info = new HashMap<>();
                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estson3 = !estson3;
                estson1 = false;
                estson2 = false;
                estson4 = false;
                estson5 = false;
                estoff6 = false;
                info2.put("valor", estson1);
                info3.put("valor", estson2);
                info4.put("valor", estson4);
                info5.put("valor", estson5);
                info6.put("valor", estoff6);
                reference_entrada1.setValue(info2);
                reference_entrada2.setValue(info3);
                reference_entrada4.setValue(info4);
                reference_entrada5.setValue(info5);
                reference_entrada6.setValue(info6);


                info.put("valor", estson3);
                reference_entrada3.setValue(info);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<Object, Object> info = new HashMap<>();
                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estson4 = !estson4;
                estson1 = false;
                estson2 = false;
                estson3 = false;
                estson5 = false;
                estoff6 = false;
                info2.put("valor", estson1);
                info3.put("valor", estson2);
                info4.put("valor", estson3);
                info5.put("valor", estson5);
                info6.put("valor", estoff6);
                reference_entrada1.setValue(info2);
                reference_entrada2.setValue(info3);
                reference_entrada3.setValue(info4);
                reference_entrada5.setValue(info5);
                reference_entrada6.setValue(info6);
                info.put("valor", estson4);
                reference_entrada4.setValue(info);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<Object, Object> info = new HashMap<>();

                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estson5 = !estson5;
                estson1 = false;
                estson2 = false;
                estson3 = false;
                estson4 = false;
                estoff6 = false;
                info2.put("valor", estson1);
                info3.put("valor", estson2);
                info4.put("valor", estson3);
                info5.put("valor", estson4);
                info6.put("valor", estoff6);
                reference_entrada1.setValue(info2);
                reference_entrada2.setValue(info3);
                reference_entrada3.setValue(info4);
                reference_entrada4.setValue(info5);
                reference_entrada6.setValue(info6);

                info.put("valor", estson5);
                reference_entrada5.setValue(info);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<Object, Object> info = new HashMap<>();

                HashMap<Object, Object> info2 = new HashMap<>();
                HashMap<Object, Object> info3 = new HashMap<>();
                HashMap<Object, Object> info4 = new HashMap<>();
                HashMap<Object, Object> info5 = new HashMap<>();
                HashMap<Object, Object> info6 = new HashMap<>();
                estoff6 = !estoff6;
                estson1 = false;
                estson2 = false;
                estson3 = false;
                estson4 = false;
                estson5 = false;
                info2.put("valor", estson1);
                info3.put("valor", estson2);
                info4.put("valor", estson3);
                info5.put("valor", estson4);
                info6.put("valor", estson5);
                reference_entrada1.setValue(info2);
                reference_entrada2.setValue(info3);
                reference_entrada3.setValue(info4);
                reference_entrada4.setValue(info5);
                reference_entrada5.setValue(info6);
                info.put("valor", estoff6);
                reference_entrada6.setValue(info);
            }
        });


    }



}