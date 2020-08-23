package com.test.mosun.loading;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.test.mosun.R;
import com.test.mosun.loading.viewpager_help.Help_1;
import com.test.mosun.loading.viewpager_help.Help_2;
import com.test.mosun.loading.viewpager_help.Help_3;
import com.test.mosun.loading.viewpager_help.Help_4;
import com.test.mosun.loading.viewpager_help.Help_5;

public class HelpActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("##", "helpActivity");

        setContentView(R.layout.activity_help);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_help);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 5;

        Fragment cur_fragment = new Fragment();

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            if (position < 0 || NUM_ITEMS <= position)
                return null;

            switch (position) {
                case 0:
//                cur_fragment = new page_1();
                    cur_fragment = new Help_1();
                    break;
                case 1:
                    cur_fragment = new Help_2();
                    break;
                case 2:
                    cur_fragment = new Help_3();
                    break;
                case 3:
                    cur_fragment = new Help_4();
                    break;
                case 4:
                    cur_fragment = new Help_5();
                    break;
            }
            return cur_fragment;
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }
}
