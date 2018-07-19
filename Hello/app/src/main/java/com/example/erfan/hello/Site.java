package com.example.erfan.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Site extends AppCompatActivity {

    private WebView mysite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        mysite = findViewById(R.id.siteid);

        WebSettings setting = mysite.getSettings();
        setting.setJavaScriptEnabled(true);

        mysite.setWebViewClient(new WebViewClient());
        mysite.loadUrl("http://erfanu.net16.net/");

    }

    @Override
    public void onBackPressed() {

        if(mysite.canGoBack())
        {
            mysite.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}
