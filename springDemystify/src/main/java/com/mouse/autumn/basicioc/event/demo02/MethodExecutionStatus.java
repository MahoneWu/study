package com.mouse.autumn.basicioc.event.demo02;

/**
 * Created by Mahone Wu on 2018/7/18.
 */
public enum  MethodExecutionStatus {

    BEGIN("1","开始"),
    END("2", "结束");

    private String code;

    private String message;

    MethodExecutionStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
