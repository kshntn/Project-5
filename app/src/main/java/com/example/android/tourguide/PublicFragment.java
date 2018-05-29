package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PublicFragment extends Fragment {


    public PublicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("Dilli Haat", "It is a paid entrance open air Food Plaza and craft Bazaar run by Delhi Tourism and Transportation Development Corporation (DTTDC)", R.drawable.dillihaat));

        DetailsList.add(new Details("National Science Centre", "It is a pioneering Institute engaged in the popularization of science among the people of the northern part of India in general and among the students in particular", R.drawable.nationalsciencecenter));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
