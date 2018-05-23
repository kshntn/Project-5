package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
int ImageID;
String Description;
TextView Text;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Description=getIntent().getStringExtra("desc");
        ImageID=getIntent().getIntExtra("1",0);

        image=findViewById(R.id.headImage);
        image.setImageResource(ImageID);

        Text=findViewById(R.id.heading);
        Text.setText(Description);
    }
}
