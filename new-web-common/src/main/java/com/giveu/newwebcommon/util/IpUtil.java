package com.giveu.newwebcommon.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/29 16:36
 * @description
 */
public class IpUtil {

    public static String getLocalAddress() {
        String la = "127.0.0.1";

        try {
            InetAddress localAddr = InetAddress.getLocalHost();
            if (!localAddr.isLoopbackAddress() && !localAddr.isLinkLocalAddress() && localAddr.isSiteLocalAddress()) {
                la = localAddr.getHostAddress();
                return la;
            }

            Enumeration n = NetworkInterface.getNetworkInterfaces();

            while(n.hasMoreElements()) {
                NetworkInterface e = (NetworkInterface)n.nextElement();
                Enumeration a = e.getInetAddresses();

                while(a.hasMoreElements()) {
                    InetAddress addr = (InetAddress)a.nextElement();
                    if (!addr.isLoopbackAddress() && !addr.isLinkLocalAddress() && addr.isSiteLocalAddress()) {
                        la = addr.getHostAddress();
                        return la;
                    }
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return la;
    }

}