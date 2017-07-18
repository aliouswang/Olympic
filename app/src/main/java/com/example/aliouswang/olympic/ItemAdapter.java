package com.example.aliouswang.olympic;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by aliouswang on 2017/7/17.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>{

    private static final String [] itemData = {
            "SharedPreference", "Activity启动流程", "AnnotationProcessing" , "Retrofit解析", "Java泛型总结",
            "Android CustomView", "reactive programming", "RxJava项目中的应用实战", "Animation",
            "Okio解析", "Picasso解析"
    };

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(
                LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_main_layout, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.convert(itemData[position], position);
    }

    @Override
    public int getItemCount() {
        return itemData.length;
    }
}
