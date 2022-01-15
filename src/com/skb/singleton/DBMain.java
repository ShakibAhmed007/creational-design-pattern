package com.skb.singleton;

public class DBMain {

    public static void main(String[] args){
        System.out.println(" ==== Singleton Example ==== ");

        // built in singleton
        Runtime rn = Runtime.getRuntime();
        rn.gc();
        System.out.println(rn);
        Runtime rn1 = Runtime.getRuntime();
        rn1.gc();
        System.out.println(rn1);


        // eager
        System.out.println(" ==== Eager Singleton Example ==== ");

        DBSingletonEager ds = DBSingletonEager.getDs();
        System.out.println(ds);

        DBSingletonEager ds1 = DBSingletonEager.getDs();
        System.out.println(ds1);

        // lazy
        System.out.println(" ==== Lazy Singleton Example ==== ");

        DBSingletonLazy dsl = DBSingletonLazy.getDs();
        System.out.println(dsl);

        DBSingletonLazy dsl1 = DBSingletonLazy.getDs();
        System.out.println(dsl1);

    }
}
