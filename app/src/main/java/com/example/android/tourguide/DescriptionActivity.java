package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

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
    private String Address;
    private TextView TextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Description = getIntent().getStringExtra(getString(R.string.desc));
        Title = getIntent().getStringExtra(getString(R.string.title));
        ImageID = getIntent().getIntExtra("1", 0);
        Time = getIntent().getStringExtra(getString(R.string.time));
        flag = getIntent().getIntExtra(getString(R.string.flag), 0);
        Owners = getIntent().getStringExtra(getString(R.string.Owners));
        Address = getIntent().getStringExtra(getString(R.string.Address));
        setTitle(Title);
        image = findViewById(R.id.headImage);
        image.setImageResource(ImageID);
        TextOwners = findViewById(R.id.Owners);
        if (flag == 1) {
            TextOwners.setText(getString(R.string.built) + Owners);
        } else if (flag == 2) {
            TextOwners.setText(getString(R.string.Owner) + Owners);
        }
        TextAddress = findViewById(R.id.address);
        TextAddress.setText(getString(R.string.addressdisplay) + Address);
        TextDesc = findViewById(R.id.heading);
        TextDesc.setText(Description);


        TextTime = findViewById(R.id.timing);
        TextTime.setText(getString(R.string.opening) + Time);

    }
}
