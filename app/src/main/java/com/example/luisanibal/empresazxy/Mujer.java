package com.example.luisanibal.empresazxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Mujer extends AppCompatActivity {
    private EditText cantZapatilla,cantClasico;
    private Spinner spinZapatilla,spinClasico;
    private String opc[],opc2[],Zapatilla,Clasico;
    private TextView totalZapatilla,totalClasico,totalPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mujer);
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
        int cant2,cant4;
        String cant,cant3;
        double TZapatillas,TClasicos,TotalCompra;

        if(validar()) {
            cant = cantZapatilla.getText().toString();
            cant2 = Integer.parseInt(cant);
            Zapatilla = spinZapatilla.getSelectedItem().toString();

            TZapatillas=Metodos.ZapatillaMujer(Zapatilla,cant2);
            totalZapatilla.setText(getResources().getString(R.string.valorapagarzapatilla)+" $"+TZapatillas);

            cant3 = cantClasico.getText().toString();
            cant4 = Integer.parseInt(cant3);
            Clasico = spinClasico.getSelectedItem().toString();

            TClasicos = Metodos.ClasicoMujer(Clasico,cant4);
            totalClasico.setText(getResources().getString(R.string.valorapagarclasico)+" $"+TClasicos);

            TotalCompra = TZapatillas + TClasicos;
            totalPagar.setText(getResources().getString(R.string.valorapagartotal)+" $"+TotalCompra);
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