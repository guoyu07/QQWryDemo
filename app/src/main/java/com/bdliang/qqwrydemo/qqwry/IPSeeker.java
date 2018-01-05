/*
 * Project: MicroProbe
 * 
 * File Created at 2017/10/30
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.bdliang.qqwrydemo.qqwry;

import com.bdliang.qqwrydemo.SysApplication;

/**
 * @author bd_liang
 * @Type IPSeeker.java
 * @Desc
 * @date 2017/10/30
 */

public class IPSeeker {


    /**
     * 获取运营商
     *
     * @param ipAddr
     * @return
     */
    public static String getISP(String ipAddr) {
        if (ipAddr == null || "".equals(ipAddr)) {
            return "";
        }
            IPZone ipZone = SysApplication.qqWry.findIP(ipAddr);
            return ipZone.getSubInfo();
    }

    /**
     * 获取ip所在地
     *
     * @param ipAddr
     * @return
     */
    public static String getLocation(String ipAddr) {
        if (ipAddr == null || "".equals(ipAddr)) {
            return "";
        }
        IPZone ipZone = SysApplication.qqWry.findIP(ipAddr);
        return ipZone.getMainInfo();
    }
}
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017/10/30 bd_liang creat
 */