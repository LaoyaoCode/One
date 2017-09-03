package com.laoyao.normal.one;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.laoyao.normal.one.NetWork.OneJsonData;
import com.laoyao.normal.one.Tools.* ;

import org.w3c.dom.Text;
import com.laoyao.normal.one.Tools.* ;
import java.util.Random;

public class SplashActivity extends AppCompatActivity
{
    private static String AppConfigurationKey = null ;
    private static String OneUUidKey = null ;
    public static String OneUUidValue = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AppConfigurationKey = getString(R.string.app_configuration_key) ;
        OneUUidKey = getString(R.string.uuid_key) ;


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                SharedPreferences sp = getSharedPreferences(AppConfigurationKey  , MODE_PRIVATE) ;
                String uuid = sp.getString(OneUUidKey , null) ;

                //确认初始化了唯一UUId
                if(uuid == null)
                {
                    Random random = new Random() ;
                    StringBuilder unity = new StringBuilder() ;
                    String unityId = StringDispose.getMacAddress(SplashActivity.this) ;

                    unity.append("ffffffff-") ;
                    unity.append(MD5.md5(unityId + random.nextDouble()).substring(0 , 4) + "-") ;
                    unity.append(MD5.md5(unityId + random.nextDouble()).substring(0 , 4) + "-") ;
                    unity.append(MD5.md5(unityId + random.nextDouble()).substring(0 , 4) + "-") ;
                    unity.append(MD5.md5(unityId + random.nextDouble()).substring(0 , 12)) ;

                    SharedPreferences.Editor editor = sp.edit() ;
                    editor.putString(OneUUidKey , unity.toString()) ;

                    OneUUidValue = unity.toString() ;
                }
                //存在则直接赋值
                else
                {
                    OneUUidValue = uuid ;
                }

                //数据出现错误直接结束程序
                if(!ConfigurationData.Init(SplashActivity.this))
                {
                    Toast.makeText(SplashActivity.this ,
                            "Configuration Data Lost Or Broken" , Toast.LENGTH_LONG).show(); ;
                    finish();
                }

                OneJsonData.GetIdList();
            }
        }).start();
    }

    public static String getAppConfigurationKey()
    {
        return AppConfigurationKey;
    }

    public static String getOneUUidKey()
    {
        return OneUUidKey;
    }
}
