package com.bdliang.qqwrydemo.net;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author bd_liang
 * @Type HttpRequest
 * @Desc
 * @date 2018/1/5 11:12
 */
public class HttpRequest {
    /**
     *
     */
    public static final String TAG = "HttpRequest";
    /**
     * 唯一对象
     */
    public static final OkHttpClient client = new OkHttpClient();

    static {
        client.newBuilder().connectTimeout(10, TimeUnit.SECONDS);
        client.newBuilder().writeTimeout(10, TimeUnit.SECONDS);
        client.newBuilder().readTimeout(30, TimeUnit.SECONDS);
    }

    /**
     * 发送 OKHttp get 请求
     *
     * @param url 请求地址
     * @return 服务器返回
     */
    public static String  sendGETOkHttpRequest(String url) {
        Log.d(TAG, "sendGETOkHttpRequest: " + url);
        Request request = new Request.Builder().url(url).build();
        try {
            Response response =  client.newCall(request).execute();
            return  response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "error";
    }
}
