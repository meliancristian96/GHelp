package com.example.melia.ghelp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghelp);
    }

    public void start(View view){

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Buna ziua ");
        intent.putExtra(Intent.EXTRA_TEXT,"Ma numesc Melian Alexandru-Cristian,sunt student in anul 3, la ETTI, EA engleza, grupa 2031.");
        //intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
