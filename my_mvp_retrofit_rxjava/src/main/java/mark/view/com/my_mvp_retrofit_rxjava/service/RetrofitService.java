package mark.view.com.my_mvp_retrofit_rxjava.service;


import mark.view.com.my_mvp_retrofit_rxjava.service.entity.Book;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mark on 2017/10/19.
 * $desc$  接口类的定义
 * Mail: 2285581945@qq.com
 */

public interface RetrofitService {

   /* @GET("book/search")
    Call<Book> getSearchBook(@Query("q") String name,
                             @Query("tag") String tag,
                             @Query("start") int start,
                             @Query("count") int count);*/

    @GET("book/search")
    Observable<Book> getSearchBook(@Query("q") String name,
                                   @Query("tag") String tag,
                                   @Query("start") int start,
                                   @Query("count") int count);
}
