package com.cybage;

public class SingletonClass {

    private static SingletonClass sSoleInstance;

    private SingletonClass(){} 

    public static SingletonClass getInstance(){
        if (sSoleInstance == null){ 
            sSoleInstance = new SingletonClass();
        }

        return sSoleInstance;
    }
}