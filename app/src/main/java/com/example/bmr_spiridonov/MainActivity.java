package com.example.bmr_spiridonov;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton man,woman;
    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        man =(ImageButton) findViewById(R.id.Man);
        woman =(ImageButton) findViewById(R.id.WoMan);
        go = (Button) findViewById(R.id.Go);
    }
    public void Who(View v)
    { switch ( v.getId()) {
        case R.id.Man:
            man.setBackgroundColor(Color.GREEN);
        case R.id.WoMan:
            woman.setBackgroundColor(Color.GRAY);
        }
    }
    public void Who1(View v)
    { switch ( v.getId()) {
        case R.id.WoMan:
            woman.setBackgroundColor(Color.GREEN);
        case R.id.Man:
            man.setBackgroundColor(Color.GRAY);
    }
    }
    public void Start(View v)
    { switch ( v.getId()) {
        case R.id.Go:

    }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

}