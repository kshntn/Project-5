package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DescriptionActivity extends AppCompatActivity {
    private int ImageID;
    private String Description;
    private TextView TextDesc;
    private ImageView image;
    private String Title;
    private String Time;
    private TextView TextTime;
    private int flag;
    private String Owners;
    private TextView TextOwners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Description = getIntent().getStringExtra("desc");
        Title = getIntent().getStringExtra("title");
        ImageID = getIntent().getIntExtra("1", 0);
        Time = getIntent().getStringExtra("time");
        flag = getIntent().getIntExtra("flag", 0);
        Owners = getIntent().getStringExtra("Owners");
        setTitle(Title);
        image = findViewById(R.id.headImage);
        image.setImageResource(ImageID);
        TextOwners=findViewById(R.id.Owners);
        if(flag==1){
            TextOwners.setText("Built by: "+Owners);
        }else if(flag==2){
            TextOwners.setText("Owner: "+Owners);
        }

        TextDesc = findViewById(R.id.heading);
        TextDesc.setText(Description);

        TextTime = findViewById(R.id.timing);
        TextTime.setText("Opening time: " + Time);
    }
}
