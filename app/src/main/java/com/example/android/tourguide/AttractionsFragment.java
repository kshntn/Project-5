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
    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList=new ArrayList<>();
        DetailsList.add(new Details("Red Fort","Landmark 17th-century Mughal fortress built in towering red sandstone, now a complex of museums.",R.drawable.redfort));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Details pos=DetailsList.get(i);
                Description=pos.getmDescription();
                ImageId=pos.getmImageId();
                Intent next =new Intent(getActivity(),DescriptionActivity.class);
                next.putExtra("desc", Description);
                next.putExtra("1", ImageId);
                startActivity(next);
            }
        });



        return rootView;
    }

}
