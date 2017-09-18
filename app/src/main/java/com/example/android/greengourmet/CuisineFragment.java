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

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CuisineFragment extends Fragment {


    public CuisineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.activity_item_list, container, false);

        ArrayList<ItemList> displayObject = new ArrayList<>();


        displayObject.add(new ItemList("Eba", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Curry", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Cinnamon", R.drawable.ic_face_teal_500_24dp));
        displayObject.add(new ItemList("Locust Beans", R.drawable.ic_face_teal_500_24dp));


        Log.v("Ingredients", "Word at index 0:" + displayObject.get(0));
        Log.v("Ingredients", "Word at index 1:" + displayObject.get(1));
        Log.v("Ingredients", "Word at index 2:" + displayObject.get(2));


//        }
        /**
         * This creates a DisplayAdapter object instance and a ListView object
         */


        ItemListAdapter listAdapter = new ItemListAdapter(getActivity(), displayObject);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), MarketsActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

    }
}
