package com.exercises.chapters.generics.ex39;

import com.exercises.chapters.generics.ex3.TwoTuple;
import com.exercises.chapters.generics.ex37.Basic;
import com.exercises.chapters.generics.ex37.BasicImp;
import com.exercises.chapters.generics.ex37.Colored;
import com.exercises.chapters.generics.ex37.ColoredImpl;
import com.exercises.chapters.generics.ex37.SerialNumbered;
import com.exercises.chapters.generics.ex37.SerialNumberedImp;
import com.exercises.chapters.generics.ex37.TimeStamped;
import com.exercises.chapters.generics.ex37.TimeStampedImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import static com.exercises.chapters.generics.ex15_16.Tuple.tuple;

class MixinProxy implements InvocationHandler {
    Map<String, Object> delegatesByMethod;

    public MixinProxy(TwoTuple<Object, Class<?>>... pairs) {
        delegatesByMethod = new HashMap<>();

        for (TwoTuple<Object, Class<?>> pair : pairs) {
            for (Method method : pair.second.getMethods()) {
                String methodName = method.getName();
                delegatesByMethod.putIfAbsent(methodName, pair.first);
            }
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate, args);
    }

    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs) {
        Class<?>[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = (Class<?>) pairs[i].second;
        }
        ClassLoader cl = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
}

public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                tuple(new BasicImp(), Basic.class),
                tuple(new TimeStampedImp(), TimeStamped.class),
                tuple(new SerialNumberedImp(), SerialNumbered.class),
                tuple(new ColoredImpl("Black"), Colored.class));

        Basic b = (Basic) mixin;
        TimeStamped t = (TimeStamped) mixin;
        SerialNumbered s = (SerialNumbered) mixin;
        Colored c = (Colored) mixin;
        b.set("Hello");
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
        System.out.println(c.getColor());
        System.out.println();
    }
}
