package br.com.ruralfeed.ruralfeed;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class TipoPessoa {

    public String keyRuralBoy;
    public String keyCliente;
    public String keyProdutor;

    public void TipoPessoa() {
        FirebaseDatabase databaseTipoPessoa = FirebaseDatabase.getInstance();
        final DatabaseReference myRefTipoPessoa = databaseTipoPessoa.getReference("TipoPessoa");

        myRefTipoPessoa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        keyRuralBoy = snapshot.getKey();
                        keyCliente = snapshot.getKey();
                        keyProdutor = snapshot.getKey();
                    }

                } else {
                    myRefTipoPessoa.push().setValue("RuralBoy");
                    myRefTipoPessoa.push().setValue("Cliente");
                    myRefTipoPessoa.push().setValue("Produtor");
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "Failed to read value.", databaseError.toException());
            }


        });


    }

}



