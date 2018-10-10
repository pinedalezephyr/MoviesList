package com.example.android.movieslist;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

            private ListView listView;
            private MovieAdapter mAdapter;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                listView = (ListView) findViewById(R.id.movies_list);
                ArrayList<com.example.android.movieslist.Movie> moviesList = new ArrayList<>();
                moviesList.add(new com.example.android.movieslist.Movie("James Dean","After Earth","2013") {
                });
                moviesList.add(new com.example.android.movieslist.Movie("Bubba", "Baby Driver" , "2017"));
                moviesList.add(new com.example.android.movieslist.Movie("Zombie", "Deadpool" , "2016"));
                moviesList.add(new com.example.android.movieslist.Movie("lost", "Divergent" , "2014"));
                moviesList.add(new com.example.android.movieslist.Movie("beat up", "Fight Club" , "1999"));
                moviesList.add(new com.example.android.movieslist.Movie("ouch", "Jaws" , "1975"));
                moviesList.add(new com.example.android.movieslist.Movie("Long Johe", "Pirates of the Caribbean" , "2011"));
                moviesList.add(new com.example.android.movieslist.Movie("Yoda", "Star Wars" , "2016"));
                moviesList.add(new com.example.android.movieslist.Movie("Black","The Grey","2011"));

                listView.setAdapter(mAdapter);

            }
        }



