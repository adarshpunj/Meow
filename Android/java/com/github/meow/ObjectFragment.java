package com.github.meow;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ObjectFragment extends Fragment {

    public static RelativeLayout relativeLayout;
    private TextView objectName;
    private ImageView objectImage;
    private MediaPlayer mediaPlayer;

    public ObjectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_object, container, false);

        relativeLayout = view.findViewById(R.id.relative_layout);
        objectName = view.findViewById(R.id.name);
        objectImage = view.findViewById(R.id.image);

        objectName.setText(getArguments().getString("name"));
        objectImage.setImageResource(getArguments().getInt("image"));

        objectImage.setOnClickListener(new View.OnClickListener() {
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
