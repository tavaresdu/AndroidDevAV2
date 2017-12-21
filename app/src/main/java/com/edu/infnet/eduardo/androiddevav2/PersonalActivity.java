package com.edu.infnet.eduardo.androiddevav2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Button map_button = findViewById(R.id.buttonAddress);
        map_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TextView addressView = findViewById(R.id.textViewAddressValue);
                TextView cityView = findViewById(R.id.textViewCityValue);
                String address = addressView.getText().toString();
                address += " - " + cityView.getText();
                Intent i = new Intent(PersonalActivity.this, MapsActivity.class);
                i.putExtra("address", address);
                startActivity(i);
            }
        });
    }
}
