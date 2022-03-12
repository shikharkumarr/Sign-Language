package com.aliferous.signlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView navHome, navbtn2, navAilment, navProfile;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        navHome=findViewById(R.id.nav_home);
        navbtn2=findViewById(R.id.nav_btn2);
        navAilment=findViewById(R.id.nav_btn3);
        navProfile=findViewById(R.id.nav_profile);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                //startActivity(intent);
            }
        });
        navbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SL2EngActivity.class);
                startActivity(intent);
            }
        });
        navAilment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Eng2SLActivity.class);
                startActivity(intent);
            }
        });
        navProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        
    }
}