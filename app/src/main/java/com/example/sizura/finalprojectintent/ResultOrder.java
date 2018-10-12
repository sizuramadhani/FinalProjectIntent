package com.example.sizura.finalprojectintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultOrder extends AppCompatActivity implements View.OnClickListener {

    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_order);

        btnCancel = (Button) findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(this);

        Intent intent = getIntent();

        String msgNama = intent.getStringExtra(OrderActivity.EXTRA_NAMA);
        TextView txtNama = (TextView) findViewById(R.id.txt_nama);
        txtNama.setText(msgNama);

        String msgAlamat = intent.getStringExtra(OrderActivity.EXTRA_ADDRESS);
        TextView txtAlamat = (TextView) findViewById(R.id.txt_alamat);
        txtAlamat.setText(msgAlamat);

        String msgOrder = intent.getStringExtra(OrderActivity.EXTRA_ORDER);
        TextView txtOrder = (TextView) findViewById(R.id.txt_order);
        txtOrder.setText(msgOrder);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_cancel:
                Intent btnCancel = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(btnCancel);
                break;
        }
    }
}
