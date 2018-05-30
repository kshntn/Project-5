package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag=2;
    private String Owners;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList=new ArrayList<>();
        DetailsList.add(new Details("The Claridges","Chic Spanish-themed hotel restaurant with alfresco tables and a Southern Europe and Moroccan menu",R.drawable.claridges,"All Days \n06:00 AM - 11:45 PM","Suresh Nanda\nMaybourne Hotel Group"));

        DetailsList.add(new Details("ITC Maurya","Luxury hotel's Indian restaurant adorned with marble and chandeliers serving handi-cooked fare.",R.drawable.maurya,"Every Day \n12:30 PM - 02:45 PM \n07:00 PM - 11:45 PM","Yogesh Chander Deveshwar\nITC Hotel Group"));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Details pos = DetailsList.get(i);
                Description = pos.getmDescription();
                ImageId = pos.getmImageId();
                Title = pos.getmName();
                Time=pos.getmTime();
                Owners=pos.getmOwners();
                Intent next = new Intent(getActivity(), DescriptionActivity.class);
                next.putExtra("title", Title);
                next.putExtra("desc", Description);
                next.putExtra("1", ImageId);
                next.putExtra("time",Time);
                next.putExtra("flag",flag);
                next.putExtra("Owners",Owners);
                startActivity(next);
            }
        });
        return rootView;
    }

}
