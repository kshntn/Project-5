package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Activity context,ArrayList<Details> DetailsList){
        super(context,0,DetailsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.details_item, parent, false);
        }
        Details current=getItem(position);
        TextView Name=ListItemView.findViewById(R.id.name);
        Name.setText(current.getmName());
        TextView Time=ListItemView.findViewById(R.id.time);
        Time.setText(current.getmTime());
        ImageView pic=ListItemView.findViewById(R.id.photo);
        pic.setImageResource(current.getmImageId());
        return ListItemView;
    }
}
