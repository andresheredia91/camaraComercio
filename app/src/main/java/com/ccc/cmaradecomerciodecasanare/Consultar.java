package com.ccc.cmaradecomerciodecasanare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Types;
import android.os.StrictMode;
import android.widget.QuickContactBadge;

import com.ccc.cmaradecomerciodecasanare.ui.renovacion.RenovacionFragment;

public class Consultar extends AppCompatActivity {
    //private static clsConexionPG con = new clsConexionPG();
    private static clsConexionPG con=new clsConexionPG();
    Button btniniciar;
    private  EditText txtIdentificacion, txtNombres, txtApellidos, txtCeular, txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        txtIdentificacion = (EditText) findViewById(R.id.Identificacion);
        txtNombres = (EditText) findViewById(R.id.LoginNombres);
        txtApellidos = (EditText) findViewById(R.id.LoginApellidos);
        txtCeular = (EditText) findViewById(R.id.LoginCelular);
        txtCorreo = (EditText) findViewById(R.id.LoginCorreo);
        btniniciar=findViewById(R.id.buttonConsultarU);
        //btniniciar.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
            //    Incio_Sesion(txtIdentificacion.getText().toString(),txtNombres.getText().toString(),txtApellidos.getText().toString(),txtCeular.getText().toString(),txtCorreo.getText().toString());
          //  }
        //});

    }
    public  void Incio_Sesion(String identificacion, String nombre, String apellido, String celular, String correo){
        //Toast.makeText(this, usuario, Toast.LENGTH_SHORT).show();
        con.ingreso(String.format("DELETE FROM usuario WHERE nombre='"+nombre+"'"));
        //con.ingreso(String.format("INSERT INTO usuario (identificacion, nombre, apellido,celular,correo) VALUES ('%s', '%s','%s','%s','%s');",identificacion,nombre,apellido,celular,correo));
        Toast.makeText(this, "ELIMINADO", Toast.LENGTH_SHORT).show();
        //String sql1 = "UPDATE usuario SET nombre ='"+clave+"' WHERE identificacion = '"+usuario+"'";
        //if(clave.isEmpty() || usuario.isEmpty()){
          //  Toast.makeText(this, "El campo de identificacion o nombre no puede ser vacio", Toast.LENGTH_SHORT).show();
        //} else{
          //  con.ingreso(sql1);
           // Toast.makeText(this, "GUARDADO CON EXITO", Toast.LENGTH_SHORT).show();
        //}
    }

    public void ConsultarUsuario1(View view)
    {
        Toast.makeText(this, "Debe ingresar el número de identificación", Toast.LENGTH_SHORT).show();
        //try{
            //String storeProcedureCall="{CAL}";
            //con.conexionBD();
          //  Toast.makeText(this, "Debe ingresar el número de identificación", Toast.LENGTH_SHORT).show();
        //}catch (Exception er)
        //{

        //}
    }

    public void ConsultarUsuario (View view){

        SQLite sqLite = new SQLite(this, "usuarios", null, 1);
        SQLiteDatabase BaseDatosCCCBase = sqLite.getWritableDatabase();

        String identificacion = txtIdentificacion.getText().toString();

        if (!identificacion.isEmpty()){

            Cursor fila = BaseDatosCCCBase.rawQuery("select nombres, apellidos, celular, correo from usuarios where identificacion = "+identificacion, null);

            if (fila.moveToNext()){

                txtNombres.setText(fila.getString(0));
                txtApellidos.setText(fila.getString(1));
                txtCeular.setText(fila.getString(2));
                txtCorreo.setText(fila.getString(3));

                BaseDatosCCCBase.close();

            }else{

                Toast.makeText(this, "No existe el usuario", Toast.LENGTH_SHORT).show();
                BaseDatosCCCBase.close();

            }

        }else {

            Toast.makeText(this, "Debe ingresar el número de identificación", Toast.LENGTH_SHORT).show();

        }

    }

    public void Renovar (View view){

        Intent intent = new Intent(this, Renovar.class);
        startActivity(intent);

    }

    public void Atras (View view){

        Intent intent = new Intent(getApplicationContext(), RenovacionFragment.class);
        startActivity(intent);

    }
}

