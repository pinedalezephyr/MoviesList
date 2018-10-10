package com.example.android.movieslist;

public class Movie {
    // Store the id of the  movie actor
    private String mActor;
    // Store the name of the movie
    private String mName;
    // Store the release date of the movie
    private String mRelease;

    // Constructor that is used to create an instance of the Movie object
    public Movie(String mActor, String mName, String mRelease) {
        this.mActor = mActor;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public String getmActor() {
        return mActor;
    }

    public void setmActor(String mActor) { this.mActor = mActor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }
}

