package com.ccc.cmaradecomerciodecasanare;

import android.os.StrictMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class clsConexionPG {
    Connection conexion=null;

    //Creamos nuestra funcion para Conectarnos a Postgresql
    public Connection conexionBD(){
        try{
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://10.0.2.2:5432/prueba_camara", "postgres", "root");
            //conexion = DriverManager.getConnection("jdbc:postgresql://192.168.0.15:5432/madan_tumbes", "postgres", "admin");
        }catch (Exception er){
            System.err.println("Error Conexion"+ er.toString());
        }
        return  conexion;
    }
    public void ingreso(String script)
    {
        PreparedStatement p = null;
        conexionBD();
        try{
            p = conexion.prepareStatement(script);
            p.executeUpdate();
        }catch(Exception er)
        {
            System.err.println("Error Conexion"+ er.toString());
        }
    }
    public ResultSet dato()
    {
        Statement codigoSQL = null;
        ResultSet rs = null;

        try{
            conexionBD();
            Statement st = conexion.createStatement();
            // La consulta es un String con código SQL
            String sql1 = "SELECT * FROM usuario";

            // Ejecuta una consulta que devuelve resultados
            rs = st.executeQuery(sql1);
            while (rs.next()) {
                System.out.println (rs.getInt ("usuario") + " " + rs.getString ("identificacion")+ " " + rs.getString("nombre"));
            }
        }catch(Exception er)
        {
            System.err.println("Error Conexion"+ er.toString());
        }
        return rs;
    }

    public int datos(String script)
    {
        Statement codigoSQL = null;
        ResultSet resultados = null;
        int numeroColumna=0;

        try{
            conexionBD();
            codigoSQL = conexion.createStatement();
            resultados = codigoSQL.executeQuery(script);
            ResultSetMetaData datos = resultados.getMetaData();
            numeroColumna = datos.getColumnCount();
            for (int i = 1; i<= numeroColumna; i++){
                //t.addColu
            }
        }catch(Exception er)
        {
            System.err.println("Error Conexion"+ er.toString());
        }
        return numeroColumna;
    }

    //Creamos la funcion para Cerrar la Conexion
    protected  void cerrar_conexion(Connection con)throws  Exception{
        con.close();
    }
}






