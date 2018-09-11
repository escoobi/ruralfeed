package br.com.ruralfeed.ruralfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tora();
    }

    public void tora (){
        String pneu = "oo";
        pneu = pneu + " rr";
    }
}
