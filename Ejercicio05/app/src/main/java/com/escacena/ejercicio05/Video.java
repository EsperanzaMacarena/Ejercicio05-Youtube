package com.escacena.ejercicio05;

public class Video {
    private String title;
    private String channelImg;
    private String duration;
    private int views;
    private String photoPreview;
    private String channel;

    public Video(String title, String channelImg, String duration, int views, String photoPreview, String channel) {
        this.title = title;
        this.channelImg =channelImg;
        this.duration = duration;
        this.views = views;
        this.photoPreview = photoPreview;
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelImg() {
        return channelImg;
    }

    public void setChannelImg(String channelImg) {
        this.channelImg = channelImg;
}

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getPhotoPreview() {
        return photoPreview;
    }

    public void setPhotoPreview(String photoPreview) {
        this.photoPreview = photoPreview;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", channelImg='" + channelImg + '\'' +
                ", duration='" + duration + '\'' +
                ", views=" + views +
                ", photoPreview='" + photoPreview + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
