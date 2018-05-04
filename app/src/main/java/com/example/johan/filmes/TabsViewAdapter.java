package com.example.johan.filmes;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;


public class TabsViewAdapter extends FragmentPagerAdapter {

    private List<android.support.v4.app.Fragment>PagesFragment = new ArrayList<>();
    private List<String>PagesTittle = new ArrayList<>();






    public TabsViewAdapter(android.support.v4.app.FragmentManager manager){
        super(manager);}

        public void AddFragmentPage(android.support.v4.app.Fragment Frag, String Tittle){
        PagesTittle.add(Tittle);
        PagesFragment.add(Frag);

        }



    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return PagesFragment.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }


    @Override
    public int getCount() {
        return 3;
    }
}

