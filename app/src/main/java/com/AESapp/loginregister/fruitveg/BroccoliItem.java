package com.AESapp.loginregister.fruitveg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.AESapp.loginregister.R;
import com.AESapp.loginregister.activities.HomePage;



public class BroccoliItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private Button Track;
    private Button Category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broccoli_item);

        Home = (Button) findViewById(R.id.home);
        Account = (Button) findViewById(R.id.account);
        Category = (Button) findViewById(R.id.category);
        Track = (Button) findViewById(R.id.track);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(BroccoliItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(BroccoliItem.this, com.AESapp.loginregister.activities.Account.class);
                startActivity(goToAccount);
            }
        });
        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(BroccoliItem.this, com.AESapp.loginregister.activities.Category.class);
                startActivity(goToCategory);
            }
        });
        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTrackPage = new Intent(BroccoliItem.this, com.AESapp.loginregister.activities.Track.class);
                startActivity(goToTrackPage);
            }
        });
    }
}
