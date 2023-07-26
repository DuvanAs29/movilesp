package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    Button botonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreUsuario);
        cajaContrasena=findViewById(R.id.contraseñaUsuario);
        botonlogin=findViewById(R.id.botonlogin);

        botonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String contraseñaUsuario=cajaContrasena.getText().toString();

                Intent intent= new Intent(Login.this,Home.class);
                //pasando datos a la nueva actividad
                intent.putExtra("nombre",nombreUsuario);
                startActivity(intent);
            }
        });


    }
}