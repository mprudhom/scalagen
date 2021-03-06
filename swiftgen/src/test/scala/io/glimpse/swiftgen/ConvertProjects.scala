/*
 * Copyright (C) 2011, Mysema Ltd
 * Copyright (C) 2015, glimpse.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.glimpse.swiftgen

import japa.parser.JavaParser
import japa.parser.ParseException
import japa.parser.ast.CompilationUnit
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.apache.commons.io.FileUtils

object ConvertProjects extends AbstractParserTest {
  
  def main(args: Array[String]) {
    val start = System.currentTimeMillis()
    //Converter.instance.convert(new File("../../quercus"), new File("target/quercus"))
    Converter.instance.convert(new File("../../../querydsl"), new File("target/querydsl"))        
    Converter.instance.convert(new File("../../codegen"), new File("target/codegen"))
    Converter.instance.convert(new File("../../webmin"), new File("target/webmin"))
    Converter.instance.convert(new File("../../../rdfbean"), new File("target/rdfbean"))
    val duration = System.currentTimeMillis() - start
    println("took " + (duration/1000) + "s")
  }
  
}
