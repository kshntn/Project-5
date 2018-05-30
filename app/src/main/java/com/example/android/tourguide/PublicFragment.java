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
public class PublicFragment extends Fragment {
    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag = 4;
    private String Address;

    public PublicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("Dilli Haat", "Paid entrance open air Food Plaza and craft Bazaar run by Delhi Tourism and Transportation Development Corporation (DTTDC)", R.drawable.dillihaat, "All days of the week  \n10:30 AM - 12:00 AM", "Lal Sai Marg, Virendra Nagar, Near Bharathi College, Janakpuri, Block C, Janakpuri, New Delhi, Delhi 110058, India"));

        DetailsList.add(new Details("National Science Centre", "Pioneering Institute engaged in the popularization of science among the people of the northern part of India in general and among the students in particular", R.drawable.nationalsciencecenter, "All days of the week  \n10:00 AM - 05:30 AM", "Near Gate No.1, Bhairon Road, Pragati Maidan, New Delhi, Delhi 110001, India"));
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
                Time = pos.getmTime();
                Address = pos.getmAddress();
                Intent next = new Intent(getActivity(), DescriptionActivity.class);
                next.putExtra(getString(R.string.title), Title);
                next.putExtra(getString(R.string.desc), Description);
                next.putExtra("1", ImageId);
                next.putExtra(getString(R.string.time), Time);
                next.putExtra(getString(R.string.flag), flag);
                next.putExtra(getString(R.string.Address), Address);
                startActivity(next);
            }
        });
        return rootView;
    }

}
