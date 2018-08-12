package com.study.app10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends BaseAdapter {

    private Context mContext;
    LayoutInflater inflater;
    private List<Integer> galleryList = new ArrayList<Integer>();

    public GalleryAdapter(Context mContext){
        this.mContext = mContext;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // arrayList에 아이템 추가하는 메소드, galleryList에 item 추가.
    public void addItem(Integer integer){
        galleryList.add(integer);
    }

    public Integer getGalleryItem(int position){
        return galleryList.get(position);
    }

    @Override
    public int getCount() {
        return galleryList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = inflater.inflate(R.layout.gallery_item, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.gimg01);
        imageView.setImageResource(galleryList.get(i));
        return view;
    }
}
