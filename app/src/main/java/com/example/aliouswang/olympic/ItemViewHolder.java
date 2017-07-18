package com.example.aliouswang.olympic;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.aliouswang.android_base.SharedPreferenceActivity;

/**
 * Created by aliouswang on 2017/7/17.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder{

    private static final int [] itemColor = {
            android.R.color.holo_blue_bright,
            android.R.color.holo_green_dark,
            android.R.color.holo_red_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_purple
    };

    private static final Class [] classArray = {
            SharedPreferenceActivity.class
    };

    public ItemViewHolder(View itemView) {
        super(itemView);
    }

    public void convert(String name, final int position) {
        TextView tvName = (TextView) itemView.findViewById(R.id.tv_name);
        tvName.setText(name);
        itemView.setBackgroundColor(ContextCompat.getColor(itemView.getContext(),
                itemColor[position % itemColor.length]));
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigator.navigate(itemView.getContext(),
                        classArray[position]);
            }
        });
    }
}
