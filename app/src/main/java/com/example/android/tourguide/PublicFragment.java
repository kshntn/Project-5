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

    public PublicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("Dilli Haat", "It is a paid entrance open air Food Plaza and craft Bazaar run by Delhi Tourism and Transportation Development Corporation (DTTDC)", R.drawable.dillihaat));

        DetailsList.add(new Details("National Science Centre", "It is a pioneering Institute engaged in the popularization of science among the people of the northern part of India in general and among the students in particular", R.drawable.nationalsciencecenter));
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
                Intent next = new Intent(getActivity(), DescriptionActivity.class);
                next.putExtra("title", Title);
                next.putExtra("desc", Description);
                next.putExtra("1", ImageId);
                next.putExtra("time",Time);
                startActivity(next);
            }
        });
        return rootView;
    }

}
