package com.example.android.greengourmet;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class DirectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

//
//        ArrayList<DirectionParameter> coordinate = new ArrayList<>();
//        coordinate.add(new DirectionParameter("google.navigation:q=6.514590, 3.386431&mode=b","google.navigation:q=6.514590, 3.386431&mode=w","google.navigation:q=6.514590, 3.386431&mode=d"));
//        DirectionParameter coord = coordinate.get()

        ImageView bIcon = (ImageView) findViewById(R.id.bike_icon);
        bIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri gmmIntentUri = Uri.parse("google.navigation:q=6.514590, 3.386431&mode=b");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);


                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        ImageView wIcon = (ImageView) findViewById(R.id.walk_icon);
        wIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("google.navigation:q=6.514590, 3.386431&mode=w");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);


                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });


        ImageView dIcon = (ImageView) findViewById(R.id.drive_icon);
        dIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("google.navigation:q=6.514590, 3.386431&mode=d");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);


                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });
    }




}
