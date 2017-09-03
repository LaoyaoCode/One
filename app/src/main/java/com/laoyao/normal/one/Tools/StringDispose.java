package com.laoyao.normal.one.Tools;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by Laoyao on 2017/9/2.
 */

public class StringDispose
{
    public static String getMacAddress(Context context) {
        String macAddress = null;
        try{
            String wifiInterfaceName = "wlan0";
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface iF = interfaces.nextElement();
                if(iF.getName().equalsIgnoreCase(wifiInterfaceName)) {
                    byte[] addr = iF.getHardwareAddress();
                    if (addr == null || addr.length == 0) {
                        return null;
                    }

                    StringBuilder buf = new StringBuilder();
                    for (byte b : addr) {
                        buf.append(String.format("%02X:", b));
                    }
                    if (buf.length() > 0) {
                        buf.deleteCharAt(buf.length() - 1);
                    }
                    macAddress =  buf.toString();
                    break;
                }
            }
        }catch (SocketException se){
            macAddress = null;
        }

        if(TextUtils.isEmpty(macAddress)){
            android.net.wifi.WifiManager wifi = (android.net.wifi.WifiManager) context.getSystemService(Context.WIFI_SERVICE);
            macAddress = wifi.getConnectionInfo().getMacAddress();
        }

        return macAddress;
    }
}
