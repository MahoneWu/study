package com.mouse.autumn.basicioc.beanpostprocessor;

/**
 * Created by Mahone Wu on 2018/7/2.
 */
public interface PasswordDecodable {

    String getEncodedPassword();

    void setDecodedPassword(String password);

}
