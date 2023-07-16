package com.app.kwesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class cartActivity extends AppCompatActivity {



    private TextView cart_number, tv_total;
    Button btnCheckOut;
    private RecyclerView recyclerView;
    private dbConnect db = new dbConnect(this);

    private List<Integer> productIds = new ArrayList<>();


    private int totalQuantity;
    private int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.recycleView);

        tv_total = findViewById(R.id.total);
        btnCheckOut = findViewById(R.id.btn_checkout);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(cartActivity.this));








        btnCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the checkout activity and pass the product IDs
                Intent intent = new Intent(cartActivity.this, checkoutActivity.class);
                intent.putIntegerArrayListExtra("productIds", (ArrayList<Integer>) productIds);
                startActivity(intent);
            }
        });




    }


    }

