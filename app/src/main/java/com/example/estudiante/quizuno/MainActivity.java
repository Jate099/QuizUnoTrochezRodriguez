package com.example.estudiante.quizuno;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private EditText etUsuario;
    private EditText etContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btn_ingresar);
        etUsuario = findViewById(R.id.et_user);
        etContraseña = findViewById(R.id.et_contraseña);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String comUsuario= "Administrador";
                String comContraseña= "123456";

                String usuario = etUsuario.getText().toString();
                String contraseña = etContraseña.getText().toString();

                    if (usuario.equals(comUsuario) && contraseña.equals(comContraseña)) {

                        Intent ingresar = new Intent(getApplicationContext(), SesionIniciada.class);
                        startActivityForResult(ingresar, Constants.ReqNewUser);
                    }else{
                        Toast.makeText(MainActivity.this,"El usuario o la contraseña no es correcta", Toast.LENGTH_SHORT).show();
                    }
                    




            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
