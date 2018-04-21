package com.example.luisanibal.empresazxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button man,woman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        man = (Button)findViewById(R.id.btnHombre);
        woman=(Button)findViewById(R.id.btnMujer);

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent man = new Intent(Principal.this,Hombre.class);
                startActivity(man);
            }
        });

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent woman = new Intent(Principal.this, Mujer.class);
                startActivity(woman);
            }
        });
    }
}
