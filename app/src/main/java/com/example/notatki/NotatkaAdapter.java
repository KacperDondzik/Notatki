package com.example.notatki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NotatkaAdapter extends ArrayAdapter<Notatka> {
    public NotatkaAdapter(Context context, List<Notatka> notatki) {
        super(context, 0, notatki);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Notatka notatka = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_notatka, parent, false);
        }
        TextView tvTytul = convertView.findViewById(R.id.tvTytulItem);
        TextView tvTresc = convertView.findViewById(R.id.tvTrescItem);

        if (notatka != null) {
            tvTytul.setText(notatka.getTytul());
            tvTresc.setText(notatka.getTresc());
        }
        return convertView;
    }
}
