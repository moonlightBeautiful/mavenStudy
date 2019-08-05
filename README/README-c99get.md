#mavenStudy
1.一些资源文件，可能打包不进去。所以可以在build标签下添加：
    <resources>
        <!-- 如果不添加此节点mybatis的mapper.xml文件都会被漏掉。 -->
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
        </resource>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                 <include>**/*.properties</include>
                 <include>**/*.xml</include>
            </includes>
        </resource>
    </resources>
    