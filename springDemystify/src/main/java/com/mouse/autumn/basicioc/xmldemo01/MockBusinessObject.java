package com.mouse.autumn.basicioc.xmldemo01;

/**
 * Created by Mahone Wu on 2018/6/28.
 */
public class MockBusinessObject {

    private String dependency1;

    private int dependency2;

    public MockBusinessObject(String dependency1) {
        this.dependency1 = dependency1;
    }

    public MockBusinessObject(int dependency2) {
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MockBusinessObject{");
        sb.append("dependency1='").append(dependency1).append('\'');
        sb.append(", dependency2=").append(dependency2);
        sb.append('}');
        return sb.toString();
    }
}
