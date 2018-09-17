package br.com.ruralfeed.ruralfeed;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, exemploIntentService.class);
        startService(intent);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //bloqueia orientação de tela.

        //**************************

        Intent intentTipoPessoa = new Intent(this, TipoPessoa.class);
        startService(intentTipoPessoa);

        Button btnIncluir = (Button) findViewById(R.id.buttonIncluirRuralFeed);
        btnIncluir.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intentBotao = new Intent(MainActivity.this, CadPessoaActivity.class);
                                              startActivity(intentBotao);
                                          }
                                      }

        );
    }
}
