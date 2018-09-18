package com.test.ssm.converter;

import com.test.ssm.util.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 *  日期转换器
 */
public class DateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        try{
            return DateUtil.parseDate(s,"yyyy-MM-dd");

        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }
}
