package jitao.kede.com.okhttpdemo_test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Mark on 2017/9/19.
 */

public class HttpUtils {

    //超时时间
    public static final int TIMEOUT=1000*60;

    //json请求
    public static final MediaType JSON = MediaType
            .parse("application/json; charset=utf-8");
    /**
     * okhttp3单例
     * */
    private static OkHttpClient client = null;

    private HttpUtils() {}

    public static OkHttpClient getInstance() {
        if (client == null) {
            synchronized (HttpUtils.class) {
                if (client == null){
                    client = new OkHttpClient();
                    //设置超时
                    client.newBuilder().connectTimeout(TIMEOUT, TimeUnit.SECONDS).
                            writeTimeout(TIMEOUT,TimeUnit.SECONDS).readTimeout(TIMEOUT, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return client;
    }

    /**
     * Get请求
     *
     * @param url
     * @param callback
     */
     public static void doGet(String url, Callback callback) {
         Request request = new Request.Builder()
                 .url(url)
                 .build();
         Call call = getInstance().newCall(request);
         call.enqueue(callback);
     }

     /**
      *
      * Post Json请求
      * */
     public static void postJson(String url,String json,Callback callBack){
         RequestBody body = RequestBody.create(JSON,json);
         Request request = new Request.Builder().url(url).post(body).build();
         getInstance().newCall(request).enqueue(callBack);
     }
    /**


    /**
     * Post请求发送键值对数据
     *
     * @param url
     * @param mapParams
     * @param callback
     */
    public static void doPost(String url, Map<String, String> mapParams, Callback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        for (String key : mapParams.keySet()) {
            builder.add(key, mapParams.get(key));
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        Call call = getInstance().newCall(request);
        call.enqueue(callback);
    }

    /**
     * 上传文件
     *
     * @param url
     * @param pathName
     * @param fileName
     * @param callback
     */
    public static void doFile(String url, String pathName, String fileName, Callback callback) {
        //判断文件类型
        MediaType MEDIA_TYPE = MediaType.parse(judgeType(pathName));
        //创建文件参数
        MultipartBody.Builder builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart(MEDIA_TYPE.type(), fileName,
                        RequestBody.create(MEDIA_TYPE, new File(pathName)));
        //发出请求参数
        Request request = new Request.Builder()
                .header("Authorization", "Client-ID " + "9199fdef135c122")
                .url(url)
                .post(builder.build())
                .build();
        Call call = getInstance().newCall(request);
        call.enqueue(callback);
    }

    /**
     * 根据文件路径判断MediaType
     *
     * @param path
     * @return
     */
    private static String judgeType(String path) {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String contentTypeFor = fileNameMap.getContentTypeFor(path);
        if (contentTypeFor == null) {
            contentTypeFor = "application/octet-stream";
        }
        return contentTypeFor;
    }

    /**
     * 下载文件
     * @param url
     * @param fileDir
     * @param fileName
     */
    public static void downFile(String url, final String fileDir, final String fileName) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = getInstance().newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                InputStream is = null;
                byte[] buf = new byte[2048];
                int len = 0;
                FileOutputStream fos = null;
                try {
                    is = response.body().byteStream();
                    File file = new File(fileDir, fileName);
                    fos = new FileOutputStream(file);
                    //---增加的代码-获取下载进度--
                    //计算进度
                    long totalSize = response.body().contentLength();
                    long sum = 0;
                    while ((len = is.read(buf)) != -1) {
                        sum += len;
                        //progress就是进度值
                        int progress = (int) (sum * 1.0f/totalSize * 100);
                        //---增加的代码---
                        fos.write(buf, 0, len);
                    }
                    fos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (is != null) is.close();
                    if (fos != null) fos.close();
                }
            }
        });
    }
}
