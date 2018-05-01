package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dorow.alexander.jokerscreenlib.JokerScreenActivity;

import static com.dorow.alexander.jokerscreenlib.JokerScreenActivity.JOKE_EXTRA;


public class MainActivity extends AppCompatActivity implements EndpointAsyncCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        requestJoke(MainActivity.this);
    }

    public void requestJoke(EndpointAsyncCallback callback) {
        new EndpointAsync(callback).execute();
    }

    @Override
    public void onEnded(String string) {
        Intent intent = new Intent(this, JokerScreenActivity.class);
        intent.putExtra(JOKE_EXTRA, string);
        startActivity(intent);
    }
}
