package com.example.zemoso.sadhnacard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mNarottamaButton;

    private Button mSyamanandaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSyamanandaButton = findViewById(R.id.start_syamananda_button);

        mSyamanandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SavedCardActivity.class);
                startActivity(intent);
            }
        });

        mNarottamaButton = findViewById(R.id.start_narottama_button);

        mNarottamaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NarottamActivity.class);
                startActivity(intent);
            }
        });
    }
}
