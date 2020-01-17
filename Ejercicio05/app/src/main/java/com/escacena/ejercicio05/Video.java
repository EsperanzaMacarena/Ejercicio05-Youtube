package com.escacena.ejercicio05;

public class Video {
    private String title;
    private String author;
    private String duration;
    private int views;
    private String photoPreview;

    public Video(String title, String author, String duration, int views, String photoPreview) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.views = views;
        this.photoPreview = photoPreview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                ", views=" + views +
                ", photoPreview='" + photoPreview + '\'' +
                '}';
    }
}
