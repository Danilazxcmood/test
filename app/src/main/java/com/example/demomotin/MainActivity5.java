package com.example.demomotin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    Button button8;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {
        this.view = view;
        if (view.getId() == R.id.button8) {
            Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
            MainActivity5.this.startActivity(intent);
        }
    }
}
