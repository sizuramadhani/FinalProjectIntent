package com.example.sizura.finalprojectintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    public static String EXTRA_NAMA = "extra_username";
    public static String EXTRA_ADDRESS = "extra_alamat";
    public static String EXTRA_ORDER = "extra_order";

    private EditText edtUsername,edtAddress,edtOrder;

    private Button btnorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        btnorder = (Button) findViewById(R.id.btn_order);
        btnorder.setOnClickListener(this);

        edtUsername = (EditText) findViewById(R.id.edt_nama);
        edtAddress = (EditText) findViewById(R.id.edt_alamat);
        edtOrder = (EditText) findViewById(R.id.edt_pesanan);
    }
    public void order (View view ){

        Intent intent = new Intent(this,OrderActivity.class);

        EditText edtNama = (EditText) findViewById(R.id.edt_nama);
        EditText edtAlamat = (EditText) findViewById(R.id.edt_alamat);
        EditText edtOrder = (EditText) findViewById(R.id.edt_pesanan);

        String msgNama = edtNama.getText().toString();
        intent.putExtra(EXTRA_NAMA,msgNama);

        String msgAlamat = edtAlamat.getText().toString();
        intent.putExtra(EXTRA_ADDRESS,msgAlamat);

        String msgOrder = edtOrder.getText().toString();
        intent.putExtra(EXTRA_ORDER,msgOrder);

        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_order:
                Intent btnPesan = new Intent(getApplicationContext(),OrderActivity.class);

                btnPesan.putExtra("extra_nama",edtUsername.getText().toString());
                btnPesan.putExtra("extra_alamat",edtAddress.getText().toString());
                btnPesan.putExtra("extra_order",edtOrder.getText().toString());

                startActivity(btnPesan);
                break;
        }

        }
    }

