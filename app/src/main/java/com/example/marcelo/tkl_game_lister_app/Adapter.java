package com.example.marcelo.tkl_game_lister_app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

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

        @BindView(R.id.tv_name) TextView tv_name;
        @BindView(R.id.tv_release_date) TextView tv_release_date;
        @BindView(R.id.tv_trailer) TextView tv_trailer;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
