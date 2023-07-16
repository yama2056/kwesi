package com.app.kwesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Date;

public class ProductActivity extends AppCompatActivity {

    private EditText title,productname,contentdescription,enquiry,price;

    ArrayAdapter<String> arrayAdapter;
    dbConnect db =new dbConnect(this);
    private int categoryId;
    private Button btn_add;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        title=findViewById(R.id.title);
        contentdescription=findViewById(R.id.contentdescription);
        productname=findViewById(R.id.productname);
        enquiry=findViewById(R.id.enquiry);
        price=findViewById(R.id.price);
        btn_add=findViewById(R.id.btn_add);


        btn_add.setOnClickListener(View ->{
            String gettitle=title.getText().toString().trim();
            String getcontentDescription=contentdescription.getText().toString().trim();
            String getenquiry=enquiry.getText().toString().trim();
            String getproductname=productname.getText().toString().trim();

            String getpriceString= price.getText().toString().trim();
            Double getprice=0.00;
            if (!TextUtils.isEmpty(getpriceString)){
                try{
                    getprice=Double.valueOf(getpriceString);

                    }catch (NumberFormatException e){
                        e.printStackTrace();
                        Toast.makeText(this, "Price Ivalid", Toast.LENGTH_SHORT).show();
                        return;
                    }

                }
            if (!TextUtils.isEmpty(gettitle) && !TextUtils.isEmpty(getcontentDescription) && getprice > 0) {
                Productname product  = new Productname(gettitle,getenquiry,getcontentDescription, getprice, categoryId, new Date());
                db.addproductname(product);

                Intent intent = new Intent(ProductActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Empty Fields", Toast.LENGTH_SHORT).show();
            }


        });


    }
}