package com.zeeshan.rasool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getExtras() != null) {
            if (getIntent().hasExtra("toDo")) {
                boolean toDo = getIntent().getBooleanExtra("toDo", false);
                if (toDo) {
                    Toast.makeText(MainActivity.this, "From Boolean Extra" + toDo, Toast.LENGTH_SHORT).show();
                }
            } else if (getIntent().hasExtra("name")) {
                String name = getIntent().getStringExtra("name");
                if (!TextUtils.isEmpty(name)) {
                    Toast.makeText(MainActivity.this, "From String Extra" + name, Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
}
