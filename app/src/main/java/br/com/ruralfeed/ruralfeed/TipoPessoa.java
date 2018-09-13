package br.com.ruralfeed.ruralfeed;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class TipoPessoa {



    public void TipoPessoa() {
        FirebaseDatabase databaseTipoPessoa = FirebaseDatabase.getInstance();
        final DatabaseReference myRefTipoPessoa = databaseTipoPessoa.getReference("TipoPessoa");
        myRefTipoPessoa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {}
                else {
                    myRefTipoPessoa.push().setValue("RuralFeed");
                    myRefTipoPessoa.push().setValue("Cliente");
                    myRefTipoPessoa.push().setValue("Produtor");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });
    }
}




