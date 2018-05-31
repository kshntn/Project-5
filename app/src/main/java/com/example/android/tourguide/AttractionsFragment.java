package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag = 1;
    private String Owners;
    private String Address;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Details> DetailsList = new ArrayList<>();
        DetailsList.add(new Details(getString(R.string.RedFort), getString(R.string.redFortDesc), R.drawable.redfort, getString(R.string.RedFortTiming), getString(R.string.RedfortOwner), getString(R.string.RedFortAddress)));
        DetailsList.add(new Details(getString(R.string.rashtrapatiBhavan), getString(R.string.RastrapatiBhavanDesc), R.drawable.rastrapatibhavan, getString(R.string.RastrapatiTiming), getString(R.string.RastrapatiBhavanOwner), getString(R.string.RashtrapatiAddress)));
        DetailsList.add(new Details(getString(R.string.IndiaGate), getString(R.string.IndiaGateDesc), R.drawable.indiagate, getString(R.string.IndiaGateTiming), getString(R.string.IndiaGateOwner), getString(R.string.IndiaGateAddress)));

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
                Owners = pos.getmOwners();
                Address = pos.getmAddress();
                Intent next = new Intent(getActivity(), DescriptionActivity.class);
                next.putExtra(getString(R.string.title), Title);
                next.putExtra(getString(R.string.desc), Description);
                next.putExtra("1", ImageId);
                next.putExtra(getString(R.string.time), Time);
                next.putExtra(getString(R.string.flag), flag);
                next.putExtra(getString(R.string.Owners), Owners);
                next.putExtra(getString(R.string.Address), Address);
                startActivity(next);
            }
        });


        return rootView;
    }

}
