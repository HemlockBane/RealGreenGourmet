package com.example.android.greengourmet;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    //Step 1 (Declare variable RC_SIGN_IN)
    private static final int RC_SIGN_IN = 123;

    //Step 2 (Declare Firebase variables)
    private FirebaseDatabase mFirebase;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Step 3 (Initialise Firebase variables)
        mFirebase = FirebaseDatabase.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();


        //Step 4 (Instantiate AuthStateListener )
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {
                    Toast.makeText(MainActivity.this, "Welcome! You're now signed in", Toast.LENGTH_SHORT).show();
                } else {
                    // Here the user is signed out. AuthUI acts now.

                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setLogo(R.drawable.ic_product_icon)
                                    .setIsSmartLockEnabled(false)
                                    .setAvailableProviders(
                                            Arrays.asList(
                                                    new AuthUI.IdpConfig.Builder(AuthUI.PHONE_VERIFICATION_PROVIDER).build(),
                                                    new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
                                                    new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build()
                                            ))
                                    .build(),
                            RC_SIGN_IN);
                }


            }
        };

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(viewPager);

        int[] imageResId = {
                R.drawable.ic_local_dining_teal_600_24dp,
                R.drawable.ic_kitchen_teal_600_24dp,
                R.drawable.ic_local_mall_teal_600_24dp};

        for (int i = 0; i < imageResId.length; i++) {
            tabLayout.getTabAt(i).setIcon(imageResId[i]);
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN)
        {
            if (resultCode == RESULT_OK)
            {
                Toast.makeText(MainActivity.this, "Signed in", Toast.LENGTH_SHORT).show();
            }

            else if(resultCode == RESULT_CANCELED)
            {
                Toast.makeText(MainActivity.this, "Sign in cancelled", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    //Step 4 (Override onPause)
    @Override
    protected void onPause() {
        super.onPause();

        //This comes seventh
        mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
    }

    //Step 5 (Override onResume)
    @Override
    protected void onResume() {
        super.onResume();

        //This comes sixth
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_signout:

                AuthUI.getInstance().signOut(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }
}
