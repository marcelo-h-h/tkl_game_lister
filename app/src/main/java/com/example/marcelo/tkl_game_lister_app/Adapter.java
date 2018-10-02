package com.example.marcelo.tkl_game_lister_app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private ArrayList<Games> games;

    public Adapter(ArrayList<Games> games){
        this.games = games;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.tv_name.setText(games.get(position).getName());
        holder.tv_trailer.setText(games.get(position).getTrailer());
        holder.tv_release_date.setText(games.get(position).getRelease_date());
    }

    @Override
    public int getItemCount(){
        return games.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_release_date;
        private TextView tv_trailer;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.tv_name);
            tv_release_date = itemView.findViewById(R.id.tv_release_date);
            tv_trailer = itemView.findViewById(R.id.tv_trailer);

        }
    }
}
