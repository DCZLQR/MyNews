package com.dczlqr.mynews.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

import com.dczlqr.mynews.R;

public class SplashActivity extends Activity {
    private RelativeLayout rl_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        rl_splash = (RelativeLayout)findViewById(R.id.rl_splash);

        //缩放动画
        ScaleAnimation sa = new ScaleAnimation(0.1f, 1.0f, 1.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        sa.setDuration(1800);
        sa.setFillAfter(true);

        //旋转动画
        RotateAnimation ra = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        ra.setDuration(1800);
        ra.setFillAfter(true);

        //透明度动画
        AlphaAnimation aa = new AlphaAnimation(0f, 1f);
        aa.setDuration(1800);
        aa.setFillAfter(true);

        AnimationSet set = new AnimationSet(false);
        set.addAnimation(aa);
        set.addAnimation(ra);
        set.addAnimation(sa);

        rl_splash.startAnimation(set);

        set.setAnimationListener(new MyAnimationListener());
    }


    private class MyAnimationListener implements Animation.AnimationListener {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            startActivity(new Intent(SplashActivity.this, GuideActivity.class));
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
