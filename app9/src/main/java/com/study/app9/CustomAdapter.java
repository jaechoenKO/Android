package com.study.app9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

// CustomAdapter는 BaseAdapter를 상속 받아야 한다.
public class CustomAdapter extends BaseAdapter{

    private Context mContext;
    private int[] data; // 배열의 길이 값이 데이터. MainActivity에 선언 되어 있다.

    public CustomAdapter(Context mContext, int[] data){

        this.mContext = mContext;
        this.data = data;

    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // 리스트 뷰는 한행 한행이 item 이었다면, 그리드 뷰는, 한칸 한칸이 item, 이미지뷰를 그대로 가져다 사용해도 된다.
        ImageView imageView;

        // 뷰가 없다면
        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(150, 150)); // 셀의 크기를 정함.
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); // 정 가운데 배치.
            imageView.setPadding(5, 5, 5, 5);
        }else{
            imageView = (ImageView)view;
        }

        imageView.setImageResource(data[i]);

        return imageView;
    }

}
