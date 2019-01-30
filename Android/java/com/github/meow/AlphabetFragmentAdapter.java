package com.github.meow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AlphabetFragmentAdapter extends FragmentStatePagerAdapter {
    private Object object;

    public AlphabetFragmentAdapter(FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {

        ObjectFragment objectFragment = new ObjectFragment();

        Bundle bundle = new Bundle();

        switch (position){
            case 0:
                object = new Object(" ",R.drawable.a,R.raw.a);
                break;
            case 1:
                object = new Object(" ",R.drawable.b,R.raw.b);
                break;
            case 2:
                object = new Object(" ",R.drawable.c,R.raw.c);
                break;
            case 3:
                object = new Object(" ",R.drawable.d,R.raw.d);
                break;
            case 4:
                object = new Object(" ",R.drawable.e,R.raw.e);
                break;
            case 5:
                object = new Object(" ",R.drawable.f,R.raw.f);
                break;
            case 6:
                object = new Object(" ",R.drawable.g,R.raw.g);
                break;
            case 7:
                object = new Object(" ",R.drawable.h,R.raw.h);
                break;
            case 8:
                object = new Object(" ",R.drawable.i,R.raw.i);
                break;
            case 9:
                object = new Object(" ",R.drawable.j,R.raw.j);
                break;
            case 10:
                object = new Object(" ",R.drawable.k,R.raw.k);
                break;
            case 11:
                object = new Object(" ",R.drawable.l,R.raw.l);
                break;
            case 12:
                object = new Object(" ",R.drawable.m,R.raw.m);
                break;
            case 13:
                object = new Object(" ",R.drawable.n,R.raw.n);
                break;
            case 14:
                object = new Object(" ",R.drawable.o,R.raw.o);
                break;
            case 15:
                object = new Object(" ",R.drawable.p,R.raw.p);
                break;
            case 16:
                object = new Object(" ",R.drawable.q,R.raw.q);
                break;
            case 17:
                object = new Object(" ",R.drawable.r,R.raw.r);
                break;
            case 18:
                object = new Object(" ",R.drawable.s,R.raw.s);
                break;
            case 19:
                object = new Object(" ",R.drawable.t,R.raw.t);
                break;
            case 20:
                object = new Object(" ",R.drawable.u,R.raw.u);
                break;
            case 21:
                object = new Object(" ",R.drawable.v,R.raw.v);
                break;
            case 22:
                object = new Object(" ",R.drawable.w,R.raw.w);
                break;
            case 23:
                object = new Object(" ",R.drawable.x,R.raw.x);
                break;
            case 24:
                object = new Object(" ",R.drawable.y,R.raw.y);
                break;
            case 25:
                object = new Object(" ",R.drawable.z,R.raw.z);
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
        return 26;
    }
}
