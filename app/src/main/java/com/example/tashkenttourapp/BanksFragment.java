package com.example.tashkenttourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class BanksFragment extends Fragment {
    public BanksFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> banks = new ArrayList<Location>();
        banks.add(new Location(R.string.bank_one, R.string.location_bank_one,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_two, R.string.location_bank_two,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_three, R.string.location_bank_three,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_four, R.string.location_bank_four,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_five, R.string.location_bank_five,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_six, R.string.location_bank_six,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_seven, R.string.location_bank_seven,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_eight, R.string.location_bank_eight,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_nine, R.string.location_bank_nine,
                R.drawable.bank_one));
        banks.add(new Location(R.string.bank_ten, R.string.location_bank_ten,
                R.drawable.bank_one));

        LocationAdapter adapter =new LocationAdapter(getActivity(),banks,R.color.banks);
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
