package com.pma212102375.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button _tampilkanButton;
    private EditText _urlEditText;
    private WebView _webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _tampilkanButton = (Button)findViewById(R.id.tampilkanButton);
        _urlEditText = (EditText)findViewById(R.id.urlEditText);
        _webview1 = (WebView)findViewById(R.id.WebView);
    }

    public void tampilkanButton_onCLick(View view) {
        String url = _urlEditText.getText().toString();
        _webview1.setWebViewClient(new WebViewClient());
        _webview1.loadUrl(url);
    }
}