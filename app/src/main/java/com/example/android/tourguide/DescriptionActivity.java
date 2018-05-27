package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
private int ImageID;
private String Description;
private TextView Text;
private ImageView image;
private String Title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Description=getIntent().getStringExtra("desc");
        Title=getIntent().getStringExtra("title");
        ImageID=getIntent().getIntExtra("1",0);
        setTitle(Title);
        image=findViewById(R.id.headImage);
        image.setImageResource(ImageID);

        Text=findViewById(R.id.heading);
        Text.setText(Description);
    }
}
