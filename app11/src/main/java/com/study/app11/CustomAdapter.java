package com.study.app11;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private int[] imgData;

    public CustomAdapter(Context mContext, int[] imgData) {
        this.mContext = mContext;
        this.imgData = imgData;
    }

    @Override
    public int getCount() {
        return imgData.length;
    }

    @Override
    public Object getItem(int position) {
        return imgData[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //gallery item => imgview
        ImageView imageView;

        // convertView가 없을 시
        if(convertView == null){
            imageView = new ImageView(mContext); // imageview를 만들 때는 context가 필요
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); // 이미지에 맞게 설정.
            imageView.setPadding(10, 10, 10, 10);
        }else{
            imageView = (ImageView)convertView; // 만들어진 이미지뷰 재사용.
        }

        imageView.setImageResource(imgData[position]);

        return imageView;
    }
}
