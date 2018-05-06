package mark.view.com.my_mvp_retrofit_rxjava.service.view;

import mark.view.com.my_mvp_retrofit_rxjava.service.entity.Book;

/**
 * Created by mark on 2017/10/20.
 * $desc$
 * Mail: 2285581945@qq.com
 */

public interface BookView extends View{
    void onSuccess(Book book);
    void onError(String result);
}
