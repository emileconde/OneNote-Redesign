package com.example.android.conde.com.onenoteredesign.views;

import android.os.Bundle;
import android.view.Menu;

import com.example.android.conde.com.onenoteredesign.Adapter.ViewPagerAdapter;
import com.example.android.conde.com.onenoteredesign.R;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import static androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;
import static com.example.android.conde.com.onenoteredesign.util.Constants.NOTE_BOOK_FRAGMENT_TITLE;
import static com.example.android.conde.com.onenoteredesign.util.Constants.STICKY_NOTE_FRAGMENT_TITLE;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(NOTE_BOOK_FRAGMENT_TITLE);

        initViewPager();
        getCurrentTab();

    }

    private void getCurrentTab() {
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if(position > -1){
                    if(position == 0){
                        getSupportActionBar().setTitle(NOTE_BOOK_FRAGMENT_TITLE);
                    }else {
                        getSupportActionBar().setTitle(STICKY_NOTE_FRAGMENT_TITLE);
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initViewPager(){
        ViewPagerAdapter viewPagerAdapter =
                new ViewPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.addFragment(new NotebookFragment(), NOTE_BOOK_FRAGMENT_TITLE);
        viewPagerAdapter.addFragment(new StickyNoteFragment(), STICKY_NOTE_FRAGMENT_TITLE);
        mViewPager.setAdapter(viewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
