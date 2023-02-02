package com.example.appkanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ResgistroMainActivity extends AppCompatActivity {

    Button btnRegistro;
    EditText nombre, correo, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistro_main);

        nombre=findViewById(R.id.nombre);
        correo=findViewById(R.id.correo);
        contraseña=findViewById(R.id.contraseña);
    }
}