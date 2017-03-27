package com.apress.gerber.arboretumapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_freeview, btn_glossary, btn_guidedtour, btn_games, btn_home, btn_about, btn_contact, btn_donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ViewGroup decorView= (ViewGroup) this.getWindow().getDecorView();
        LinearLayout root= (LinearLayout) decorView.getChildAt(0);
        FrameLayout titleContainer= (FrameLayout) root.getChildAt(0);
        TextView title= (TextView) titleContainer.getChildAt(0);
        title.setGravity(Gravity.CENTER);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        btn_freeview.setOnClickListener(onClickListener);
        btn_glossary.setOnClickListener(onClickListener);
        btn_guidedtour.setOnClickListener(onClickListener);
        btn_games.setOnClickListener(onClickListener);
        btn_home.setOnClickListener(onClickListener);
        btn_about.setOnClickListener(onClickListener);
        btn_contact.setOnClickListener(onClickListener);
        btn_donate.setOnClickListener(onClickListener);

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

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.btn_freeview:
                    Intent map=new Intent(MainActivity.this, LanderMap.class);
                    startActivity(map);
                    break;
                case R.id.btn_guidedtour:
                    Intent tour=new Intent(MainActivity.this, GuidedTour.class);
                    startActivity(tour);
                    break;
                case R.id.btn_games:
                    Intent games=new Intent(MainActivity.this, Games.class);
                    startActivity(games);
                    break;
                case R.id.btn_glossary:
                    Intent glossary=new Intent(MainActivity.this, Glossary.class);
                    startActivity(glossary);
                    break;
                case R.id.btn_home:
                    Intent home=new Intent(MainActivity.this, MainActivity.class);
                    startActivity(home);
                    break;
                case R.id.btn_about:
                    Intent about=new Intent(MainActivity.this, About.class);
                    startActivity(about);
                    break;
                case R.id.btn_donate:
                    Intent donate=new Intent(MainActivity.this, Donate.class);
                    startActivity(donate);
                    break;
                case R.id.btn_contact:
                    Intent contact=new Intent(MainActivity.this, Contact.class);
                    startActivity(contact);
                    break;
            }
        }
    };

    //slide animation for Splash.java . This will slide the leaf from one point to another
    public void slide(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation1);
    }
}
