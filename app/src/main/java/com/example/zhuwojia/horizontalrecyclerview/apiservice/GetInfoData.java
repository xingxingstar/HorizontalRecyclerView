package com.example.zhuwojia.horizontalrecyclerview.apiservice;

import com.example.zhuwojia.horizontalrecyclerview.bean.Display;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by zhuwojia on 2016/12/8.
 */

public interface GetInfoData {
    @POST(value = "v1/post/list")
    @Headers({"Content-Type:application/json; charset=UTF-8"})
    @FormUrlEncoded
    Call<Display> getData(@FieldMap Map<String, String> params);
}
