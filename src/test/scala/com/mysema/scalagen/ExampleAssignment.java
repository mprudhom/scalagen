package com.mysema.scalagen;

public class ExampleAssignment {
    
//    def foo(j:Int):Unit = {
//      var i:Int = j
//      System.out.println({i = i + 1; i} > j)
//    }
    
    void foo(int j){
       int i = j;
       System.out.println((i = i + 1) > j);  
   }
}