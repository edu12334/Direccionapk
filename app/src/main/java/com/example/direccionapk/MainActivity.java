package com.example.direccionapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton facebook, instagram, google, pikachu;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook=findViewById(R.id.btnFacebook);
        instagram=findViewById(R.id.btnInstagram);
        google=findViewById(R.id.btnGoogle);
        pikachu=findViewById(R.id.btnPikachu);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent facebook= getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
                    startActivity(facebook);
                }
                catch (Exception e){
                    System.out.println("Error "+e);
                }
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent instagram= getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                    startActivity(instagram);
                }
                catch (Exception e){
                    System.out.println("Error "+e);
                }
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent google= getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                    startActivity(google);
                }
                catch (Exception e){
                    System.out.println("Error "+e);
                }
            }
        });

        pikachu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google=Uri.parse("http://www.google.com");
                Intent intent= new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });


    }
}