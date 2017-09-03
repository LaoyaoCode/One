package com.laoyao.normal.one.NetWork;
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
    public static void GetIdList()
    {
        IdList recieveObject = null ;
        HashMap<String , String> para = new HashMap<>() ;
        String url = null ;

        para.put("channel" , "wdj") ;
        para.put("version" , "4.0.2") ;
        para.put("uuid" , SplashActivity.OneUUidValue) ;
        para.put("platform" , "android") ;

        url = UrlWithParam.MakeUrl(ConfigurationData.getIdListHeader() , para).toString() ;
    }
}
