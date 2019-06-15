package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btlogin = (Button) findViewById(R.id.btlogin);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tlogin = (TextView) findViewById(R.id.tlogin);
                TextView tsenha = (TextView) findViewById(R.id.tsenha);

                String login = tlogin.getText().toString();
                String senha = tsenha.getText().toString();

                if (login.equals("Josean") && senha.equals("123")){
                    alert ("Login realizado com sucesso");

                    setContentView(R.layout.segundatela); // para chamar a segunda tela




                }else{
                    alert ("Login ou senha incorreto");

                }



            }

        });

    }
        private void alert (String s){

            Toast.makeText( this, s , Toast.LENGTH_LONG).show();

        }


}
