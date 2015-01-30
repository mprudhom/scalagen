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
package com.mysema.scalagen;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * @phase generate-sources
 * @goal test
 *
 */
public class ScalagenTestMojo extends AbstractMojo {
    
    /**
    * @parameter expression="${project}" readonly=true required=true
    */
    private MavenProject project;

    /**
     * @parameter default-value="src/test/scala" expression="${targetFolder}"
     */
    private String targetFolder;
    
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        File in = new File(project.getBuild().getTestSourceDirectory());
        if (in.exists()) {
            File out = new File(targetFolder); 
            Converter.instance().convert(in, out);    
        } else {
            throw new MojoFailureException(in.getPath() + " doesn't exist");
        }
        
    }

}
