package com.creational.singleton.staticblock;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton staticBlockSingleton;
    static {
        staticBlockSingleton = new StaticBlockSingleton();
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton  getInstance(){
        return staticBlockSingleton;
    }
}
