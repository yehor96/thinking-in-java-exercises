package com.random.ex14;

public class Main {
    public static void main(String[] args) {
        var combined = new CombinedImpl();

        imp1(combined);
        imp2(combined);
        imp3(combined);
        imp4(combined);
        combined.method8();
        combined.method9();
    }

    static void imp1(First obj) {
        obj.method1();
        obj.method2();
    }

    static void imp2(Second obj) {
        obj.method3();
        obj.method4();
    }

    static void imp3(Third obj) {
        obj.method5();
        obj.method6();
    }

    static void imp4(Combined obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }
}
