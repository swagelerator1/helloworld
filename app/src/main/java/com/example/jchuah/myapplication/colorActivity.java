package com.example.jchuah.myapplication;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class colorActivity extends AppCompatActivity {
    Bundle groceries;

    public void onColorClick(View source) {
        Intent nameAndColorIntent = new Intent(this, NameAndColorActivity.class);
        nameAndColorIntent.putExtra("groceries", groceries);

        Button colorButton = (Button)source;
        ColorDrawable bgColor = (ColorDrawable)source.getBackground();

        groceries.putInt("colorClick", bgColor.getColor());

        startActivity(nameAndColorIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulur);
        groceries = getIntent().getBundleExtra("groceries");
        Log.i("GROCERIES!", groceries.getString("name"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color, menu);
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
}