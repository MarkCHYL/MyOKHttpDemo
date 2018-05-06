package jitao.kede.com.okhttpdemo_test;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv_01;
    private Button btn_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_01 = (TextView) findViewById(R.id.tv_01);
        initView();


    }

    private void initView() {
        btn_search = findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRequest();
            }
        });
    }

    /**
     * 这是个例子
     * */
    private void getRequest() {
        final String url = "https://www.baidu.com/";
        @SuppressLint("HandlerLeak") final Handler myHandler = new Handler() {
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 1:
                        tv_01.setText("你大爷你大爷你大爷");
                        break;
                }
                super.handleMessage(msg);
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpUtils.doGet(Constant.baseUrl, new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.e("你er爷","-------------"+e);
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Log.e("你大爷","-------------"+response.body().string());
                        myHandler.sendEmptyMessage(1);
                    }
                });

              /*  HttpUtils.postJson(url, url, new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Log.e("你大爷","-------------"+response.body().string());
                    }
                });*/
            }
        }).start();

    }
}
