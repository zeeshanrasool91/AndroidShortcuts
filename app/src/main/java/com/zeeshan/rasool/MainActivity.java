package com.zeeshan.rasool;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
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
            } else if (getIntent().hasExtra("showNotification")) {
                final int showNotification = getIntent().getIntExtra("showNotification", -1);
                if (showNotification != -1) {
                    final NotificationHelper notificationHelper = new NotificationHelper(MainActivity.this);
                    final Handler handler = new Handler();
                    final Runnable r = new Runnable() {
                        @RequiresApi(api = Build.VERSION_CODES.O)
                        public void run() {
                            notificationHelper.createNotification("ZEESHAN", "From Int Extra" + showNotification);
                        }
                    };
                    handler.postDelayed(r, 1500);
                }
            }
        }
    }
}
