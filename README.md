#mavenStudy
对maven的一个基本的学习：推荐maven实战这本书，国内写的最好的
    1.maven的
        简介：项目对象模型(POM)，项目管理工具。
        基本使用：依赖于jdk
            下载解压，配置maven环境变量
                MAVEN_HOME=maven解压目录
                Path中添加 %MAVEN_HOME%\bin
                cmd，输入 mvn -version
        本地仓库
        基本命令   
    2.maven的核心
        仓库
            远程仓库在：maven-model-builder-3.5.4.jar的org/apache/maven/model/pom-4.0.0.xml
            本地仓库在：自己指定配置文件中的localRepository
        依赖特性：
            最短路径原则+最先声明原则
        聚合特性：统一maven命令操作模块
            <modules>
                <module>user-dao</module>
                <module>user-service</module>
                <module>user-web</module>
                <module>user-scopeTest</module>
            </modules>
        继承特性：需要父pom
            建一个项目，packing形式为pom，其他模块pom继承这个pom
            可以继承的pom标签
                properties: 自定义的maven属性
                dependencies: 项目的依赖配置
                dependencyManagement: 项目的依赖管理配置
                repositories: 项目的仓库配置
        依赖范围：
            classPath：编译、测试、运行
            scope:
                compile：编译范围，默认值，在编译（编译包）、测试（测试包）、运行（运行包）都有效。
                test：测试有效。
                provided：编译、测试有效，不会打进运行包里面去。例如servlet-api，tomcat已经有了，如果运行有效则会冲突。
                system：系统依赖范围。
                import：导入依赖范围。
        生命周期:
            1.清理生命周期（Clean Lifecycle）：在开始真正的项目构建之前进行一些清理工作。
            2.默认生命周期（Default Lifecycle）：构建项目的核心部分，包括编译、测试、打包、部署等。          
            3.站点生命周期（Site Lifecycle）：生成项目报告、站点，发布站点。
            在同一套生命周期中运行任何一个阶段的时候，它前面的所有阶段都会被执行就行了。这就是为什么当我们运行mvn install命令的时候，代码会被编译（compile）、测试（test）和打包（package）。
        插件配置：
            