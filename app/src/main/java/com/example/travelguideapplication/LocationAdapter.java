package com.example.travelguideapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context,0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Location currenntLocation = getItem(position);
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_textView);
        locationNameTextView.setText(currenntLocation.getmLocationName());

        TextView locationDetailTextView = (TextView) listItemView.findViewById(R.id.location_detail_textView);
        locationDetailTextView.setText(currenntLocation.getmLocationDetail());

        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_imageView);
        if (currenntLocation.hasImage()) {
            locationImageView.setImageResource(currenntLocation.getmImageResourceId());
            locationImageView.setVisibility(View.VISIBLE);
        } else {
            locationImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}