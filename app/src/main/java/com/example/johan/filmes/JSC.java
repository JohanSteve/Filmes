package com.example.johan.filmes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JSC extends Fragment {

    //Constructor default
    public JSC(){};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View jsc = inflater.inflate(R.layout.jsc,container,false);

        return jsc;
    }
}
