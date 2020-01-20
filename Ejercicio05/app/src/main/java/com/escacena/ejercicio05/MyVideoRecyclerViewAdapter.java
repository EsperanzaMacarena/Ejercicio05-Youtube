package com.escacena.ejercicio05;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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
        holder.channel.setText(holder.mItem.getChannel());
        holder.duration.setText(holder.mItem.getDuration());
        holder.title.setText(holder.mItem.getTitle());
        holder.views.setText(String.valueOf(holder.mItem.getViews()));

        Glide
                .with(context)
                .load(holder.mItem.getPhotoPreview())
                .centerCrop()
                .into(holder.imgVideoPreview);

        Glide
                .with(context)
                .load(holder.mItem.getChannelImg())
                .centerCrop()
                .into(holder.imgAuthor);

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public ImageView imgVideoPreview, imgAuthor;
        public Video mItem;
        public TextView views, title, channel, duration;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            this.imgVideoPreview = view.findViewById(R.id.videoImagePreview);
            this.imgAuthor = view.findViewById(R.id.videoAuthor);
            this.views = view.findViewById(R.id.videoViews);
            this.title = view.findViewById(R.id.videoTitle);
            this.channel =view.findViewById(R.id.videoChannel);
            this.duration = view.findViewById(R.id.videoDuration);
        }

        @Override
        public String toString() {
            return "ViewHolder{" +
                    "mView=" + mView +
                    ", imgVideoPreview=" + imgVideoPreview +
                    ", imgAuthor=" + imgAuthor +
                    ", mItem=" + mItem +
                    ", views=" + views +
                    ", title=" + title +
                    ", channel=" + channel +
                    ", duration=" + duration +
                    '}';
        }
    }
}
