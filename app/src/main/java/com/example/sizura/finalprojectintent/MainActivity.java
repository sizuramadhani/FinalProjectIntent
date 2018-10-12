package com.example.sizura.finalprojectintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnorder = (Button) findViewById(R.id.btn_order);
        btnorder.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_order:
                Intent MoveIntent = new Intent(MainActivity.this,OrderActivity.class);
                startActivity(MoveIntent);
                break;

        }

    }
}
