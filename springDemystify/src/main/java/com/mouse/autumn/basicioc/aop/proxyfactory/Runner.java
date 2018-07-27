package com.mouse.autumn.basicioc.aop.proxyfactory;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Runner {


    public static void main(String[] args) {


        MockTask task = new MockTask();
        ProxyFactory weaver = new ProxyFactory(task);
        weaver.setInterfaces(new Class[]{ITask.class});

        //强制走基于类的代理
        weaver.setProxyTargetClass(true);
        //也强制基于类的代理
        weaver.setOptimize(true);


        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMethodInterceptor());
        weaver.addAdvisor(advisor);
        ITask proxyObject = (ITask) weaver.getProxy();
        proxyObject.execute();

    }



}
