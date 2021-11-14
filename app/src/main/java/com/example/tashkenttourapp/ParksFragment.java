package com.example.tashkenttourapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class ParksFragment extends Fragment {
    public ParksFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> parks = new ArrayList<Location>();
        parks.add(new Location(R.string.park_one, R.string.location_park_one,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_two, R.string.location_park_two,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_three, R.string.location_park_three,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_four, R.string.location_park_four,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_five, R.string.location_park_five,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_six, R.string.location_park_six,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_seven, R.string.location_park_seven,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_eight, R.string.location_park_eight,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_nine, R.string.location_park_nine,
                R.drawable.park_one));
        parks.add(new Location(R.string.park_ten, R.string.location_park_ten,
                R.drawable.park_one));

        LocationAdapter adapter =new LocationAdapter(getActivity(),parks,R.color.parks);
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
