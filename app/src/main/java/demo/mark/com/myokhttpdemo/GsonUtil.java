package com.lbs.aft.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * gson数据格式转化为对象或者集合
 * Created by Administrator on 2017/12/13.
 */

public class GsonUtil {
    private static Gson gson = null;
    //没加载的话加载一次
    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    private GsonUtil() {
    }

    /**
     *对象 转话成json
     *
     * @param object
     * @return
     */
    public static String GsonToString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

    /**
     * JSON转成对象
     *
     * @param gsonStr
     * @param cls
     * @return
     */
    public static <T> T GsonToObject(String gsonStr, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonStr, cls);
        }
        return t;
    }

    /**
     * JSON转成list集合
     *
     * @param gsonString
     * @param cls
     * @return
     */
    public static <T> List<T> GsonToList(String gsonStr, Class<T> cls) {
        List<T> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonStr, new TypeToken<List<T>>() {
            }.getType());
        }
        return list;
    }


    /**
     * json转成map的
     *
     * @param gsonString
     * @return
     */
    public static <T> Map<String, T> GsonToMap(String gsonStr) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonStr, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }
    /**
     * JSON转成含有map的list集合
     *
     * @param gsonString
     * @return
     */
    public static <T> List<Map<String, T>> GsonToListMap(String gsonStr) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonStr,
                    new TypeToken<List<Map<String, T>>>() {
                    }.getType());
        }
        return list;
    }


}
