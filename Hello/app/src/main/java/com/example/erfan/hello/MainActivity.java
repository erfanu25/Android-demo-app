package com.example.erfan.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView authorname;
    private TextView about;

    private Button like;
    private TextView msg;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authorname= findViewById(R.id.author);
        authorname.setText("Md. Erfan Ullah Bhuiyan");

        about= findViewById(R.id.about);
        about.setText("Dhaka,Bangladesh");

        like= findViewById(R.id.button);
        msg= findViewById(R.id.textView);


    }

    public void result(View v)
    {
        if(v.getId()== R.id.button)
        {
            count++;
            msg.setText("Liked by "+ count+ " times.");
        }
        else
        {
           Toast.makeText(MainActivity.this,"Login not available",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,page2.class);
            startActivity(intent);
        }

    }

    public void image(View v)
    {
        Intent intent2 = new Intent(this,About.class);
        startActivity(intent2);
    }
}
