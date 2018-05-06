package mark.view.com.my_mvp_retrofit_rxjava.service;

import android.content.Context;

import com.google.gson.GsonBuilder;

import mark.view.com.my_mvp_retrofit_rxjava.Constants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mark on 2017/10/20.
 * $desc$ Retrofit的初始化
 * Mail: 2285581945@qq.com
 */

public class RetrofitHepler {

    private Context mContext;

    OkHttpClient client = new OkHttpClient();
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());

    private static RetrofitHepler instance = null;
    private Retrofit mRetrofit = null;
    private RetrofitHepler(Context context)
    {
        this.mContext = context;
        init();
    }

    public static RetrofitHepler getInstance(Context context){
        if (instance == null){
            instance = new RetrofitHepler(context);
        }
        return instance;
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASEURL)
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getSever(){
        return mRetrofit.create(RetrofitService.class);
    }
}
