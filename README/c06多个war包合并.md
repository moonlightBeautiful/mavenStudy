maven webapp很大很大的时候，则拆分成几个小的maven webapp，最终合并到一个maven webapp中。
注意：这里如果待归并工程和归并主工程有同名文件，以主工程文件为主，待归并工程的同名文件会被覆盖，包括web.xml
1.需要被合并的项目须为：
    <packaging>war</packaging>
2.主web项目中需要引入被合并项目的依赖
    <dependencies>
      	<dependency>
      		<groupId>edu.cpu</groupId>
    	    <artifactId>base</artifactId>
    	    <version>0.0.1-SNAPSHOT</version>
    	    <type>war必须是war</type>
      	</dependency>
    </dependencies>
3.maven-war-plugin插件下配置覆盖
    <configuration>
        <overlays>
            <overlay>
                <!-- 需要归并的webapp的groupId和artifactId -->
                <groupId>edu.cpu</groupId>
                <artifactId>base</artifactId>
            </overlay>
        </overlays>
    </configuration>