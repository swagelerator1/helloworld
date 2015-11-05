package com.example.jchuah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NameAndColorActivity extends AppCompatActivity {
    Bundle groceries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_and_color);
        // Start here
        groceries = getIntent().getBundleExtra("groceries"); // get the groceries from the intent #1
        Log.i("GROCERIES!", groceries.getString("name"));    // get the name from groceries and print it #2
        String name = groceries.getString("name");          // get the name and assign it to a variable #2.5
        TextView colorful_name_textview = (TextView)findViewById(R.id.colorful_name); // find the component #3a
        colorful_name_textview.setText(name); // modify the component with the value #3b
        colorful_name_textview.setTextColor(groceries.getInt("colorClick"));
        colorful_name_textview.setTextSize(30);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name_and_color, menu);
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