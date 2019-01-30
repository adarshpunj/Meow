package com.github.meow;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private AnimalFragmentAdapter animalFragmentAdapter;
    private AlphabetFragmentAdapter alphabetFragmentAdapter;
    private NumberFragmentAdapter numberFragmentAdapter;
    private ImageView nav_animal;
    private ImageView nav_alphabet;
    private ImageView nav_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        nav_animal = findViewById(R.id.nav_animal);
        nav_alphabet = findViewById(R.id.nav_alphabet);
        nav_number = findViewById(R.id.nav_number);

        viewPager = findViewById(R.id.pager);
        animalFragmentAdapter = new AnimalFragmentAdapter(getSupportFragmentManager());
        alphabetFragmentAdapter = new AlphabetFragmentAdapter(getSupportFragmentManager());
        numberFragmentAdapter = new NumberFragmentAdapter(getSupportFragmentManager());


        startAnimalFragment();

        nav_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimalFragment();
            }
        });

        nav_alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlphabetFragment();
            }
        });

        nav_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNumberFragment();
            }
        });

    }

    private void startAnimalFragment(){
        nav_animal.setImageResource(R.drawable.nav_animal);
        nav_alphabet.setImageResource(R.drawable.nav_alphabet_off);
        nav_number.setImageResource(R.drawable.nav_number_off);
        viewPager.setAdapter(animalFragmentAdapter);
    }

    private void startAlphabetFragment(){
        nav_alphabet.setImageResource(R.drawable.nav_alphabet);
        nav_animal.setImageResource(R.drawable.nav_animal_off);
        nav_number.setImageResource(R.drawable.nav_number_off);
        viewPager.setAdapter(alphabetFragmentAdapter);
    }

    private void startNumberFragment(){
        nav_number.setImageResource(R.drawable.nav_number);
        nav_animal.setImageResource(R.drawable.nav_animal_off);
        nav_alphabet.setImageResource(R.drawable.nav_alphabet_off);
        viewPager.setAdapter(numberFragmentAdapter);
    }
}
