#mavenStudy
一般情况下jar包都可以使用pom.xml来配置管理，但也有一些时候，我们项目中使用了一个内部jar文件，但是这个文件我们又没有开放到maven库中。
我们会将文件当到我们项目WEB-INF/lib中。
如果我们不对pom.xml进行特殊配置的话，maven打包时是不会自动去引用和编译pom以外的jar包，所以需要我们修改下pom.xml文件：
    <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
            <source>1.7</source>
            <target>1.7</target>
            <encoding>UTF-8</encoding>
            <compilerArguments>
                <extdirs>src\main\webapp\WEB-INF\lib</extdirs>
            </compilerArguments>
        </configuration>
    </plugin>

    