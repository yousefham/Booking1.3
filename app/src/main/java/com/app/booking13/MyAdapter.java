package com.app.booking13;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by best tech on 8/16/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Countries> countries;


    public interface OnItemClickListener {

        void onItemClick(Countries item);

    }

    private final OnItemClickListener listener;


    public MyAdapter(Context context, List<Countries> countries, OnItemClickListener listener) {
        this.context = context;
        this.countries = countries;
        this.listener = listener;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list, parent, false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Countries countrie = countries.get(position);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        if(countrie != null){
            ((MyViewHolder)holder).TvcountryName.setText(countrie.getCountryName());
            ((MyViewHolder)holder).TvcountryContent.setText(countrie.getCountryContent());
        }

    }


    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(countries.get(position), listener);


    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView TvcountryName;
        TextView TvcountryContent;

        public MyViewHolder(View itemView) {
            super(itemView);
            TvcountryName = (TextView) itemView.findViewById(R.id.TvCuntry);
            TvcountryContent = (TextView) itemView.findViewById(R.id.Tvcunt);

        }

        public void bind(final Countries country, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

        }
    }


}

