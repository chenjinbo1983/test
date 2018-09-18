package com.test.ssm.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	public static final String FORMAT_1 = "yyyyMMdd";
	
	/**
	 * 得到前一天
	 * @param date
	 * @return
	 */
	public static Calendar getLastDay(Date date) {
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,-1);
        return c;
	}
	
	/**
	 * 输入间隔天数，得到新的日期
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date getNewDate(Date date,int days) {
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,days);
        return c.getTime();
	}
	
	/**
	 * 得到前一天开始时间
	 * @param date
	 * @return
	 */
	public static Date getLastDayBegin(Date date) {
		Calendar c = DateUtil.getLastDay(date);
		return DateUtil.getDayBegin(c.getTime());
	}
	
	/**
	 * 得到前一天结束时间
	 * @param date
	 * @return
	 */
	public static Date getLastDayEnd(Date date) {
		Calendar c = DateUtil.getLastDay(date);
		return DateUtil.getDayEnd(c.getTime());
	}
	
	/**
	 * 得到date的开始时间
	 * @param date
	 * @return
	 */
	public static Date getDayBegin(Date date) {
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.AM_PM, Calendar.AM);
        c.set(Calendar.HOUR, 00);
        c.set(Calendar.MINUTE, 00);
        c.set(Calendar.SECOND, 00);
        c.set(Calendar.MILLISECOND, 000);
        return c.getTime();
	}
	
	/**
	 * 得到date的结束时间
	 * @param date
	 * @return
	 */
	public static Date getDayEnd(Date date) {
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
	}
	public static String format(Date date) {
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return f.format(date);
	}
	
	public static String format(Date date,String format) {
		DateFormat f = new SimpleDateFormat(format);
		return f.format(date);
	}
	
	public static int getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH )+1;
		return month;
	}
	
	public static int getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		return year;
	}
	//需要注意的是：月份是从0开始的，比如说如果输入5的话，实际上显示的是4月份的最后一天，千万不要搞错了哦
	public static Date getLastDayOfMonth(int year, int month) {  
		month = month - 1;
		Calendar cal = Calendar.getInstance();   
     	cal.set(Calendar.YEAR, year);   
     	cal.set(Calendar.MONTH, month);   
     	cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DATE));
     	cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
     	return cal.getTime();
	} 
	public static Date getFirstDayOfMonth(int year, int month) {   
		month = month - 1;
		Calendar cal = Calendar.getInstance();   
		cal.set(Calendar.YEAR, year);   
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH,cal.getMinimum(Calendar.DATE));
		cal.set(Calendar.HOUR_OF_DAY, 00);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
     	return cal.getTime();
	}

	public static Date parseDate(String date,String format)throws Exception{
		return new SimpleDateFormat(format).parse(date);
	}
		
}
