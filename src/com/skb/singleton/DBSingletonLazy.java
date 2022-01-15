package com.skb.singleton;

public class DBSingletonLazy {

    // lazy initialization
    private static DBSingletonLazy ds = null;

    private DBSingletonLazy(){
    }

    public static DBSingletonLazy getDs() {
        // when require an object, only then create the object, if exists then return the existing
        if(ds == null){
            ds = new DBSingletonLazy();
        }
        return ds;
    }
}
