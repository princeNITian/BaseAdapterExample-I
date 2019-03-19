package com.example.prince.hsamp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] animals;
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext,int[] animals) {
        // Initailize variables
        this.context = applicationContext;
        this.animals = animals;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_gridview,null);
        ImageView icon = (ImageView) convertView.findViewById(R.id.iconSpace);
        icon.setImageResource(animals[position]);
        return convertView;
    }
}
