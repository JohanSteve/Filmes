package com.example.johan.filmes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MostViewed extends Fragment {

    //Constructor default
    public MostViewed(){};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mostViewed = inflater.inflate(R.layout.most_viewed,container,false);

        return mostViewed;
    }
}
