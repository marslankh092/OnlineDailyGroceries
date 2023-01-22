package com.rajendra.onlinedailygroceries;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rajendra.onlinedailygroceries.databinding.ActivityProductDetailsBinding;

public class ProductDetails extends AppCompatActivity {

    ActivityProductDetailsBinding pdBinding;
    ImageView img;
    TextView proName, proPrice, proDesc, proQty, proUnit;
    String name, price, desc, qty, unit;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pdBinding = ActivityProductDetailsBinding.inflate(getLayoutInflater());
        setContentView(pdBinding.getRoot());

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", R.drawable.b1);
        price = i.getStringExtra("price");
        desc = i.getStringExtra("desc");
        qty = i.getStringExtra("qty");
        unit = i.getStringExtra("unit");

        proName = findViewById(R.id.productName);
        proDesc = findViewById(R.id.prodDesc);
        proPrice = findViewById(R.id.prodPrice);
        img = findViewById(R.id.big_image);
        proQty = findViewById(R.id.qty);
        proUnit = findViewById(R.id.unit);

        proName.setText(name);
        proPrice.setText(price);
        proDesc.setText(desc);
        proQty.setText(qty);
        proUnit.setText(unit);

        img.setImageResource(image);


        pdBinding.back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProductDetails.this, MainActivity.class));
                finish();

            }
        });

    }
}
