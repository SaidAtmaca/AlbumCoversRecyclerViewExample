package com.said.albumcoversrecyclerviewexample.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.albumcoversrecyclerviewexample.Model.AlbumRow;
import com.said.albumcoversrecyclerviewexample.R;

import java.util.ArrayList;

public class AlbumRowAdapter extends RecyclerView.Adapter<AlbumRowAdapter.MyViewHolder> { //This is an adapter which we combine dataset recyclerview

    public static ArrayList<AlbumRow> albumRows;

    public AlbumRowAdapter(ArrayList<AlbumRow> albumRows) {

        this.albumRows=albumRows;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bandName.setText(albumRows.get(position).getBandName());
        holder.albumName.setText(albumRows.get(position).getAlbumName());
        holder.albumDate.setText(albumRows.get(position).getAlbumDate());
        holder.albumCover.setImageResource(albumRows.get(position).getAlbumImage());

    }

    @Override
    public int getItemCount() {
        return albumRows.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView bandName, albumName, albumDate;
        ImageView albumCover;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            bandName=itemView.findViewById(R.id.bandName);
            albumName=itemView.findViewById(R.id.albumName);
            albumDate=itemView.findViewById(R.id.albumDate);
            albumCover=itemView.findViewById(R.id.imageView);


        }
    }
}
