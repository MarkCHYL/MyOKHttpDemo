package demo.mark.com.myokhttpdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.List;

import demo.mark.com.myokhttpdemo.api.JsonCallback;
import demo.mark.com.myokhttpdemo.bean.AdListBean;
import demo.mark.com.myokhttpdemo.bean.BaseBean;
import demo.mark.com.myokhttpdemo.bean.LoginBean;

public class MarkActivity extends AppCompatActivity {

    private TextView tv_show_reponse;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);
        context = this;
        initView();

    }

    private void initView() {
        tv_show_reponse = (TextView) findViewById(R.id.tv_show_reponse);
        findViewById(R.id.btn_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                doPost();
                doTest();
            }
        });
    }

    public void doGet(){
        HttpUtils.commonRequest(context, new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                tv_show_reponse.setText(response.body());
                Log.e("mark","success"+response.body().toString());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                tv_show_reponse.setText("Error");
                Log.e("mark","Error");
            }
        });
    }

    public void doPost(){
        HttpUtils.postRequest(context, "okgo", "1", "note", new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                Log.e("mark","success"+response.body().toString());
                tv_show_reponse.setText(response.body());
            }

            @Override
            public void onError(Response<String> response) {
                super.onError(response);
                Log.e("mark","Error");
                tv_show_reponse.setText("Error");
            }
        });
    }

    public void doTest(){
//        HttpUtils.loginRequest(context, "18673668974", "123123", "1",
//                new JsonCallback<LoginBean>() {
//                    @Override
//                    public void onSuccess(Response<LoginBean> response) {
////                        Log.e("TEST",response.toString());
//                        tv_show_reponse.setText(response.body().toString());
//                    }
//                }
//        );
        HttpUtils.testRequest(context, new JsonCallback<BaseBean>() {
            @Override
            public void onSuccess(Response<BaseBean> response) {
                tv_show_reponse.setText(response.body().toString());
            }
        });
    }
}
