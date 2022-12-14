package com.creational.singleton.eager;

public class EagerSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInstance2 = EagerInitializedSingleton.getInstance();
        if(eagerInstance == eagerInstance2){
            System.out.println("The instance is the same");
        }
    }
}
