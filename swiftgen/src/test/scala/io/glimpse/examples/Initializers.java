package io.glimpse.examples;

public class Initializers {
    
    static final String staticValue;
    
    static {
        staticValue = "xx";
    }
    
    final String value;
    
    {
        value = "x";
    }

}
