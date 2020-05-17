package com.example.travelguideapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class FamousPlacesFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.bangalorePalaceName),getString(R.string.bangalorePalaceDetail),R.drawable.banglorepalace));
        locations.add(new Location(getString(R.string.mgroadName),getString(R.string.mgroadDetail),R.drawable.mgroad));
        locations.add(new Location(getString(R.string.templeName),getString(R.string.templeDetail),R.drawable.iskcontemple));
        locations.add(new Location(getString(R.string.filmcityName),getString(R.string.filmcityDetail),R.drawable.innovativefilmcity));
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}
