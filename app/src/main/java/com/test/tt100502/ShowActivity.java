package com.test.tt100502;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent it = getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str);

    }
}
