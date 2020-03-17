package com.example.animation;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PokemonListAdapter extends ArrayAdapter<Pokemon_info> {

    private static final String TAG = "PokemonListAdapter";
    private Context mContext;
    private int nResource;
    private AnimationDrawable adAnimation;

    public PokemonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Pokemon_info> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.nResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int anim = getItem(position).getAnim();
        String name = getItem(position).getName();
        String type = getItem(position).getType();

        Pokemon_info pokemon = new Pokemon_info(anim, name, type);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(nResource, parent, false);

        ImageView ivAnim = (ImageView) convertView.findViewById(R.id.anim);
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvType = (TextView) convertView.findViewById(R.id.type);

        ivAnim.setBackgroundResource(anim);
        adAnimation = (AnimationDrawable) ivAnim.getBackground();
        adAnimation.start();

        tvName.setText(name);
        tvType.setText(type);

        return convertView;
    }
}
