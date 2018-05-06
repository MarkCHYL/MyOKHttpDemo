package mark.view.com.my_mvp_retrofit_rxjava.service.presenter;

import android.content.Intent;

import mark.view.com.my_mvp_retrofit_rxjava.service.view.View;

/**
 * Created by mark on 2017/10/20.
 * $desc$
 * Mail: 2285581945@qq.com
 */

public interface Presenter {
    void onCreate();

    void onStart();//暂时没用到

    void onStop();

    void pause();//暂时没用到

    void attachView(View view);

    void attachIncomingIntent(Intent intent);//暂时没用到
}
