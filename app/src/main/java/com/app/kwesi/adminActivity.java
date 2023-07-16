package com.app.kwesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class adminActivity extends AppCompatActivity {
    private TextView categories, order, product, users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        product = findViewById(R.id.product);
        order = findViewById(R.id.order);
        categories = findViewById(R.id.categories);
        users = findViewById(R.id.users);

        product.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProductActivity.class);
            startActivity(intent);
        });
        order.setOnClickListener(view -> {
            Intent intent = new Intent(this, orderActivity.class);
            startActivity(intent);

        });
        categories.setOnClickListener(view -> {
            Intent intent = new Intent(this, categoriesActivity.class);
            startActivity(intent);

        });
        users.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}