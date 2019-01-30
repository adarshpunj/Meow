package com.github.meow;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalFragment extends Fragment {

    private TextView animalName;
    private ImageView animalImage;
    private MediaPlayer mediaPlayer;

    public AnimalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animal, container, false);

        animalName = view.findViewById(R.id.name);
        animalImage = view.findViewById(R.id.image);

        animalName.setText(getArguments().getString("name"));
        animalImage.setImageResource(getArguments().getInt("image"));

        animalImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer = MediaPlayer.create(
                        getContext(),getArguments().getInt("sound"));

                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.release();
                    }
                });
            }
        });

        return view;
    }

}
