package com.mouse.autumn.basicioc.aop.match.controlflowmatch;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by Mahone Wu on 2018/7/26.   page:159
 */
public class Runner {

    public static void main(String[] args) {

        ControlFlowPointcut pointcut = new ControlFlowPointcut(TargetCaller.class);

        BeforeAdvice advice = new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println(target.getClass().getSimpleName()  + ":" +target.getClass().getName());
            }
        };

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(advice);


        ProxyFactory weaver  = new ProxyFactory();
        weaver.setTarget(new TargetObject());
        weaver.addAdvisor(advisor);

        Object proxyObject = weaver.getProxy();
        ((TargetObject) proxyObject).method1();


        System.out.println("---");

        TargetCaller caller = new TargetCaller();
        caller.setTargetObject(((TargetObject) proxyObject));
        caller.callMethod();






    }


}
