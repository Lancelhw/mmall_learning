package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.Date;

//使用joda-time进行转换
public class DateTimeUtil {

    public static final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";

    //String-->Date(dateTimeStr:时间字符串，formatStr：时间格式）
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(formatStr);
        DateTime dateTime=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    /*使用自定义的STANDARD_FORMAT*/
    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }


    //Data-->String(date:时间日期,formatStr：时间格式)
    public static String dateToStr(Date date,String formatStr){
        if (date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(formatStr);
    }

    /*使用自定义的STANDARD_FORMAT*/
    public static String dateToStr(Date date){
        if (date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }


    /*public static void main(String[] args) {
        *//*at Jul 11 14:12:13 CST 2020*//*
        System.out.println(DateTimeUtil.strToDate("2020-07-11 14:12:13","yyyy-MM-dd HH:mm:ss"));
        *//*2020-07-11 14:13:23*//*
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }*/
}
