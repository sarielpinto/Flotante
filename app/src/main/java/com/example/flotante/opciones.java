package com.example.flotante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opciones extends AppCompatActivity {
private Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        b1=(Button)findViewById(R.id.presionar);
        b2=(Button)findViewById(R.id.bordes_diseño);
        b3=(Button)findViewById(R.id.animacion);
        b4=(Button)findViewById(R.id.Rotar);
        b5=(Button)findViewById(R.id.Toolbar);
        b6=(Button)findViewById(R.id.action_menu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(opciones.this,MainActivity.class);
                startActivity(i);
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i =new Intent(opciones.this,Bordes.class);
               startActivity(i);
           }
       });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(opciones.this,menu.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(opciones.this,RotarClick.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(opciones.this,menu_des.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(opciones.this, Menu_desplegable.class);
                startActivity(i);
            }
        });
    }

        }

