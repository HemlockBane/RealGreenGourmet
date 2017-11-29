package com.example.android.greengourmet;

import android.app.Activity;
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
 * Created by Polymath on 15/08/2017.
 */

public class MarketListAdapter extends ArrayAdapter<ItemList> {

    public MarketListAdapter(Activity context, ArrayList<ItemList> mItemList) {

        super(context, 0, mItemList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.market_view, parent, false);
        }

        ItemList currentItemList = getItem(position);

        TextView fTextView = (TextView) listItemView.findViewById(R.id.display_market);
        fTextView.setText(currentItemList.getFirstItemName());

        TextView sTextView = (TextView) listItemView.findViewById(R.id.display_market2);
        sTextView.setText(currentItemList.getSecondItemName());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_place_right);
        iconView.setImageResource(currentItemList.getImageResourceId());


        return listItemView;
    }
}
