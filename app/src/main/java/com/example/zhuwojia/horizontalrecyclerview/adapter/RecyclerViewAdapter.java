package com.example.zhuwojia.horizontalrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.example.zhuwojia.horizontalrecyclerview.R;
import com.example.zhuwojia.horizontalrecyclerview.bean.Display;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * Created by zhuwojia on 2016/12/8.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyAdapter> {

    private List<Display.DataBean> list;
    private Context context;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, List<Display.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {
        Glide.with(context).load(list.get(position).getPic_url()).into(holder.imageView);
        RelativeLayout.LayoutParams ll = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ll.rightMargin=20;
        if(position!=list.size()-1){
            Logger.d(position);
            holder.imageView.setLayoutParams(ll);
        }
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class MyAdapter extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public MyAdapter(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
