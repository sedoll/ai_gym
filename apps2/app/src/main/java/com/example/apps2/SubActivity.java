package com.example.apps2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://objective-goldstine-5cf843.netlify.app/"));
                startActivity(myIntent);

            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri. parse("https://terms.naver.com/entry.nhn?docId=938876&cid=51030&categoryId=51030"));
                startActivity(myIntent);
            }
        } );

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri. parse("https://xenodochial-johnson-660100.netlify.app/"));
                startActivity(myIntent);
            }
        } );

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://terms.naver.com/entry.nhn?docId=938886&cid=51030&categoryId=51030"));
                startActivity(myIntent);

            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri. parse("https://practical-wing-3fa1e7.netlify.app/"));
                startActivity(myIntent);
            }
        } );

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri. parse("https://terms.naver.com/entry.nhn?docId=938851&cid=51030&categoryId=51030&expCategoryId=51030"));
                startActivity(myIntent);
            }
        } );
    }
}