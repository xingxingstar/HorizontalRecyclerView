package com.example.zhuwojia.horizontalrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.example.zhuwojia.horizontalrecyclerview.adapter.RecyclerViewAdapter;
import com.example.zhuwojia.horizontalrecyclerview.apiservice.GetInfoData;
import com.example.zhuwojia.horizontalrecyclerview.bean.Display;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        downNetData();
    }

    /**
     * 初始化视图
     */
    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layout = (RelativeLayout) findViewById(R.id.layout);
    }

    /**
     * 请求数据的参数集合
     *
     * @return
     */
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("orider_dir", "1");
        map.put("page_size", "20");
        map.put("page", "0");
        map.put("order_by", "1");
        return map;
    }

    /**
     * 下载数据
     */
    private void downNetData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.menghuoapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetInfoData data = retrofit.create(GetInfoData.class);
        Call<Display> call = data.getData(getMap());
        call.enqueue(new Callback<Display>() {
            @Override
            public void onResponse(Call<Display> call, Response<Display> response) {
                Display display = response.body();
                List<Display.DataBean> bean = display.getData();
                RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(new RecyclerViewAdapter(MainActivity.this, bean));
            }

            @Override
            public void onFailure(Call<Display> call, Throwable t) {

            }
        });
    }



}
