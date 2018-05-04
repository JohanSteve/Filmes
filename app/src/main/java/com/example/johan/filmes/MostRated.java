package com.example.johan.filmes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.PublicKey;

public class MostRated extends Fragment {

//Constructor default
    public MostRated(){};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
      View mostRated = inflater.inflate(R.layout.most_rated,container,false);

      return mostRated;
    }
}
