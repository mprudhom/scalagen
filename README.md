## Swiftgen 

**Java to Swift conversion**

Swiftgen is an experimental Scala-based Java to Swift conversion tool.
It is based on https://github.com/mysema/scalagen, since Swift syntax
is very similar to Scala syntax.

It will parse and generate code for almost all Java sources, but
the resulting Swift code is almost guaranteed to not compile.
However, it could be useful as a starting point for seeing how Java
code might be ported to Swift.

Among the many, many language features that are not implemented are:

 * Exceptions, try/catch
 * synchronized blocks
 * Non-static & anonymous inner classes
 * Struct/enum generation
 * Swift protocol typealias generation from Java generic interfaces
 * All generated Java types are swift Optionals
 * Collections translations (e.g., HashMap to Dictionary)
 * Abstract Java classes
 * Lambda to closure translation

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
swiftc swiftgen/target/test/scala/io/glimpse/examples/Literal.swift
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

Which results in the following `Literal.swift` code:

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


