package com.laoyao.normal.one.Tools;

import android.content.Context;
import android.content.res.AssetManager;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Laoyao on 2017/9/3.
 * Single Test Success 2017/9/3
 */

public class ConfigurationData
{
    private static final String ConfigurationXMLPath = "AppConfiguration/OneUrlData.xml" ;
    private static final String RootNodeTag = "One" ;
    private static String IdListHeader = null ;
    private static final String ILHNodeTag = "IdListHeader" ;


    public static boolean Init(Context context)
    {
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder bulider = factory.newDocumentBuilder();
            InputStream in =context.getAssets().open(ConfigurationXMLPath , AssetManager.ACCESS_STREAMING) ;
            Document doc = bulider.parse(in) ;
            Element root = doc.getDocumentElement();

            if((IdListHeader = GetSingleNodeText(root , ILHNodeTag)) == null )
            {
                return false ;
            }


            return true ;
        }
        catch (Exception e)
        {
            return false ;
        }

    }

    private static String GetSingleNodeText(Element father , String tag)
    {
        NodeList list = father.getElementsByTagName(tag) ;

        if(list.getLength() > 0)
        {
            return list.item(0).getTextContent() ;
        }
        else
        {
            return null ;
        }
    }

    public static String getIdListHeader() {
        return IdListHeader;
    }
}
