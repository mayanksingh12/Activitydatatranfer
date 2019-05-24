package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String Title;
    private int Release_date;
    private String Songs;

    // Default Constructor .
    public Movie() {
    }

    // Parameterised Constructor .

    public Movie(String title, int release_date, String songs) {
        Title = title;
        Release_date = release_date;
        Songs = songs;
    }

    // This method read every data and set it in the parcel .

    protected Movie(Parcel in) {
        Title = in.readString();
        Release_date = in.readInt();
        Songs = in.readString();
    }

    // This method binds every data and create an object .

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    // It returns the hashcode of the object .

    @Override
    public int describeContents() {
        return 0;
    }

// This method writes every data and save it in the parcel .

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Title);
        dest.writeInt(Release_date);
        dest.writeString(Songs);
    }


// Converts all the data into String .
    public String print() {
        return "Movie{" +
                "Title='" + Title + '\'' +
                ", Release_date=" + Release_date +
                ", Songs='" + Songs + '\'' +
                '}';
    }
}
