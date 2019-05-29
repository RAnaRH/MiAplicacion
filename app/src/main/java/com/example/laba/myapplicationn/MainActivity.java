package com.example.laba.myapplicationn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.laba.myapplicationn.modelo.XPath;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<XPath> mylistita = new ArrayList<>();



        XPath mypath1 = new XPath(-72.279675,42.9284704 );
        mylistita.add(mypath1);

        XPath mypath2 = new XPath(-72.2788113,42.927131 );
        mylistita.add(mypath2);

        XPath mypath3 = new XPath(-72.2779584,42.9272056 );
        mylistita.add(mypath3);

        XPath mypath4 = new XPath(-72.2777975,42.928604 );
        mylistita.add(mypath4);

        XPath mypath5 = new XPath(-72.2796589,42.9284351 );
        mylistita.add(mypath5);

        String url="https://www.keene.edu/campus/maps/tool/?coordinates=";

        String ruta="";


        Toast.makeText(this, String.format("Hay %s elementos | %s", mylistita.size(),"Todo va bien"), Toast.LENGTH_SHORT).show();

        int i = 1;

        for (XPath current_object : mylistita){
            ruta += current_object.longitud + "%2C%20" + current_object.latitud;

            if (i < mylistita.size()){
                ruta +="%0A";
            }

            i++;

        }


        Log.v("bichito", url + ruta);

        setContentView(R.layout.activity_main);
    }
}