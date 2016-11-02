package com.example.administrator.freedom_flow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class WelcomeActivity extends AppCompatActivity {
    ImageView welcome_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        welcome_image = (ImageView) findViewById(R.id.welcome_image);
        //实现开机动画
        AlphaAnimation anima = new AlphaAnimation(0.3f,1.0f);
        anima.setDuration(3000);
        welcome_image.startAnimation(anima);
        anima.setAnimationListener(new AnimationImpl());
    }

    private  class AnimationImpl implements Animation.AnimationListener{

        @Override
        public void onAnimationStart(Animation animation) {
            welcome_image.setBackgroundResource(R.drawable.start);

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            skip();

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
    private void skip(){
        startActivity(new Intent(this,MainActivity.class));
    }


}
