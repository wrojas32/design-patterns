package com.creational.singleton.eager;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton EAGER_INITIALIZED_SINGLETON = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return EAGER_INITIALIZED_SINGLETON;
    }
}
