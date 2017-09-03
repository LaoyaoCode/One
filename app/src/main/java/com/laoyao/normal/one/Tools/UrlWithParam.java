package com.laoyao.normal.one.Tools;

import java.util.HashMap;

/**
 * Created by Laoyao on 2017/9/3.
 */

public class UrlWithParam
{
    /**
     * @param urlHeader url头
     * @param para 参数map
     * @return StringBulider 全部 url
     * test success , 2017.9.3
     */
    public static StringBuilder MakeUrl(String urlHeader , HashMap<String , String> para)
    {
        StringBuilder bulider = new StringBuilder(urlHeader + "/?") ;
        boolean isFirst = true ;

        for(String key : para.keySet())
        {
            if(isFirst)
            {
                isFirst = false ;
                bulider.append(key + "=" + para.get(key)) ;
            }
            else
            {
                bulider.append("&" + key + "=" + para.get(key)) ;
            }
        }

        return bulider ;
    }
}
