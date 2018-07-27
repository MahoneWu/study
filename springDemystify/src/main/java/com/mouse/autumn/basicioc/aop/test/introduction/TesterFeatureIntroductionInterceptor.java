package com.mouse.autumn.basicioc.aop.test.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class TesterFeatureIntroductionInterceptor extends DelegatingIntroductionInterceptor implements ITester{


    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    @Override
    public boolean isBuyAsTester() {
        return false;
    }

    @Override
    public void testSoftware() {

    }
}
