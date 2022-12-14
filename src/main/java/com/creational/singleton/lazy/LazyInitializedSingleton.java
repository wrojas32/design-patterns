package com.creational.singleton.lazy;

/*
    This option is not thread-safe
 */

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton LAZY_INITIALIZED_SINGLETON;

    private LazyInitializedSingleton(){

    }

    public static LazyInitializedSingleton getInstance(){
        if(LAZY_INITIALIZED_SINGLETON == null){
            LAZY_INITIALIZED_SINGLETON = new LazyInitializedSingleton();
        }
        return LAZY_INITIALIZED_SINGLETON;
    }
}
