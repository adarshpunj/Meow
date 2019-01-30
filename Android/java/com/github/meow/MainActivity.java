package com.github.meow;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private AnimalFragmentAdapter animalFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager = findViewById(R.id.pager);
        animalFragmentAdapter = new AnimalFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(animalFragmentAdapter);

    }
}
