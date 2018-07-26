package com.mouse.autumn.basicioc.aop.match.annnotionmatch;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

import java.lang.reflect.Method;

/**
 * @Title: Runner
 * @Package com.mouse.autumn.basicioc.aop.match.annnotionmatch
 * @Description: http://pengranxiang.iteye.com/blog/1630552
 * @author Mahone Wu
 * @date 2018/7/26 16:50
 * @version V1.0
 */
public class Runner {

    public static void main(String[] args) {
        AnnotationMatchingPointcut pointcut = new AnnotationMatchingPointcut(ClassLevlAnnotation.class,MethodLevelAnnotation.class);
//        AnnotationMatchingPointcut pointcut1 = AnnotationMatchingPointcut.forClassAnnotation(ClassLevlAnnotation.class);

        BeforeAdvice advice = new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {

                System.out.println(target.getClass().getSimpleName() + ":" +method.getName() + "---before logic");

            }
        };


        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(advice);


        ProxyFactory weaver = new ProxyFactory();
        weaver.setTarget(new GenericTargetObject());
        weaver.addAdvisor(advisor);


        Object proxyObject = weaver.getProxy();
        ((GenericTargetObject)proxyObject).gMethod1();
        ((GenericTargetObject)proxyObject).gMethod2();











    }

}
