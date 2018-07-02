package com.mouse.autumn.basicioc.bean.customEditorConfigure;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/1
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    private String datePattern = "yyyy-MM-dd";

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(getDatePattern());
        Date dateValue = dateTimeFormatter.parseDateTime(text).toDate();
        setValue(dateValue);
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
