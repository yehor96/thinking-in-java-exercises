package com.chapters.typeinfo.ex24;

import com.chapters.typeinfo.ex13.Part;

import java.lang.reflect.Proxy;

public class NullPartProvider {
    public static IPart newNullPart(Class<? extends Part> type) {
        return (IPart) Proxy.newProxyInstance(
                NullPartProvider.class.getClassLoader(),
                new Class[]{ IPart.class },
                new NullProxyPart(type));
    }
}
