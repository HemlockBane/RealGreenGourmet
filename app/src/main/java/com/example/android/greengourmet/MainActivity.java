package com.example.android.greengourmet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.android.greengourmet.R.id.cuisine;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cuisine = (Button) findViewById(R.id.cuisine);

        cuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cuisineIntent = new Intent(MainActivity.this, CuisineActivity.class);

                startActivity(cuisineIntent);
            }
        });


        Button ingredients = (Button) findViewById(R.id.ingredient);

        ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ingredientIntent = new Intent(MainActivity.this, IngredientsActivity.class);

                 startActivity(ingredientIntent);
            }
        });

        Button market = (Button) findViewById(R.id.market);

        market.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent marketIntent = new Intent (MainActivity.this, MarketActivity.class);

                startActivity(marketIntent);
            }
        });






//        Button maps = (Button) findViewById(R.id.maps);
//
//        market.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("geo:47.6, -122.3"));
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }
//            }
//        });


        Switch maps = (Switch) findViewById(R.id.switch1);
        maps.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("google.streetview:cbll=29.9774614,31.1329645&cbp=0,30,0,0,-15"));

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
            }
        });
    }
}
