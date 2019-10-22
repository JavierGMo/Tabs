package com.morajavier.desliza.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.morajavier.desliza.OpcionsFragment;
import com.morajavier.desliza.OpciontFragment;
import com.morajavier.desliza.OpcionuFragment;
import com.morajavier.desliza.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        switch (position) {
            case 0:
                OpcionuFragment opUno = new OpcionuFragment();
                return opUno;
            case 1:
                OpcionsFragment opDos = new OpcionsFragment();
                return opDos;
            case 2:
                OpciontFragment opTres = new OpciontFragment();
                return opTres;
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //return mContext.getResources().getString(TAB_TITLES[position]);
        String section = null;

        switch (position) {
            case 0:
                section = "Opcion 1";
                break;
            case 1:
                section = "Opcion 2";
                break;
            case 2:
                section = "Opcion 3";
                break;
        }
        return section;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}