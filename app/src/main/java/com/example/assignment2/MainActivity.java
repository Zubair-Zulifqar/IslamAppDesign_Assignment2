package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button whatsappPakButton = findViewById(R.id.whatsapp_pak_button);
        whatsappPakButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=<phone_number>&text=<message>"));
                startActivity(intent);
            }
        });

        Button whatsappUsaButton = findViewById(R.id.whatsapp_usa_button);
        whatsappUsaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=<phone_number>&text=<message>"));
                startActivity(intent);
            }
        });

        Button goodwordBooksButton = findViewById(R.id.good);
        goodwordBooksButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.goodword.com.pk/"));
                startActivity(intent);
            }
        });

        Button websiteButton = findViewById(R.id.website_button);
        websiteButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://theislam360.com/"));
                startActivity(intent);
            }
        });

    }
}