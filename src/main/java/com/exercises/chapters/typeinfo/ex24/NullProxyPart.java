package com.exercises.chapters.typeinfo.ex24;

import com.exercises.chapters.typeinfo.ex13.Part;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NullProxyPart implements InvocationHandler {

    private NullPartProxied proxied = new NullPartProxied();
    private String name;

    public NullProxyPart(Class<? extends Part> type) {
        name = "Null " + type.getSimpleName();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }

    private class NullPartProxied implements IPart {
        @Override
        public String toString() {
            return name;
        }
    }
}
