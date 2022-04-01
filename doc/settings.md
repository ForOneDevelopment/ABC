注意事项：

1.需要修改配置的文件：
1)generatorConfig.xml
2)application.properties

2.每次上传前确认项目能跑通

3.Mybatis Generator运行方法：
cd到generatorConfig.xml目录，执行命令
java -jar jar包路径/mybatis-generator-core-1.3.7.jar -configfile generatorConfig.xml
运行后文件会生成在mybatisGenerate目录下，拖拽到需要的目录下即可

