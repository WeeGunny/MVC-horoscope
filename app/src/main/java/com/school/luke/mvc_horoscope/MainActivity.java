package com.school.luke.mvc_horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void SwitchToPisces (View view){
//        Intent intent = new Intent(this, DisplayPisces.class);
//        startActivity(intent);
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Pisces - It's never too late to do that thing you always wanted to do. You know - the THING. The thing? You know.");
    }
    public void SwitchToAquarius (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Aquarius - Silver foil can make a good hat, it's true. However, it can also be used as a sheathe should you find yourself lucky one lunchtime");
    }
    public void SwitchToAries (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Aries - Having a box of tissues close to hand might become important over the coming minutes.");
    }
    public void SwitchToCancer (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Cancer - Walking to work in a clown costume can help you in your search for humility.\n");
    }
    public void SwitchToCapricorn (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Capricorn - The number you are thinking of is an odd number below 50");
    }
    public void SwitchToGemini (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Gemini - You are trapped in a cave with a panther and a sound system playing Michael Bolton's greatest hits. What do you do?");
    }
    public void SwitchToLeo (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Leo - Dressing as a feline may give others cause for concern today." +
                "");
    }
    public void SwitchToLibra (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Libra - The future holds great peril for a masked magician in your area. Please phone your nearest masked magician and let him know.\n");
    }
    public void SwitchToSagittarius (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Sagittarius - Your ability to speak may be impaired today as you attempt to swallow half of a live hedgehog\n");
    }
    public void SwitchToScorpion (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Scorpio - Love makes the world go round, and peaches make a very nice accompaniment to sweetcorn");
    }
    public void SwitchToTaurus (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Taurus -As accurate as the weather report might be, you must be careful to avoid the 201 bus.");
    }
    public void SwitchToVirgo (View view){
        TextView horoscope = (TextView)findViewById(R.id.textView);
        horoscope.setText("Virgo - It's funny, all the other people I know like you died when they were very young");
    }
}

