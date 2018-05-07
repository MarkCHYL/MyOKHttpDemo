package demo.mark.com.myokhttpdemo;

import android.content.Context;
import android.graphics.Bitmap;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.BitmapCallback;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.callback.StringCallback;

import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.mark.com.myokhttpdemo.api.JsonCallback;
import demo.mark.com.myokhttpdemo.bean.AdListBeanResult;
import demo.mark.com.myokhttpdemo.bean.BaseBean;
import demo.mark.com.myokhttpdemo.bean.LoginBean;
import okhttp3.MediaType;

/**
 * 网路请求
 * Created by mark on 2017/9/19.
 */

public class HttpUtils {

    /*
     *基本的网络请求
     * */
    public static void commonRequest(Context context, StringCallback stringCallback) {
        OkGo.<String>get(Urls.URL_METHOD)
                .tag(context)
                .params("q", "okgo")
                .params("page", "1")
                .params("type", "note")
                .cacheKey("cachekey")
                .execute(stringCallback);
    }

    /*
     *请求Bitmap
     * */
    public static void imgRequest(Context context, BitmapCallback bitmapCallback) {
        OkGo.<Bitmap>get(Urls.URL_IMG)
                .tag(context)
                .cacheKey("cacheIMGkey")
                .execute(bitmapCallback);
    }

    /*
     *基本文件下载
     * */
    public static void fileDownLoadRequest(Context context, FileCallback fileCallback) {
        OkGo.<File>get(Urls.URL_IMG)
                .tag(context)
                .execute(fileCallback);
    }

    /*
     *上传String类型的文本
     * */
    public static void stringRequest(Context context, String str1, String str2, StringCallback stringCallback) {
        OkGo.<String>post(Urls.URL_METHOD)
                .tag(context)
                .upString(str1)
                .upString(str2, MediaType.parse("application/xml"))
                .cacheKey("cachestringkey")
                .execute(stringCallback);
    }

    /*
     * 上传JSON类型的文本
     * */
    public static void jsonRequest(Context context, String str1, String str2, StringCallback stringCallback) {
        Map<String, String> params = new HashMap<>();
        params.put("key1", str1);
        params.put("key2", str2);
        JSONObject jsonObject = new JSONObject(params);

        OkGo.<String>post(Urls.URL_METHOD)
                .tag(context)
                .upJson(jsonObject)
                .execute(stringCallback);
    }

    /*
     * 上传文件
     * */
    public static void fileUpRequest(Context context, int num, String str1, List<File> files, StringCallback stringCallback) {
        OkGo.<String>post(Urls.URL_METHOD)
                .tag(context)
                .isMultipart(true)                //强制使用 multipart/form-data 表单上传，默认false
                .params("param1", num)             //这里上传参数
                .params("file1", new File(str1))   //可以添加文件上传
                .addFileParams("key", files)       //这里支持一个key传多个文件
                .execute(stringCallback);
    }


    /*
     *上传String类型的文本
     * */
    public static void postRequest(Context context, String str1, String str2, String str3, StringCallback stringCallback) {
        //http://www.jianshu.com/search?q=okgo&page=1&type=note
        OkGo.<String>post("http://www.baidu.com")
                .tag(context)
                .isSpliceUrl(true)
                .params("q", str1)
                .params("page", str2)
                .params("type", str3)
                .execute(stringCallback);
    }

    /*
     * 登录
     * */
    public static void loginRequest(Context context, String str1,
                                    String str2, String str3,
                                    JsonCallback<LoginBean> stringCallback) {
        OkGo.<LoginBean>post(Urls.baseUrl + "/mlogin")
                .tag(context)
                .headers("User-Agent", "AFT")
                .params("mobile", str1)
                .params("password", str2)
                .params("type", str3)
                .cacheMode(CacheMode.NO_CACHE)
                .execute(stringCallback);
    }

    public static void testRequest(Context context,
                                   JsonCallback<BaseBean<AdListBeanResult>> stringCallback) {
        OkGo.<BaseBean<AdListBeanResult>>post(Urls.baseUrl + "/qqt/system/queryAdList.json")
                .tag(context)
                .params("ad_position", 4)
                .params("last_update_time", "0")
                .params("page", 1)
                .params("count", 100)
                .cacheMode(CacheMode.NO_CACHE)
                .upString(Urls.jsonHeader)
                .execute(stringCallback);
    }
}
