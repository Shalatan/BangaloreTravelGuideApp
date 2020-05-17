package com.example.travelguideapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsPlacesFragment extends  androidx.fragment.app.Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.orionmallName),getString(R.string.orionmallDetail),R.drawable.orionmall));
        locations.add(new Location(getString(R.string.ubcityName),getString(R.string.ubcityDetail),R.drawable.ubcitymall));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}
