package mx.edu.tesoem.isc.tsdmh.tsdmh_p1p7_vmg;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Librerias.DatosDTO;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
    }

    public void  ClickEnviar(View v){
        DatosDTO datosDTO = new DatosDTO();
        datosDTO.setNombre(txtnombre.getText().toString());
        datosDTO.setEdad(Integer.parseInt(txtedad.getText().toString()));
        datosDTO.setCorreo(txtcorreo.getText().toString());

        Intent intent = new Intent(this, MostrarActivity.class);
        intent.putExtra("datos", datosDTO);
        startActivity(intent);
    }
}