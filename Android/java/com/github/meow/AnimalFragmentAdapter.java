package com.github.meow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AnimalFragmentAdapter extends FragmentStatePagerAdapter {

    private Animal animal;

    public AnimalFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        AnimalFragment animalFragment = new AnimalFragment();

        Bundle bundle = new Bundle();
        switch (position){

            case 0:
                animal = new Animal("ALLIGATOR",R.drawable.alligator,R.raw.alligator);
                break;

            case 1:
                animal = new Animal("GORILLA",R.drawable.ape,R.raw.ape);
                break;

            case 2:
                animal = new Animal("BAT",R.drawable.bat,R.raw.bat);
                break;

            case 3:
                animal = new Animal("BEE",R.drawable.bee,R.raw.bee);
                break;

            case 4:
                animal = new Animal("BUFFALO",R.drawable.buffalo,R.raw.buffalo);
                break;

            case 5:
                animal = new Animal("CAMEL",R.drawable.camel,R.raw.camel);
                break;

            case 6:
                animal = new Animal("CAT",R.drawable.cat,R.raw.cat);
                break;

            case 7:
                animal = new Animal("COW",R.drawable.cow,R.raw.cow);
                break;

            case 8:
                animal = new Animal("CROW",R.drawable.crow,R.raw.crow);
                break;

            case 9:
                animal = new Animal("DOG",R.drawable.dog,R.raw.dog);
                break;

            case 10:
                animal = new Animal("DUCK",R.drawable.duck,R.raw.duck);
                break;

            case 11:
                animal = new Animal("ELEPHANT",R.drawable.elephant,R.raw.elephant);
                break;

            case 12:
                animal = new Animal("FROG",R.drawable.frog,R.raw.frog);
                break;

            case 13:
                animal = new Animal("GIRAFFE",R.drawable.giraffe,R.raw.giraffe);
                break;

            case 14:
                animal = new Animal("HORSE",R.drawable.horse,R.raw.horse);
                break;

            case 15:
                animal = new Animal("LEOPARD",R.drawable.leopard,R.raw.leopard);
                break;

            case 16:
                animal = new Animal("LION",R.drawable.lion,R.raw.lion);
                break;

            case 17:
                animal = new Animal("MOOSE",R.drawable.moose,R.raw.moose);
                break;

            case 18:
                animal = new Animal("OWL",R.drawable.owl,R.raw.owl);
                break;

            case 19:
                animal = new Animal("PARROT",R.drawable.parrot,R.raw.parrot);
                break;

            case 20:
                animal = new Animal("PENGUIN",R.drawable.penguin,R.raw.penguin);
                break;

            case 21:
                animal = new Animal("PIG",R.drawable.pig,R.raw.pig);
                break;

            case 22:
                animal = new Animal("RAT",R.drawable.rat,R.raw.rat);
                break;

            case 23:
                animal = new Animal("RATTLESNAKE",R.drawable.rattlesnake,R.raw.rattlesnake);
                break;

            case 24:
                animal = new Animal("RHINOCEROS",R.drawable.rhinoceros,R.raw.rhinoceros);
                break;

            case 25:
                animal = new Animal("ROOSTER",R.drawable.rooster,R.raw.rooster);
                break;

            case 26:
                animal = new Animal("SHEEP",R.drawable.sheep,R.raw.sheep);
                break;

            case 27:
                animal = new Animal("TIGER",R.drawable.tiger,R.raw.tiger);
                break;

            case 28:
                animal = new Animal("WOLF",R.drawable.wolf,R.raw.wolf);
                break;

            case 29:
                animal = new Animal("ZEBRA",R.drawable.zebra,R.raw.zebra);
                break;

            case 30:
                animal = new Animal("ANTELOPE",R.drawable.antelope,R.raw.antelope);
                break;

            case 31:
                animal = new Animal("FALCON",R.drawable.falcon,R.raw.falcon);
                break;

            case 32:
                animal = new Animal("PANDA",R.drawable.panda,R.raw.panda);
                break;

            case 33:
                animal = new Animal("RABBIT",R.drawable.rabbit,R.raw.rabbit);
                break;

            case 34:
                animal = new Animal("ROBIN",R.drawable.robin,R.raw.robin);
                break;
        }

        bundle.putString("name",animal.getName());
        bundle.putInt("image",animal.getImage());
        bundle.putInt("sound",animal.getSound());
        animalFragment.setArguments(bundle);

        return animalFragment;
    }

    @Override
    public int getCount() {
        return 35;
    }
}
