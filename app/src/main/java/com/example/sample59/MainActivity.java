package com.example.sample59;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView)this.findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("www.naver.com");

        Button btn0 = (Button)findViewById(R.id.Button0);
        Button btn1 = (Button)findViewById(R.id.Button1);
        Button btn2 = (Button)findViewById(R.id.Button2);
        Button btn3 = (Button)findViewById(R.id.Button3);
        Button btn4 = (Button)findViewById(R.id.Button4);
        Button btn5 = (Button)findViewById(R.id.Button5);
        Button btn6 = (Button)findViewById(R.id.Button6);

        btn0.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.loadUrl("http://www.chosun.com/");
            }
        });

        btn1.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.loadUrl("http://m.kwnews.co.kr//");
            }
        });

        btn2.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.loadUrl("http://www.donga.com/");
            }
        });

        btn3.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.loadUrl("https://joongang.joins.com/");
            }
        });

        btn4.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.goBack();
            }
        });

        btn5.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.reload();
            }
        });

        btn6.setOnClickListener(new OnClickListener(){
            public void onClick(View v)
            {
                web.goForward();
            }
        });

    }
}
