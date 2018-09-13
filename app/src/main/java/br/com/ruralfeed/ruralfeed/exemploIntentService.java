package br.com.ruralfeed.ruralfeed;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class exemploIntentService extends IntentService {
    public static String keyPessoa = null;

    public exemploIntentService() {
        super("Caraio....");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {



        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("Pessoas");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if( dataSnapshot.exists()){
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        keyPessoa = snapshot.getKey();
                    }
                    Map<String, Object> pessoaUpdates = new HashMap<>();
                    pessoaUpdates.put(keyPessoa + "/email", "dev@ruralfeed.com.br");
                    pessoaUpdates.put(keyPessoa + "/nome", "Gustavo O. Cardozo");
                    pessoaUpdates.put(keyPessoa + "/senha", "12334");
                    myRef.updateChildren(pessoaUpdates);

                }
                else {
                    Pessoa  pessoa = new Pessoa("Gustavo", "gustavo@ruralfeed.com", "123");
                    myRef.push().setValue(pessoa);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


    }



}
