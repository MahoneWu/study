package com.mouse.autumn.basicioc.scope;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class ThreadScope implements Scope {


    private final ThreadLocal threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new HashMap<>();
        }
    };

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {

       /* Object object  = objectFactory.getObject();*/
       Map scope = (Map)threadLocal.get();
       Object object = scope.get(name);
        if(null == object){
          object = objectFactory.getObject();
          scope.put(name, object);
        }
        return object;
    }

    @Override
    public Object remove(String name) {
        Map scope = (Map) threadLocal.get();
        return scope.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
