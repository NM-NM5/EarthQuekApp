package com.example.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Quake> {
    public QuakeAdapter(@NonNull Context context, ArrayList<Quake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Quake currentQuake = getItem(position);

        TextView mag = listItemView.findViewById(R.id.magnitude_text);
        TextView name = listItemView.findViewById(R.id.name_text);
        TextView date = listItemView.findViewById(R.id.date_text);

        assert currentQuake != null;
        mag.setText(currentQuake.getMag());
        name.setText(currentQuake.getName());
        date.setText(currentQuake.getDate());

        return listItemView;
    }

}
