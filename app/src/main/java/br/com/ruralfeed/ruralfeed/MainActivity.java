package br.com.ruralfeed.ruralfeed;


import android.app.IntentService;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public class ProdutosAssincronos extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            // Método que busca produtos assíncronamente.

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // Método que envia os produtos encontrados para a main thread.

        }
    }
//https://medium.com/android-dev-br/trabalhando-com-tarefas-em-background-3d4da889ddfa
    public class TarefaAssincronaIntentService extends IntentService {

        public TarefaAssincronaIntentService() {
            super("name");
        }

        @Override
        protected void onHandleIntent(Intent intent) {
            // Dentro desse método será implementada a execução da tárefa.
        }
    }

}
