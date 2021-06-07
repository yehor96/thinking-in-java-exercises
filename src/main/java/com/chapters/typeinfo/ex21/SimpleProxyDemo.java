package com.chapters.typeinfo.ex21;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething"); }
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
class SimpleProxy implements Interface {
    private final Interface proxied;

    private static int doSomethingCalls = 0;
    private static int somethingElseCalls = 0;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        System.out.println("SimpleProxy doSomething calls = " + ++doSomethingCalls);
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse calls = " + ++somethingElseCalls);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
        consumer(new SimpleProxy(new RealObject()));
        consumer(new SimpleProxy(new RealObject()));
    }
}
