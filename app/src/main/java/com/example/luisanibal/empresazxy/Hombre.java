package com.example.luisanibal.empresazxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Hombre extends AppCompatActivity {
    private EditText cantZapatilla,cantClasico,totalZapatilla,totalClasico,totalPagar;
    private Spinner spinZapatilla,spinClasico;
    private String opc[],opc2[],Zapatilla,Clasico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hombre);

        cantZapatilla = findViewById(R.id.cajaCantidadZapatilla);
        cantClasico = findViewById(R.id.cajaCantidadClasico);
        totalZapatilla = findViewById(R.id.cajaTotalZapatilla);
        totalClasico = findViewById(R.id.cajaTotalClasico);
        totalPagar = findViewById(R.id.CajaTotalPagarH);
        spinZapatilla = findViewById(R.id.spiZapatilla);
        spinClasico = findViewById(R.id.spiClasico);

        opc = this.getResources().getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opc);
        spinZapatilla.setAdapter(adapter);

        opc2 = this.getResources().getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opc);
        spinClasico.setAdapter(adapter2);
    }

    public void Calculos(View v){
        int precio = 0,cant2, total,total2,cant4,full;
        String cant,cant3;
            if(validar()) {
                cant = cantZapatilla.getText().toString();
                cant2 = Integer.parseInt(cant);
                Zapatilla = spinZapatilla.getSelectedItem().toString();

                if (Zapatilla.equalsIgnoreCase("nike")) {
                    precio = 120000;
                }
                    if (Zapatilla.equalsIgnoreCase("adidas")) {
                        precio = 140000;
                    }
                        if (Zapatilla.equalsIgnoreCase("puma")) {
                            precio = 130000;
                        }
                total = cant2 * precio;
                totalZapatilla.setText("$"+total);

                cant3 = cantClasico.getText().toString();
                cant4 = Integer.parseInt(cant3);
                Clasico = spinClasico.getSelectedItem().toString();

                if (Clasico.equalsIgnoreCase("nike")) {
                    precio = 50000;
                }
                if (Clasico.equalsIgnoreCase("adidas")) {
                    precio = 80000;
                }
                if (Clasico.equalsIgnoreCase("puma")) {
                    precio = 100000;
                }
                total2 = cant4 * precio;
                totalClasico.setText("$"+total2);

                full = total + total2;
                totalPagar.setText("$"+full);

            }
    }


    public boolean validar(){
        if (cantZapatilla.getText().toString().isEmpty() ){
            //Toast.makeText(getApplicationContext(), "Digite por favor el nombre" , Toast.LENGTH_SHORT).show();
            cantZapatilla.setError(getResources().getString(R.string.error_1));
            return false;
        }else{
            if(cantClasico.getText().toString().isEmpty() ){
                //Toast.makeText(getApplicationContext(), "Digite por favor el nombre" , Toast.LENGTH_SHORT).show();
                cantClasico.setError(getResources().getString(R.string.error_2));
                return false;
            }
        }
        return true;
    }
}
