#mavenStudy
对maven一个简单的认识和简单的操作
1.hello
    1.简介：java的项目管理工具（项目对象模型）
    2.安装：
        1.下载，找个文件夹解压，需要jdk的支持，所以电脑上要安装jdk
        2.配置maven环境变量 
            M2_HOME   maven的安装目录
        3.测试是否安装成功：cmd下 mvn -version
        4.本地仓库位子改变：
            在maven的配置文settings.xml中<localRepository>E:/maven_repo</localRepository>指定
    3.在eclipse/idea中使用maven 
        1.eclipse中集成了maven，但是我们使用自己下载的。idea没有集成，只能使用自己下载的
            1.配置文件指向自己的maven的配置文件
            2.选中下载源码和文档
        2.实战：
            1.创建maven项目，可以选择使用骨架
            2.常用命令：
                1.compile：基本不用，工具可能会自动编译源码
                2.clean：清空target文件内容
                3.test：生成测试报告
                4.package：打包
                5.install：打包并安装到本地仓库
                    打包后在本地仓库的位置：groupId/artifactId/version/artifactId-version.packaging
        