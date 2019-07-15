package com.maak.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        webView = (WebView) findViewById(R.id.webView);

        //WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://andela.com/alc/");


        webView.getSettings().setJavaScriptEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {

            super.onBackPressed();
        }
    }

}
