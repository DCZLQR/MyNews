package com.dczlqr.mynews.ui;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dczlqr.mynews.R;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends Activity {
    private ViewPager viewpager;

    private List<ImageView> imageViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        viewpager = findViewById(R.id.viewpager);

        int[] ids = new int[]{
                R.drawable.guide_1,
                R.drawable.guide_2,
                R.drawable.guide_3
        };

        imageViews = new ArrayList<>();
        for (int i = 0; i < ids.length; i++){
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(ids[i]);

            imageViews.add(imageView);
        }


    }
}
