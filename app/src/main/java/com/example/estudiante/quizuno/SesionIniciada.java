package com.example.estudiante.quizuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SesionIniciada extends AppCompatActivity {

    private Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_iniciada);

        Intent ingresar = getIntent();

        btnCerrar = findViewById(R.id.btn_cerrar);

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent respuesta = new Intent();


                setResult(Constants.RespNewUser,respuesta);
                finish();
            }
        });




    }
}
