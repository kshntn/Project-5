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
public class AttractionsFragment extends Fragment {

    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag=1;
    private String Owners;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("Red Fort", "Landmark of 17th-century Mughal fortress built in towering red sandstone, now a complex of museums.", R.drawable.redfort, "All days of the week except Monday \n09:30 AM - 04:30 PM","Shah Jahan\nContructed in 1639"));
        DetailsList.add(new Details("Rashtrapati Bhavan", "The official home of the president, located at the Western end of Rajpath in New Delhi. One of the largest residencies of head of state in the world.", R.drawable.rastrapatibhavan,"All weekdays except public Holidays \n09:30 AM - 05:30 PM","Edwin Landseer Lutyens\nConstructed in 1929"));
        DetailsList.add(new Details("India Gate", "It is a war Memorial located astride the Rajpath on the eastern edge of New Delhi, India,  formerly called Kingsway.", R.drawable.indiagate,"All days of the week  \n05:00 AM - 12:00 AM","Edwin Lutyens\nConstructed in 1931"));

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
