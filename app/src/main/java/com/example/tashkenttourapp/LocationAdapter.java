package com.example.tashkenttourapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorBackgroundId;

    public LocationAdapter(Context context, ArrayList<Location> location, int colorBackgroundId){
        super(context, 0,location);
        mColorBackgroundId=colorBackgroundId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView =convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation =getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentLocation.getTitleId());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddressId());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if(currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textBackground =listItemView.findViewById(R.id.text_background);
        int color = ContextCompat.getColor(getContext(),mColorBackgroundId);
        textBackground.setBackgroundColor(color);
        return listItemView;
    }

}
