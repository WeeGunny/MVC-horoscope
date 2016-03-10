package com.school.luke.mvc_horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent= getIntent();
        String StarSign = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        String horoscope;
        if(StarSign.equals("aries")){
          horoscope="rage dude";
        }
        else if(StarSign.equals("taurus")){
            horoscope="bull";

        }
        else if(StarSign.equals("leo")){
            horoscope="lion";

        }
        else if(StarSign.equals("gemini")){
            horoscope="twinsies";

        }
        else if(StarSign.equals("cancer")){
            horoscope="you've got crabs";

        }
        else if(StarSign.equals("virgo")){
            horoscope="angel lady";

        }
        else if(StarSign.equals("libra")){
            horoscope="What the hell is libra";

        }
        else if(StarSign.equals("scorpius")){
            horoscope="I am the scorpian king!!!";

        }
        else if(StarSign.equals("sagittarius")){
            horoscope="Horsie";

        }
        else if(StarSign.equals("capricorn")){
            horoscope="*Goat Screams*";

        }
        else if(StarSign.equals("aquarius")){
            horoscope="Unda da C";

        }
        else if(StarSign.equals("pisces")){
            horoscope="Every body's doing the fish";

        }
        else{
            horoscope="that's not a star sign ya dingus";
        }

        textView.setText(horoscope);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

    }

}
