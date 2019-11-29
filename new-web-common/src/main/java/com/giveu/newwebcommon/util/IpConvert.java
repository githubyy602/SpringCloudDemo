package com.giveu.newwebcommon.util;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/29 16:39
 * @description
 */
public class IpConvert extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        return IpUtil.getLocalAddress();
    }
}