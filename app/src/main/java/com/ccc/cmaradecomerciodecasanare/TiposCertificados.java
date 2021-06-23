package com.ccc.cmaradecomerciodecasanare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TiposCertificados extends AppCompatActivity {
    //String NOMBRE_DIRECTORIO = "HEREDIA";
    //String NOMBRE_DOCUMENTO = "MiPDF.pdf";
    //EditText etTexto;
    Button btnGenerar;
    private PDFView pdfView;
    private String[]header={"Id","Nombre","Apellido"};
    private String shortText="Hola";
    private String logText="gsgdfhg sjhgdhghdf hghgdfhdf ghhdghdfdgh sdhhggfhf";
    private TemplatePDF templatePDF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_certificados);
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_DENIED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,},
                     1000);
        }
        //btnGenerar=findViewById(R.id.buttonCertificadoExistencia);
        pdfView=(PDFView)findViewById(R.id.pdfView);
        templatePDF=new TemplatePDF(getApplicationContext());
        templatePDF.openDocument();
        templatePDF.addMetaData("clientes", "ventas", "carlos");
        templatePDF.addTitles("Tienda", "Clientes", "2021-06-22");
        templatePDF.addParagraph(shortText);
        templatePDF.addParagraph(logText);
        templatePDF.closeDocument();
    }
    public void pdfView(View view){
    templatePDF.viewPDF();
    }
    //public void crearPDF() {
        //Document documento = new Document();

        //try {
            //File file = crearFichero(NOMBRE_DOCUMENTO);
            //FileOutputStream ficheroPDF = new FileOutputStream(file.getAbsolutePath());

            //PdfWriter writer = PdfWriter.getInstance(documento, ficheroPDF);

            //documento.open();

            //documento.add(new Paragraph("TABLA \n\n"));
          //  documento.add(new Paragraph( "HOLA TODOS \n\n"));


        //} catch(DocumentException e) {
        //} catch(IOException e) {
        //} finally {
        //    documento.close();
      //  }

    //}

    //public File crearFichero(String nombreFichero) {
        //File ruta = getRuta();

        //File fichero = null;
        //if(ruta != null) {
          //  fichero = new File(ruta, nombreFichero);
        //}

      //  return fichero;
    //}

    //public File getRuta() {
        //File ruta = null;

        //if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            //ruta = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), NOMBRE_DIRECTORIO);

            //if(ruta != null) {
                //if(!ruta.mkdirs()) {
                  //  if(!ruta.exists()) {
                //        return null;
              //      }
            //    }
          //  }

        //}
      //  return ruta;
    //}
}