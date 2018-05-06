package mark.view.com.my_mvp_retrofit_rxjava.service.manager;

import android.content.Context;

import mark.view.com.my_mvp_retrofit_rxjava.service.RetrofitHepler;
import mark.view.com.my_mvp_retrofit_rxjava.service.RetrofitService;
import mark.view.com.my_mvp_retrofit_rxjava.service.entity.Book;
import rx.Observable;

/**
 * Created by mark on 2017/10/20.
 * $desc$ 为了让你更方便的调用RetrofitService 中定义的方法
 * Mail: 2285581945@qq.com
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHepler.getInstance(context).getSever();
    }
    public Observable<Book> getSearchBook(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBook(name,tag,start,count);
    }
}
