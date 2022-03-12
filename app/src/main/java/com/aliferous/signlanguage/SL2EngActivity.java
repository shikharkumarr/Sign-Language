package com.aliferous.signlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class SL2EngActivity extends AppCompatActivity {

    FrameLayout sl2engBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sl2eng);

        sl2engBTN = findViewById(R.id.sl2engBTN);

        sl2engBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SL2EngActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}