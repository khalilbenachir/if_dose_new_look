package com.example.firstappfigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation smalltobig, btta, btta2;
    private TextView textView, subtitle_header;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load this animation
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        btta = AnimationUtils.loadAnimation(this, R.anim.btta);
        btta2 = AnimationUtils.loadAnimation(this, R.anim.btta2);

        imageView = findViewById(R.id.imageViewBlood);

        textView = findViewById(R.id.textViewWelcome);
        subtitle_header = findViewById(R.id.subtitle_header);

        button = findViewById(R.id.buttonLogin);

        editText = findViewById(R.id.editTextPassword);

        // passing animation and start it
        imageView.startAnimation(smalltobig);

        textView.startAnimation(btta);
        subtitle_header.startAnimation(btta);

        button.startAnimation(btta2);

        editText.startAnimation(btta2);


    }
}
