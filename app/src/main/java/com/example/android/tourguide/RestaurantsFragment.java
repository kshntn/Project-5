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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        ArrayList<Details> DetailsList=new ArrayList<>();
        DetailsList.add(new Details("The Claridges","Chic Spanish-themed hotel restaurant with alfresco tables and a Southern Europe and Moroccan menu",R.drawable.claridges));

        DetailsList.add(new Details("ITC Maurya","Luxury hotel's Indian restaurant adorned with marble and chandeliers serving handi-cooked fare.",R.drawable.maurya));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
