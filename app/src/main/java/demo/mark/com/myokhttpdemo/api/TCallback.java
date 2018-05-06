package demo.mark.com.myokhttpdemo.api;

import android.util.JsonReader;

import com.google.gson.Gson;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.StringCallback;

import java.lang.reflect.Type;

import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * 项目名称：MyOKHttpDemo
 * 类描述：自定义json返回解析callback
 * Created by mark on 2018/5/6 20:49
 * 修改人：mark
 * 修改时间：2018/5/6 20:49
 * 修改备注：
 */
public abstract class TCallback<T> extends JsonCallback<T> {

}
