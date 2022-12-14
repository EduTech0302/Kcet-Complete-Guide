package net.edutech.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.core.content.ContextCompat;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        getWindow().setStatusBarColor(ContextCompat.getColor(webview.this,R.color.colorPrimaryDark));

        Toast.makeText(this, "Opening PDF ", Toast.LENGTH_SHORT).show();
        ImageView back=findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        String url = getIntent().getStringExtra("pdf_url");
        WebView webview = findViewById(R.id.web);

        if (webview.canGoForward()) {

        }

        webview.getSettings().setSupportZoom(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setDisplayZoomControls(false);
        webview.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);
        webview.loadUrl("javascript: (function () {document.addEventListener('click', function (e) {e.stopPropagation();}, true);})()");



    }



}