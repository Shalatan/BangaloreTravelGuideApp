package com.example.travelguideapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NearbyPlacesFragment extends  androidx.fragment.app.Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.nandihillsName),getString(R.string.nandihillsDetail),R.drawable.nandihills));
        locations.add(new Location(getString(R.string.chunchiName),getString(R.string.chunchiDetail),R.drawable.chunchifalls));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}
