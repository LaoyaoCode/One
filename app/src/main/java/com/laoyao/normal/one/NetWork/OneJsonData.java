package com.laoyao.normal.one.NetWork;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import com.laoyao.normal.one.JsonDeserializer.OneListDeserializer;
import com.laoyao.normal.one.JsonModel.* ;
import com.laoyao.normal.one.SplashActivity;
import com.laoyao.normal.one.Tools.* ;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.* ;

import java.io.IOException;
import java.util.HashMap;

import okio.BufferedSink;

/**
 * Created by Laoyao on 2017/9/3.
 */

public class OneJsonData
{
    private static final String TAG = "OneJsonData";

    /**
     * test success , get object right , by laoyao  , 2017.9.4
     * @return 获得的json idlist反序列对象
     */
    public static IdList GetIdList()
    {
        IdList recieveObject = null ;
        HashMap<String , String> para = new HashMap<>() ;
        OkHttpClient client = new OkHttpClient() ;
        String url = null ;

        para.put("channel" , "wdj") ;
        para.put("version" , "4.0.2") ;
        para.put("uuid" , SplashActivity.OneUUidValue) ;
        para.put("platform" , "android") ;

        url = UrlWithParam.MakeUrl(ConfigurationData.getIdListHeader() , para).toString() ;
        Request request = new Request.Builder().url(url).build() ;

        MLog.v(TAG , "enter GetIdList OKHttp");
        try
        {
            Gson gson = new Gson() ;

            Response response = client.newCall(request).execute() ;
            //get success , by laoyao , 2017.9.4
            String jsonString = response.body().string() ;

            recieveObject = gson.fromJson(jsonString , IdList.class) ;

            MLog.v(TAG , jsonString);
            MLog.v(TAG , recieveObject.toString());

            return recieveObject ;
        }
        catch (IOException e)
        {
            return null ;
        }

    }

    /**
     *
     * @param data 作为特殊标示的数据
     * @return json反序列化之后的OneListObject
     * test success , by laoyao , 2017.9.4
     */
    public static OneList GetOneList(String data)
    {
        OneList recieveObject = null ;
        HashMap<String , String> para = new HashMap<>() ;
        OkHttpClient client = new OkHttpClient() ;
        String url = null ;

        para.put("channel" , "wdj") ;
        para.put("version" , "4.0.2") ;
        para.put("uuid" , SplashActivity.OneUUidValue) ;
        para.put("platform" , "android") ;

        url = UrlWithParam.MakeUrl(ConfigurationData.getOneListHeader()
                + "/" + data + "/0" , para).toString() ;
        Request request = new Request.Builder().url(url).build() ;

        MLog.v(TAG , "enter GetOneList OKHttp");
        MLog.v(TAG , url);

        try
        {
            Gson gson = new Gson() ;

            Response response = client.newCall(request).execute() ;
            //get success , by laoyao , 2017.9.4
            String jsonString = response.body().string() ;

            MLog.v(TAG , jsonString);

            recieveObject = gson.fromJson(jsonString , OneList.class) ;

            MLog.v(TAG , recieveObject.toString());

            return recieveObject ;
        }
        catch (IOException e)
        {
            return null ;
        }
    }
}
