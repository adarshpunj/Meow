package com.github.meow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class NumberFragmentAdapter extends FragmentStatePagerAdapter {
    private Object object;

    public NumberFragmentAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ObjectFragment objectFragment = new ObjectFragment();

        Bundle bundle = new Bundle();

        switch (position){
            case 0:
                object = new Object("zero",R.drawable.zero,R.raw.zero);
                break;
            case 1:
                object = new Object("one",R.drawable.one,R.raw.one);
                break;
            case 2:
                object = new Object("two",R.drawable.two,R.raw.two);
                break;
            case 3:
                object = new Object("three",R.drawable.three,R.raw.three);
                break;
            case 4:
                object = new Object("four",R.drawable.four,R.raw.four);
                break;
            case 5:
                object = new Object("five",R.drawable.five,R.raw.five);
                break;
            case 6:
                object = new Object("six",R.drawable.six,R.raw.six);
                break;
            case 7:
                object = new Object("seven",R.drawable.seven,R.raw.seven);
                break;
            case 8:
                object = new Object("eight",R.drawable.eight,R.raw.eight);
                break;
            case 9:
                object = new Object("nine",R.drawable.nine,R.raw.nine);
                break;
            case 10:
                object = new Object("ten",R.drawable.ten,R.raw.ten);
                break;
            case 11:
                object = new Object("eleven",R.drawable.eleven,R.raw.eleven);
                break;
            case 12:
                object = new Object("twelve",R.drawable.twelve,R.raw.twelve);
                break;
            case 13:
                object = new Object("thirteen",R.drawable.thirteen,R.raw.thirteen);
                break;
            case 14:
                object = new Object("fourteen",R.drawable.fourteen,R.raw.fourteen);
                break;
            case 15:
                object = new Object("fifteen",R.drawable.fifteen,R.raw.fifteen);
                break;
            case 16:
                object = new Object("sixteen",R.drawable.sixteen,R.raw.sixteen);
                break;
            case 17:
                object = new Object("seventeen",R.drawable.seventeen,R.raw.seventeen);
                break;
            case 18:
                object = new Object("eighteen",R.drawable.eighteen,R.raw.eighteen);
                break;
            case 19:
                object = new Object("nineteen",R.drawable.nineteen,R.raw.nineteen);
                break;
            case 20:
                object = new Object("twenty",R.drawable.twenty,R.raw.twenty);
                break;
            case 21:
                object = new Object("twenty-one",R.drawable.twentyone,R.raw.twentyone);
                break;
            case 22:
                object = new Object("twenty-two",R.drawable.twentytwo,R.raw.twentytwo);
                break;
            case 23:
                object = new Object("twenty-three",R.drawable.twentythree,R.raw.twentythree);
                break;
            case 24:
                object = new Object("twenty-four",R.drawable.twentyfour,R.raw.twentyfour);
                break;
            case 25:
                object = new Object("twenty-five",R.drawable.twentyfive,R.raw.twentyfive);
                break;
            case 26:
                object = new Object("twenty-six",R.drawable.twentysix,R.raw.twentysix);
                break;
            case 27:
                object = new Object("twenty-seven",R.drawable.twentyseven,R.raw.twentyseven);
                break;
            case 28:
                object = new Object("twenty-eight",R.drawable.twentyeight,R.raw.twentyeight);
                break;
            case 29:
                object = new Object("twenty-nine",R.drawable.twentynine,R.raw.twentynine);
                break;
            case 30:
                object = new Object("thirty",R.drawable.thirty,R.raw.thirty);
                break;
        }

        bundle.putString("name",object.getName());
        bundle.putInt("image",object.getImage());
        bundle.putInt("sound",object.getSound());
        objectFragment.setArguments(bundle);

        return objectFragment;
    }

    @Override
    public int getCount() {
        return 31;
    }
}
