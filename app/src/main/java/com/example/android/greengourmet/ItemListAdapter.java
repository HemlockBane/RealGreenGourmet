package com.example.android.greengourmet;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Polymath on 01/07/2017.
 */

public class ItemListAdapter extends ArrayAdapter<ItemList> {
    private static final String LOG_TAG = ItemListAdapter.class.getSimpleName();


    public ItemListAdapter(Activity context, ArrayList<ItemList> mItemList) {

        super(context, 0, mItemList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, parent, false);
        }

        ItemList currentItemList = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.display_one);
        nameTextView.setText(currentItemList.getFirstItemName());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_view);
        iconView.setImageResource(currentItemList.getImageResourceId());


        return listItemView;
    }
}
