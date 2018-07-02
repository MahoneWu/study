package com.mouse.autumn.basicioc.bean.customEditorConfigure;

import java.util.Date;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/1
 */
public class Person {

    private String name;

    private Date birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
