package com.example.android.finalnewsfeedapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> newsItems) {
        super(context, 0, newsItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView sectionView = (TextView) listItemView.findViewById(R.id.selection);
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        TextView dateView = listItemView.findViewById(R.id.date);
        sectionView.setText(currentNews.getSection());
        titleView.setText(currentNews.getTitle());
        dateView.setText((currentNews.getDate()));
        return listItemView;
    }
}
