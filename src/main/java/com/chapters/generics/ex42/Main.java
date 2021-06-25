package com.chapters.generics.ex42;

import java.util.List;

import static com.chapters.generics.ex42.ModificationHelper.*;

public class Main {
    public static void main(String[] args) {
        List<Cache> cacheList = List.of(new Cache("ss"), new Cache("tt"), new Cache("yy"));
        List<Cookie> cookieList = List.of(new Cookie("QQ"), new Cookie("ZZ"), new Cookie("XX"));

        System.out.println(cacheList);
        System.out.println(cookieList);

        makeModifications(cacheList, CACHE_MODIFIER);
        makeModifications(cookieList, COOKIE_MODIFIER);

        System.out.println(cacheList);
        System.out.println(cookieList);

        makeModifications(cacheList.get(0), CACHE_MODIFIER);
        makeModifications(cookieList.get(0), COOKIE_MODIFIER);

        System.out.println(cacheList);
        System.out.println(cookieList);
    }
}

