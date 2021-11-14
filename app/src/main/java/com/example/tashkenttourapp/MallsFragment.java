package com.example.tashkenttourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class MallsFragment extends Fragment {
    public MallsFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> malls = new ArrayList<Location>();
        malls.add(new Location(R.string.mall_one, R.string.location_mall_one,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_two, R.string.location_mall_two,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_three, R.string.location_mall_three,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_four, R.string.location_mall_four,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_five, R.string.location_mall_five,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_six, R.string.location_mall_six,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_seven, R.string.location_mall_seven,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_eight, R.string.location_mall_eight,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_nine, R.string.location_mall_nine,
                R.drawable.mall_one));
        malls.add(new Location(R.string.mall_ten, R.string.location_mall_ten,
                R.drawable.mall_one));

        LocationAdapter adapter =new LocationAdapter(getActivity(),malls,R.color.malls);
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
