package mark.view.com.my_mvp_retrofit_rxjava.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.GsonBuilder;

import mark.view.com.my_mvp_retrofit_rxjava.Constants;
import mark.view.com.my_mvp_retrofit_rxjava.R;
import mark.view.com.my_mvp_retrofit_rxjava.service.RetrofitService;
import mark.view.com.my_mvp_retrofit_rxjava.service.entity.Book;
import mark.view.com.my_mvp_retrofit_rxjava.service.presenter.BookPresenter;
import mark.view.com.my_mvp_retrofit_rxjava.service.view.BookView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MarkActivity extends AppCompatActivity {

    private TextView tv_showResult;
    private BookPresenter mBookPresenter = new BookPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);

        initViews();
    }

    private void initViews() {
        tv_showResult = (TextView) findViewById(R.id.tv_showResult);

        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);
    }

    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(Book mBook) {
            tv_showResult.setText(mBook.toString());
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MarkActivity.this,result, Toast.LENGTH_SHORT).show();
        }
    };

    public void doGetBook(View view){
        mBookPresenter.getSearchBook("金瓶梅", null, 0, 1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBookPresenter.onStop();
    }

    public void praticeTwo(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASEURL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//支持RxJava
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        //被观察者
        Observable<Book> observable = service.getSearchBook("金瓶梅", null, 0, 1);
        observable.subscribeOn(Schedulers.io())//请求数据的事件发生在io线程
                .observeOn(AndroidSchedulers.mainThread())//请求完成后在主线程更显UI
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onCompleted() {
                        //所有事件都完成，可以做些操作。。。
                    }
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace(); //请求过程中发生错误
                    }
                    @Override
                    public void onNext(Book book) {//这里的book就是我们请求接口返回的实体类
                        tv_showResult.setText(book.toString() + "");
                        Log.e("TTT",book.toString());
                    }
                });
    }

    public void practiceOne(){
        /*//第一次网络请求
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASEURL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();
        RetrofitService service = retrofit.create(RetrofitService.class);

        Call<Book> call = service.getSearchBook("金瓶梅",null,0,1);
        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                tv_showResult.setText(response.body().toString() + "");
                Log.e("TTT",response.body().toString());
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {

            }
        });*/
    }
}
