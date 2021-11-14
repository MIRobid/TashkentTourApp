package com.example.tashkenttourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> hotels = new ArrayList<Location>();
        hotels.add(new Location(R.string.hotel_one, R.string.location_hotel_one,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_two, R.string.location_hotel_two,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_three, R.string.location_hotel_three,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_four, R.string.location_hotel_four,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_five, R.string.location_hotel_five,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_six, R.string.location_hotel_six,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_seven, R.string.location_hotel_seven,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_eight, R.string.location_hotel_eight,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_nine, R.string.location_hotel_nine,
                R.drawable.hotel_one));
        hotels.add(new Location(R.string.hotel_ten, R.string.location_hotel_ten,
                R.drawable.hotel_one));

        LocationAdapter adapter =new LocationAdapter(getActivity(),hotels,R.color.hotels);
        ListView listView =(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        /*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Location location =parks.get(position);
            }
        });
         */

        return rootView;
    }
}
