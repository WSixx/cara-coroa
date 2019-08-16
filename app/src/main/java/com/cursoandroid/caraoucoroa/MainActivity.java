package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.btnJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gerar numero Aleatório
                Random random = new Random();
                int numeroAleatorio = random.nextInt(2); //0(cara),1(coroa)


                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao",opcao[numeroAleatorio]);
                startActivity(intent);
            }
        });


    }
}
