package com.ccc.cmaradecomerciodecasanare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Renovar extends AppCompatActivity {

    private EditText txtIdentificacion, txtNombres, txtApellidos, txtCeular, txtCorreo;
    private static clsConexionPG con=new clsConexionPG();
    Button btnActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renovar);

        txtIdentificacion = (EditText) findViewById(R.id.Identificacion);
        txtNombres = (EditText) findViewById(R.id.LoginNombres);
        txtApellidos = (EditText) findViewById(R.id.LoginApellidos);
        txtCeular = (EditText) findViewById(R.id.LoginCelular);
        txtCorreo = (EditText) findViewById(R.id.LoginCorreo);
        btnActualizar=findViewById(R.id.buttonActualizatU);
        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Incio_Sesion(txtIdentificacion.getText().toString(),txtNombres.getText().toString(),txtApellidos.getText().toString(),txtCeular.getText().toString(),txtCorreo.getText().toString());
            }
        });

    }


    public  void Incio_Sesion(String identificacion, String nombre, String apellido, String celular, String correo){
        //Toast.makeText(this, usuario, Toast.LENGTH_SHORT).show();

        //con.ingreso(String.format("INSERT INTO usuario (identificacion, nombre) VALUES ('%s', '%s');",usuario,clave));
        String sql1 = "UPDATE usuario SET nombre ='"+nombre+"', apellido ='"+apellido+"', celular ='"+celular+"', correo = '"+correo+"'  WHERE identificacion = '"+identificacion+"'";
        if(identificacion.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || celular.isEmpty() || correo.isEmpty()){
            Toast.makeText(this, "El campo de identificacion o nombre no puede ser vacio", Toast.LENGTH_SHORT).show();
        } else{
            con.ingreso(sql1);
            Toast.makeText(this, "GUARDADO CON EXITO", Toast.LENGTH_SHORT).show();
        }
    }

    public void Actualizar (View view){

        SQLite sqLite = new SQLite(this, "usuarios", null, 1);
        SQLiteDatabase BaseDatosCCCRenovar = sqLite.getWritableDatabase();

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

            int cantidad = BaseDatosCCCRenovar.update("usuarios", registro, "identificacion = " + identificacion, null);
            BaseDatosCCCRenovar.close();

            if (cantidad == 1){

                Toast.makeText(this, "Usuario modificado correctamente", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, Consultar.class);
                startActivity(intent);

            }else {

                Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show();
            }

        }else {

            Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();

        }

    }

    public void AtrasRe (View view){

        Intent intent = new Intent(this,Consultar.class);
        startActivity(intent);

    }

}