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

/**
 * @author bd_liang
 * @Type IPZone.java
 * @Desc
 * @date 2017/10/30
 */
public class IPZone {
    /**
     * ip address
     */
    private  String ip;
    /**
     * Ip location
     */
    private String mainInfo = "";
    /**
     * isp
     */
    private String subInfo = "";

    public IPZone( String ip) {
        this.ip = ip;
    }
    public String getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(final String info) {
        this.mainInfo = info;
    }

    public String getSubInfo() {
        return subInfo;
    }

    public void setSubInfo(final String info) {
        this.subInfo = info;
    }

    @Override
    public String toString() {
        return new StringBuilder(mainInfo).append(subInfo).toString();
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