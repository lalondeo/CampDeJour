package palisson.bdeb.qc.ca.bdebgarde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.security.MessageDigest;
import java.util.Date;
import java.util.ArrayList;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        ((CampDeJour) this.getApplication()).getListeEnfants();
        CampDeJour.init();
      /*  Enfant hugo = new Enfant("Hugo", true, Enfant.Sexe.M, 0, "Foo", true, new Date(101, 4, 21));
        Enfant guillaume = new Enfant("Guillaume", new Date(99, 8, 18));
        Enfant olivier = new Enfant("Olivier", new Date(99, 6, 23));*/
       Enfant boulanger = new Enfant("");
        ArrayList<Enfant> liste = new ArrayList<Enfant>();
       liste.add(boulanger);
        CampDeJour.ajouterParent("2", liste);
        if(CampDeJour.isListeVide()) {
            //CampDeJour.addEnfant(hugo);
            CampDeJour.addEnfant(boulanger);
            //CampDeJour.addEnfant(olivier);
        }
    }


    public void loginParent(View v){
        Intent loginParent = new Intent(this, LoginParent.class);
        startActivity(loginParent);
    }

    public void loginAdmin(View v){
        Intent loginAdmin = new Intent(this, LoginAdmin.class);
        startActivity(loginAdmin);
    }
}
