package com.ccc.cmaradecomerciodecasanare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ccc.cmaradecomerciodecasanare.ui.renovacion.RenovacionFragment;


public class Registrar extends AppCompatActivity {

    private  EditText txtIdentificacion, txtNombres, txtApellidos, txtCeular, txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        txtIdentificacion = (EditText) findViewById(R.id.Identificacion);
        txtNombres = (EditText) findViewById(R.id.LoginNombres);
        txtApellidos = (EditText) findViewById(R.id.LoginApellidos);
        txtCeular = (EditText) findViewById(R.id.LoginCelular);
        txtCorreo = (EditText) findViewById(R.id.LoginCorreo);

    }

    public  void Registrar (View view){

        SQLite sqLite = new SQLite(this, "usuarios", null, 1);
        SQLiteDatabase BaseDatosCCC = sqLite.getWritableDatabase();

        String identificacion = txtIdentificacion.getText().toString();
        String nombres = txtNombres.getText().toString();
        String apellidos = txtApellidos.getText().toString();
        String celular = txtCeular.getText().toString();
        String correo = txtCorreo.getText().toString();

        if (!identificacion.isEmpty() && !nombres.isEmpty() && !apellidos.isEmpty() && !celular.isEmpty() && !correo.isEmpty()){

            ContentValues registro = new ContentValues();

            registro.put("identificacion", identificacion);
            registro.put("nombres", nombres);
            registro.put("apellidos", apellidos);
            registro.put("celular", celular);
            registro.put("correo", correo);

            BaseDatosCCC.insert("usuarios", null, registro);
            BaseDatosCCC.close();
            txtIdentificacion.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            txtCeular.setText("");
            txtCorreo.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, Consultar.class);
            startActivity(intent);

        }else {

            Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();

        }

    }

    public void AtrasReg (View view){

        Intent intent = new Intent(getApplicationContext(),RenovacionFragment.class);
        startActivity(intent);

    }


}