package com.chapters.generics.ex42;

import java.util.Collection;

public class ModificationHelper {
    public static final UnaryModifier<Cache> CACHE_MODIFIER = Cache::update;
    public static final UnaryModifier<Cookie> COOKIE_MODIFIER = Cookie::modify;

    public static <T> void makeModifications(Collection<T> col, UnaryModifier<T> func) {
        col.forEach(func::modify);
    }

    public static <T> void makeModifications(T item, UnaryModifier<T> func) {
        func.modify(item);
    }

    interface UnaryModifier<T> {
        void modify(T x);
    }
}
