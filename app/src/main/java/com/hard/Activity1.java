package com.hard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    private TextView textView;

    private static final class Id {
        private static final int itemId1 = 1;
        private static final int itemId2 = 2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        textView = findViewById(R.id.textView1);

        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        switch (view.getId()) {
            case R.id.textView1:
                menu.add(0, Id.itemId1, 0, "Item1");
                menu.add(0, Id.itemId2, 0, "Item2");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case Id.itemId1:
                String str1 = getString(R.string.action_item1);

                Toast toast1 = Toast.makeText(Activity1.this, str1, Toast.LENGTH_SHORT);
                toast1.show();
                break;
            case Id.itemId2:
                String str2 = getString(R.string.action_item2);

                Toast toast2 = Toast.makeText(Activity1.this, str2, Toast.LENGTH_SHORT);
                toast2.show();
                break;
        }

        return super.onContextItemSelected(item);
    }
}
