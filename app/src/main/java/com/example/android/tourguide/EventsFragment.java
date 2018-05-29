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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        ArrayList<Details> DetailsList=new ArrayList<>();
        DetailsList.add(new Details("International food festival","To satiate your gustatory cravings,Indian Grill Room brings forth a month long international food festival",R.drawable.foodfestival));

        DetailsList.add(new Details("International AYUSH Yoga Festival","To promote the essence of brand India by Global participation in Indian music shows Ayurveda and Holistic healing, spiritual Trust of India, yoga and meditation, cultural and folks showcase",R.drawable.yoga));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
