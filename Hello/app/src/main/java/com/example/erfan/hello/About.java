package com.example.erfan.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class About extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        image= findViewById(R.id.image);
    }

    public void greet(View v)
    {
        Toast.makeText(this, "Thanks for visiting", Toast.LENGTH_SHORT).show();
    }

    public void site(View a)
    {
        Intent newsite = new Intent(this,Site.class);
        startActivity(newsite);
    }
}
