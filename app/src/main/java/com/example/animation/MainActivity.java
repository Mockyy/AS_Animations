package com.example.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable galekingAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView anim_list = (ListView) findViewById(R.id.anim_list);

        Pokemon_info galeking = new Pokemon_info(R.drawable.animation_galeking, "Galeking", "Acier / Roche");
        Pokemon_info gardevoir = new Pokemon_info(R.drawable.animation_gardevoir, "Gardevoir", "Psy / Fée");
        Pokemon_info laggron = new Pokemon_info(R.drawable.laggron_animation, "Laggron", "Eau / Sol");
        Pokemon_info mysdibule = new Pokemon_info(R.drawable.mysdibule_animation, "Mysdibule", "Acier / Fée");
        Pokemon_info metalosse = new Pokemon_info(R.drawable.metalosse_animation, "Métalosse", "Acier / Psy");
        Pokemon_info torterra = new Pokemon_info(R.drawable.torterra_animation, "Torterra", "Plante / Sol");

        ArrayList<Pokemon_info> pokemon_list = new ArrayList<Pokemon_info>();
        pokemon_list.add(galeking);
        pokemon_list.add(gardevoir);
        pokemon_list.add(laggron);
        pokemon_list.add(mysdibule);
        pokemon_list.add(metalosse);
        pokemon_list.add(torterra);

        PokemonListAdapter adapter = new PokemonListAdapter(this, R.layout.anim_layout, pokemon_list);
        anim_list.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();

        /*
        ImageView galekingImage = (ImageView) findViewById(R.id.galeking_image);
        galekingImage.setBackgroundResource(R.drawable.animation_galeking);

        galekingAnimation = (AnimationDrawable) galekingImage.getBackground();
        galekingAnimation.start();
         */
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
}
