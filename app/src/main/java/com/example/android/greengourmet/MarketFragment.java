package com.example.android.greengourmet;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android.greengourmet.R.drawable.ic_chevron_right_grey_600_24dp;


/**
 * A simple {@link Fragment} subclass.
 */
public class MarketFragment extends Fragment {


    public MarketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.activity_item_list, container, false);
        final ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Yem Yem", "Yaba", R.drawable.ic_chevron_right_grey_600_24dp));
        displayObject.add(new ItemList("Shoprite", "Abule Oja", R.drawable.ic_chevron_right_grey_600_24dp));
        displayObject.add(new ItemList("Justrite", "Bariga", R.drawable.ic_chevron_right_grey_600_24dp));
        displayObject.add(new ItemList("Grocery Bazaar", "Ojuelegba", R.drawable.ic_chevron_right_grey_600_24dp));


        Log.v("Ingredients", "Word at index 0:" + displayObject.get(0));
        Log.v("Ingredients", "Word at index 1:" + displayObject.get(1));
        Log.v("Ingredients", "Word at index 2:" + displayObject.get(2));


        /**
         * This creates a DisplayAdapter object instance and a ListView object
         */


        MarketListAdapter listAdapter = new MarketListAdapter(getActivity(), displayObject);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //ItemList itemLists = displayObject.get(position);

                Toast.makeText(getActivity(), "Test", Toast.LENGTH_SHORT).show();

                String[] itemName = getResources().getStringArray(R.array.Place);
                final String activity = itemName[position];

                Intent intent = new Intent(getActivity(), DirectionActivity.class);
                intent.putExtra("itemName", activity);
                startActivity(intent);
//


            }
        });


        return rootView;
    }

}
