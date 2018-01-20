package com.hard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = super.getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity1, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_item1:
                String str1 = getString(R.string.action_item1);

                Toast toast1 = Toast.makeText(Activity1.this, str1, Toast.LENGTH_SHORT);
                toast1.show();
                break;
            case R.id.action_item2:
                String str2 = getString(R.string.action_item2);

                Toast toast2 = Toast.makeText(Activity1.this, str2, Toast.LENGTH_SHORT);
                toast2.show();
                break;
            case R.id.action_item3:
                String str3 = getString(R.string.action_item3);

                Toast toast3 = Toast.makeText(Activity1.this, str3, Toast.LENGTH_SHORT);
                toast3.show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
