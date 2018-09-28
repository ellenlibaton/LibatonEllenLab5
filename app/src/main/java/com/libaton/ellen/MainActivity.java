package com.libaton.ellen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void onClick (View v){

        Intent i = null, chooser = null;
        if(v.getId() == R.id.button){
            i = new Intent( MainActivity.this, Main2Activity.class);
            MainActivity.this.startActivity(i);
        }
        else if(v.getId() == R.id.button2){
            Uri g = Uri.parse("geo:14.583615, 120.982255");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Choose map application");
            startActivity(chooser);
        }


    }


}
