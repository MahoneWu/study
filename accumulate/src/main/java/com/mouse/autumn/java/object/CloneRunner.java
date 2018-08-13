package com.mouse.autumn.java.object;

/**
* @Description:object的clone方法
* @ClassName:CloneRunner
* @author:Mahone Wu
* @date:2018/8/11 下午11:12
*/
public class CloneRunner {


    /**
     * Object的clone方法的克隆是浅拷贝，它拷贝的只是这个对象的一个引用，而这个引用仍然指向那个对象，
     * 当我们该改变这个引用的属性时候，原来对象也会跟着改变。
     * @param args
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.clone();

       /* CloneRunner cloneRunner = new CloneRunner();
        try {
            cloneRunner.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

    }

}
