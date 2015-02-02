## Swiftgen 

**Java to Swift conversion**

Swiftgen is a Scala-based Java to Swift conversion tool. It is based
on https://github.com/mysema/scalagen, since Swift syntax is very
similar to Scala.

It is almost guaranteed to generate uncompilable Swift code, but could
be useful as a starting point for seeing how Java code might be
portrayed in Swift. Among the many features that are not implemented at:

 * Exceptions, try/catch
 * synchronized blocks
 * Non-static inner classes
 * Struct/enum generation

### Example

Java 8 doesn't work, so if it is installed, you need to first
manually set your JAVA HOME:

```bash
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_17.jdk/Contents/Home
```

You can then run some tests and see the converted output:

```bash
mvn -f swiftgen/pom.xml test -Dtest=io.glimpse.swiftgen.ConverterTest
```

One example of a file that happens to compile can be seen with:

```bash
swiftc swiftgen/target/test2/scala/io/glimpse/examples/Literal.swift
```

The source `Literal.java` is:

```java
package io.glimpse.examples;


public class Literal {
    
    public void doSomething() {
        final String s = query("");
        System.out.println(s);
    }
    
    public void doSomething2() {
        System.out.println(query(""));
    }

    private String query(String string) {
        return null;
    }

}
```

With results in the following `Literal.swift` code:

```swift
public class Literal {

  public func doSomething(){
    let s = query("")
    println(s)
  }

  public func doSomething2(){
    println(query(""))
  }

  private func query(string: String?) -> String?{
    return nil
  }
}
```


