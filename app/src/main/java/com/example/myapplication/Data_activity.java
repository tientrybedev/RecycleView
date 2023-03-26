package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_activity extends AppCompatActivity {
    TextView title,description;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        title =findViewById(R.id.id_txt_title);
        description =findViewById(R.id.id_des);
        image =findViewById(R.id.id_image);

        title.setText(getIntent().getExtras().getString("Title"));
        description.setText(getIntent().getExtras().getString("Des"));
        int my_int_image=getIntent().getIntExtra("image",0);
        image.setImageResource(my_int_image);
    }
}