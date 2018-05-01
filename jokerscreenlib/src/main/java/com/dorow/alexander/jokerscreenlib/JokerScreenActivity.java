package com.dorow.alexander.jokerscreenlib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokerScreenActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker_screen);
        if (getIntent() != null) {
            ((TextView) findViewById(R.id.tv_joke)).setText(getIntent().getStringExtra(JOKE_EXTRA));
        }
    }
}
