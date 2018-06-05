package serpis.ed.calculaarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText anchuraField, alturaField, radioField;
    TextView resultTextView;
    Spinner spinner;

    Double anchuray = 0.0;
    Double alturay = 0.0;
    Double radioy = 0.0;

    Double resultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anchuraField = (EditText) findViewById(R.id.anchuraField);
        alturaField = (EditText) findViewById(R.id.alturaField);
        radioField = (EditText) findViewById(R.id.radioField);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        spinner = (Spinner) findViewById(R.id.spinner);


        /****           Bloque para elementos del spinner           ***/

        List<String> formas = new ArrayList<String>();
        formas.add("Selecciona la figura !");
        formas.add("Círculo");
        formas.add("Cuadrado");
        formas.add("Rectángulo");
        formas.add("Esfera");
        formas.add("Cubo");

        /*****           Creando adaptador para el Spinner       *****/

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, formas );

        /****              Creando estilo menú desplegable          *****/

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        /***                Vinculando datos del Adaptador al spinner        ****/

        spinner.setAdapter(dataAdapter);


        /****               Eventos Click en elementos selecciones del spinner            ****/
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedItem = adapterView.getItemAtPosition(i).toString();

                /****       Recogiendo valores de los campos        *****/

                anchuray = Double.parseDouble(anchuraField.getText().toString());
                alturay = Double.parseDouble(alturaField.getText().toString());
                radioy = Double.parseDouble(radioField.getText().toString());


                /****       Añadiendo eventos Click para cada elemento del spinner      ***/

                if (selectedItem.equals("Selecciona la figura !")) {

                    Toast.makeText(MainActivity.this, "Selecciona cualquier figura", Toast.LENGTH_SHORT).show();
                }
                else if (selectedItem.equals("Círculo")) {
                    resultado = 3.14 * radioy * radioy;
                    resultTextView.setText("El área es: " + resultado);
                }
                else if (selectedItem.equals("Cuadrado")) {
                    resultado = anchuray*alturay;
                    resultTextView.setText("El área es: " + resultado);
                }
                else if (selectedItem.equals("Rectángulo")){
                    resultado = anchuray*alturay;
                    resultTextView.setText("El área es: " + resultado);
                }
                else if (selectedItem.equals("Esfera")){
                    resultado = (4/3)* 3.14 * radioy*radioy*radioy;
                    resultTextView.setText("El área es: " +resultado);
                }
                else if (selectedItem.equals("Cubo")){
                    resultado = anchuray*alturay*anchuray;
                    resultTextView.setText("El área es: " +resultado);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
