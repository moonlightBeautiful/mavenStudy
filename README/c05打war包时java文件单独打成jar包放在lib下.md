web项目打war包时java文件不在web-inf的classes下生成class文件，单独打成jar包放在lib下

1.第一种
<plugin>
    <artifactId>maven-war-plugin</artifactId>
    <version>3.2.2</version>
    <configuration>
        <archiveClasses>true</archiveClasses>
    </configuration>
</plugin>
2.第二种
<properties>
    <archiveClasses>true</archiveClasses>
</properties>