package com.example.loginscreen_v20;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginscreen_v20.databinding.ActivityLoginSessionBinding;

public class LoginSession extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_session);

        TextView NombreUsuario =(TextView) findViewById(R.id.NombreUsuario);
        TextView Contrasena =(TextView) findViewById(R.id.Contrasena);



        MaterialButton Boton = (MaterialButton) findViewById(R.id.Boton);

        //admin and admin password
        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(NombreUsuario.getText().toString().equals("javier") && Contrasena.getText().toString().equals("1234")){
                    //correcto OwU
                    Toast.makeText(LoginSession.this,"Inicio de sesion EXITOSO!!!!!!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginSession.this,lista.class));
                }else
                    //MUERTE UwU
                    Toast.makeText(LoginSession.this,"Inicio de sesion FALLIDO!!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    }