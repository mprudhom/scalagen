package com.mysema.scalagen;

public class ExampleOperators {
    
//  def foo(j:Int):Int = {
//  var i:Int = j
//  return {val k = i; i = i + 1; k }
//}    
    
    int foo(int j){
        int i = j;
        return i++;
    }

}