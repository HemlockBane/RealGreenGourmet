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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent marketIntent = new Intent(MainActivity.this, MarketActivity.class);

                startActivity(marketIntent);
            }
        });


    }
}
