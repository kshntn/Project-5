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
public class EventsFragment extends Fragment {
    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private String Address;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details("International Food Festival", "To satiate your gustatory cravings,Indian Grill Room brings forth a month long international food festival", R.drawable.foodfestival, "Every Year\n17-18 February", "Jawaharlal Nehru Stadium, Pragati Vihar, New Delhi, Delhi 110003, India"));

        DetailsList.add(new Details("International AYUSH Yoga Festival", "To promote the essence of brand India by Global participation in Indian music shows Ayurveda and Holistic healing, spiritual Trust of India, yoga and meditation, cultural and folks showcase", R.drawable.yoga, "Every Year\n20-24 June", "India Gate, Rajpath Marg, India Gate, New Delhi, Delhi 110001, India"));
        DetailsAdapter itemsAdapter = new DetailsAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
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
                next.putExtra(getString(R.string.Address), Address);
                startActivity(next);
            }
        });
        return rootView;
    }

}
