package com.AESapp.loginregister.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.AESapp.loginregister.R;



public class HomePage extends AppCompatActivity{


    private Button Category;
    private Button Account;
    private Button Track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        Category = (Button) findViewById(R.id.category);
        Account = (Button) findViewById(R.id.account);
        Track = (Button) findViewById(R.id.track);

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(HomePage.this, Category.class);
                startActivity(goToCategory);

            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(HomePage.this, Account.class);
                startActivity(goToAccount);

            }
        });

        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToTrack = new Intent(HomePage.this, Track.class);
                startActivity(goToTrack);

            }
        });
    }
}
