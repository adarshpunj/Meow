package com.github.meow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AnimalFragmentAdapter extends FragmentStatePagerAdapter {

    private Object object;

    public AnimalFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        ObjectFragment objectFragment = new ObjectFragment();

        Bundle bundle = new Bundle();
        switch (position){

            case 0:
                object = new Object("ALLIGATOR",R.drawable.alligator,R.raw.alligator);
                break;

            case 1:
                object = new Object("GORILLA",R.drawable.ape,R.raw.ape);
                break;

            case 2:
                object = new Object("BAT",R.drawable.bat,R.raw.bat);
                break;

            case 3:
                object = new Object("BEE",R.drawable.bee,R.raw.bee);
                break;

            case 4:
                object = new Object("BUFFALO",R.drawable.buffalo,R.raw.buffalo);
                break;

            case 5:
                object = new Object("CAMEL",R.drawable.camel,R.raw.camel);
                break;

            case 6:
                object = new Object("CAT",R.drawable.cat,R.raw.cat);
                break;

            case 7:
                object = new Object("COW",R.drawable.cow,R.raw.cow);
                break;

            case 8:
                object = new Object("CROW",R.drawable.crow,R.raw.crow);
                break;

            case 9:
                object = new Object("DOG",R.drawable.dog,R.raw.dog);
                break;

            case 10:
                object = new Object("DUCK",R.drawable.duck,R.raw.duck);
                break;

            case 11:
                object = new Object("ELEPHANT",R.drawable.elephant,R.raw.elephant);
                break;

            case 12:
                object = new Object("FROG",R.drawable.frog,R.raw.frog);
                break;

            case 13:
                object = new Object("GIRAFFE",R.drawable.giraffe,R.raw.giraffe);
                break;

            case 14:
                object = new Object("HORSE",R.drawable.horse,R.raw.horse);
                break;

            case 15:
                object = new Object("LEOPARD",R.drawable.leopard,R.raw.leopard);
                break;

            case 16:
                object = new Object("LION",R.drawable.lion,R.raw.lion);
                break;

            case 17:
                object = new Object("MOOSE",R.drawable.moose,R.raw.moose);
                break;

            case 18:
                object = new Object("OWL",R.drawable.owl,R.raw.owl);
                break;

            case 19:
                object = new Object("PARROT",R.drawable.parrot,R.raw.parrot);
                break;

            case 20:
                object = new Object("PENGUIN",R.drawable.penguin,R.raw.penguin);
                break;

            case 21:
                object = new Object("PIG",R.drawable.pig,R.raw.pig);
                break;

            case 22:
                object = new Object("RAT",R.drawable.rat,R.raw.rat);
                break;

            case 23:
                object = new Object("RATTLESNAKE",R.drawable.rattlesnake,R.raw.rattlesnake);
                break;

            case 24:
                object = new Object("RHINOCEROS",R.drawable.rhinoceros,R.raw.rhinoceros);
                break;

            case 25:
                object = new Object("ROOSTER",R.drawable.rooster,R.raw.rooster);
                break;

            case 26:
                object = new Object("SHEEP",R.drawable.sheep,R.raw.sheep);
                break;

            case 27:
                object = new Object("TIGER",R.drawable.tiger,R.raw.tiger);
                break;

            case 28:
                object = new Object("WOLF",R.drawable.wolf,R.raw.wolf);
                break;

            case 29:
                object = new Object("ZEBRA",R.drawable.zebra,R.raw.zebra);
                break;

            case 30:
                object = new Object("ANTELOPE",R.drawable.antelope,R.raw.antelope);
                break;

            case 31:
                object = new Object("FALCON",R.drawable.falcon,R.raw.falcon);
                break;

            case 32:
                object = new Object("PANDA",R.drawable.panda,R.raw.panda);
                break;

            case 33:
                object = new Object("RABBIT",R.drawable.rabbit,R.raw.rabbit);
                break;

            case 34:
                object = new Object("ROBIN",R.drawable.robin,R.raw.robin);
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
        return 35;
    }
}
