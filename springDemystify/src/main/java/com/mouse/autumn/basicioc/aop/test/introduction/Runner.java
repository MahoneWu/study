package com.mouse.autumn.basicioc.aop.test.introduction;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;

/**
 * @Title: Runner
 * @Package com.mouse.autumn.basicioc.aop.test.introduction
 * @Description: page:162
 * per-class:该类型的advice的实列可以在目标对象类的所有实例之间共享。
 *
 * Before Advice所实现的横切逻辑将在相应的Joinpoint之前执行,在Before Advice执行完成之后，程序执行流程将从Joinpoint处继续执行，
 * 所以Before Advice通常不会打断程序的执行流程，但如果必要,也可以通过抛出相应的异常的形式中断程序流程。:MethodBeforeAdvice,
 *
 * ThrowsAdvice对应AOP概念中的AfterThrowingAdvice,通常用于系统中特定的异常情况进行监控，以统一的方式对所发生的异常进行处理，我们
 * 可以在一种称之为Fault Barrier的模式中使用它。
 *
 * AfterReturingAdvice,我们可以访问当前Joinpoint的方法返回值、方法、方法参数、以及所在的对象目标，只有在正常的情况下，AfterReturingAdvice
 * 才会执行,对于如果有需要方法成功执行后进行的横切逻辑，使用AfterReturingAdvice倒比较合适,AfterReturingAdvice可以访问到方法的返回值,但不可更改返回值
 *
 *
 * Around Advice,MethodInterceptor作为Around Advice神通广大,MethodInterceptor可以应用的场景那是相当的多,系统安全验证及检查、系统各处的性能检测、简单的
 * 日志记录以及系统附加行为的添加等
 *
 *
 * per-instance是会为不同的实例对象保存他们各自的状态以及相关逻辑。spring aop中，Introduction就是唯一的一种per-instance型Advice。
 * Introduction可以在不改动目标类定义的情况下,为目标类添加新的属性以及行为。
 *
 * DelegatingIntroductionInterceptor不会自己实现将要添加到目标对象上的新的逻辑行,而是委派给其他实现类，
 *
 * @author Mahone Wu
 * @date 2018/7/27 10:26
 * @version V1.0
 */
public class Runner {

    public static void main(String[] args) {
/*        ITester delegate = new Tester();
        DelegatingIntroductionInterceptor interceptor = new DelegatingIntroductionInterceptor(delegate);*/

        DelegatePerTargetObjectIntroductionInterceptor interceptor = new DelegatePerTargetObjectIntroductionInterceptor(Tester.class, ITester.class);

        ProxyFactory weaver  = new ProxyFactory();
        weaver.setTarget(new Developer());
        weaver.addAdvice(interceptor);

        Object proxyObject = weaver.getProxy();
        System.out.println("---" + proxyObject);
        ((ITester) proxyObject).testSoftware();

    }


}
