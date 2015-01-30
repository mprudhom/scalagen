## Swiftgen 

**Java to Scala conversion**

Swiftgen is a Java to Scala conversion tool. It uses a Java based parser for Java sources and provides modular 
transformation of the AST to match Scala idioms. The resulting transformed AST is serialized into Scala format.

Here is a list of example Java sources which have been successfully converted by Swiftgen:
https://github.io.glimpse.swiftgen/tree/master/swiftgen/src/test/scala/io.glimpse.examples

Swiftgen has also been tested on our own projects such as Querydsl, RDFBean, Codegen and some customer projects.

### Usage

Swiftgen provides direct Maven support via a plugin. You can use it directly via the command line like this

    mvn io.glimpse.swiftgen:swiftgen-maven-plugin:0.2.2:main -DtargetFolder=target/scala
    
and for test sources

    mvn io.glimpse.swiftgen:swiftgen-maven-plugin:0.2.2:test -DtargetFolder=target/scala

Here is the snippet for an explicit configuration in a POM:

    <plugin>
      <groupId>io.glimpse.swiftgen</groupId>
      <artifactId>swiftgen-maven-plugin</artifactId>
      <version>0.2.2</version>
    </plugin>
    
To convert main sources run

    mvn swiftgen:main
    
and to convert test sources run 

    mvn swiftgen:test

The conversion results are to be seen as a starting point for the Java to Scala conversion. 
Some elements are not transformed correctly for various reasons and will need manual intervention.

### Development

Swiftgen development instructions are here https://github.io.glimpse.swiftgen/wiki/Swiftgen-development
