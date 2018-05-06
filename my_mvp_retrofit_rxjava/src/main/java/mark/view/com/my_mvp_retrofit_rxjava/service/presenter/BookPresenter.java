package mark.view.com.my_mvp_retrofit_rxjava.service.presenter;

import android.content.Context;
import android.content.Intent;

import mark.view.com.my_mvp_retrofit_rxjava.service.entity.Book;
import mark.view.com.my_mvp_retrofit_rxjava.service.manager.DataManager;
import mark.view.com.my_mvp_retrofit_rxjava.service.view.BookView;
import mark.view.com.my_mvp_retrofit_rxjava.service.view.View;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by mark on 2017/10/20.
 * $desc$
 * Mail: 2285581945@qq.com
 */

public class BookPresenter implements Presenter {
    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private BookView mBookView;
    private Book mBook;

    public BookPresenter(Context context) {
        this.mContext = context;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        //CompositeSubscription是用来存放RxJava中的订阅关系的
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()) {
            //注意请求完数据要及时清掉这个订阅关系，不然会发生内存泄漏
            //unsubscribe方法来取消这个订阅关系
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mBookView = (BookView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {
    }

    public void getSearchBook(String name, String tag, int start, int count) {
        mCompositeSubscription.add(manager.getSearchBook(name, tag, start, count)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onCompleted() {
                        if (mBook != null) {
                            mBookView.onSuccess(mBook);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mBookView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(Book book) {
                        mBook = book;
                    }
                })
        );


    }
}
