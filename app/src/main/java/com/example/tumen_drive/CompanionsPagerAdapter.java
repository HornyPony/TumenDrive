package com.example.tumen_drive;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CompanionsPagerAdapter extends FragmentStatePagerAdapter {
    private int tabAmount;

    public CompanionsPagerAdapter(@NonNull FragmentManager fm, int tabAmount) {
        super(fm);
        this.tabAmount = tabAmount;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SearchCompanionFragment();
            case 1:
                return new ExpectedRidesFragment();
            case 2:
                return new CompanionsRequestsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabAmount;
    }
}

