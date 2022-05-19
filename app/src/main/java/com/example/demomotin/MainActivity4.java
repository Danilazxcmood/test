package com.example.demomotin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    
    Button button5;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {
        this.view = view;
        if (view.getId() == R.id.button5) {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            MainActivity4.this.startActivity(intent);
        }
    }
}