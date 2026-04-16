package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p7_vmg;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Librerias.DatosDTO;

public class MostrarActivity extends AppCompatActivity {

    TextView lblnombre, lbledad, lblcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        lblnombre = findViewById(R.id.lblnombre);
        lbledad = findViewById(R.id.lbledad);
        lblcorreo = findViewById(R.id.lblcorreo);

        DatosDTO datosDTO = getIntent().getParcelableExtra("datos");
        lblnombre.setText(datosDTO.getNombre());
        lbledad.setText(String.valueOf(datosDTO.getEdad()));
        lblcorreo.setText(datosDTO.getCorreo());
    }
}