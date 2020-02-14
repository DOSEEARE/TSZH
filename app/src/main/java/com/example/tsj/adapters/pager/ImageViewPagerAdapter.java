package com.example.tsj.adapters.pager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ImageViewPagerAdapter extends PagerAdapter {
    private Context context;
    public List<String> imageUrls;

    public ImageViewPagerAdapter(Context context, List<String> imageUrls) {
        this.context = context;
        this.imageUrls = imageUrls;
    }


    public ImageViewPagerAdapter(Context context) {
        this.context = context;
        this.imageUrls = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return imageUrls.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}