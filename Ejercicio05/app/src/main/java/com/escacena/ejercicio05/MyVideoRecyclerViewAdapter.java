package com.escacena.ejercicio05;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


public class MyVideoRecyclerViewAdapter extends RecyclerView.Adapter<MyVideoRecyclerViewAdapter.ViewHolder> {

    private final List<Video> videos;
    private Context context;
    private int layout;

    public MyVideoRecyclerViewAdapter(Context context, int layout, List<Video> videos) {
        this.videos = videos;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_video, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = videos.get(position);

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;

        public Video mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;

        }

        @Override
        public String toString() {
            return super.toString() + " '"  + "'";
        }
    }
}
