package com.example.democourse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] items;

    public CustomAdapter(Context context, String[] items) {
        super(context, R.layout.list_item, items);
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.list_item, null, false);

        TextView textView = row.findViewById(R.id.textView);
        ImageView imageView = row.findViewById(R.id.imageView);

        // Set text and icon for each list item
        textView.setText(items[position]);
        imageView.setImageResource(getIconResource());

        return row;
    }

    // Helper method to get the appropriate icon resource based on position
    private int getIconResource()
    {
        return R.drawable.icon1;
    }
}