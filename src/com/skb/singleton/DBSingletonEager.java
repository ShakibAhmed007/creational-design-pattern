package com.skb.singleton;

public class DBSingletonEager {

    // eager initialization
    private static final DBSingletonEager ds = new DBSingletonEager();;

    private DBSingletonEager(){
    }

    public static DBSingletonEager getDs() {
        return ds;
    }
}
